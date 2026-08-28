package com.ecoenergy.controller;

import com.ecoenergy.model.Ambiente;
import com.ecoenergy.model.Equipamento;
import com.ecoenergy.service.AiSugestaoService;
import com.ecoenergy.service.AmbienteService;
import com.ecoenergy.service.EquipamentoService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/dashboard")
@RequiredArgsConstructor
@CrossOrigin(origins = {"http://localhost:3000", "http://localhost:5173"})
public class DashboardController {

    private final EquipamentoService equipamentoService;
    private final AmbienteService ambienteService;
    private final AiSugestaoService aiSugestaoService;

    @GetMapping
    public ResponseEntity<DashboardData> getDashboardData() {
        List<Equipamento> equipamentos = equipamentoService.listarTodos();
        List<Ambiente> ambientes = ambienteService.listarTodos();
        
        Double consumoTotal = equipamentoService.calcularConsumoTotal();
        Double valorKwh = 0.90;
        Double valorEstimado = consumoTotal * valorKwh;
        Double economiaPossivel = consumoTotal * 0.20;
        
        DashboardData data = new DashboardData();
        data.setConsumoTotal(consumoTotal);
        data.setValorEstimado(valorEstimado);
        data.setEconomiaPossivel(economiaPossivel);
        data.setQuantidadeEquipamentos(equipamentos.size());
        data.setQuantidadeAmbientes(ambientes.size());
        
        return ResponseEntity.ok(data);
    }

    @GetMapping("/consumo-por-ambiente")
    public ResponseEntity<List<Map<String, Object>>> getConsumoPorAmbiente() {
        List<Ambiente> ambientes = ambienteService.listarTodos();
        List<Map<String, Object>> dados = new java.util.ArrayList<>();
        
        for (Ambiente ambiente : ambientes) {
            List<Equipamento> equipamentos = equipamentoService.listarPorAmbiente(ambiente.getId());
            Double consumoAmbiente = equipamentos.stream()
                    .mapToDouble(eq -> eq.getConsumoMensal() != null ? eq.getConsumoMensal() : 0.0)
                    .sum();
            
            Map<String, Object> item = new HashMap<>();
            item.put("nome", ambiente.getNome());
            item.put("consumo", consumoAmbiente);
            dados.add(item);
        }
        
        return ResponseEntity.ok(dados);
    }

    @GetMapping("/consumo-por-tipo")
    public ResponseEntity<List<Map<String, Object>>> getConsumoPorTipo() {
        List<Equipamento> equipamentos = equipamentoService.listarTodos();
        Map<String, Double> consumoPorTipo = new HashMap<>();
        
        for (Equipamento eq : equipamentos) {
            consumoPorTipo.merge(eq.getTipo(), eq.getConsumoMensal() != null ? eq.getConsumoMensal() : 0.0, Double::sum);
        }
        
        List<Map<String, Object>> dados = new java.util.ArrayList<>();
        for (Map.Entry<String, Double> entry : consumoPorTipo.entrySet()) {
            Map<String, Object> item = new HashMap<>();
            item.put("tipo", entry.getKey());
            item.put("consumo", entry.getValue());
            dados.add(item);
        }
        
        return ResponseEntity.ok(dados);
    }

    @PostMapping("/sugestao-ia")
    public ResponseEntity<String> gerarSugestao(@RequestBody Map<String, Long> request) {
        Long ambienteId = request.get("ambienteId");
        
        if (ambienteId == null) {
            return ResponseEntity.badRequest().body("ID do ambiente é obrigatório");
        }
        
        Ambiente ambiente = ambienteService.buscarPorId(ambienteId)
                .orElse(null);
        
        if (ambiente == null) {
            return ResponseEntity.notFound().build();
        }
        
        List<Equipamento> equipamentos = equipamentoService.listarPorAmbiente(ambienteId);
        
        StringBuilder dadosAmbiente = new StringBuilder();
        dadosAmbiente.append("Ambiente: ").append(ambiente.getNome());
        
        if (ambiente.getDescricao() != null && !ambiente.getDescricao().isEmpty()) {
            dadosAmbiente.append(" (").append(ambiente.getDescricao()).append(")");
        }
        
        dadosAmbiente.append(". Equipamentos: ");
        
        if (equipamentos.isEmpty()) {
            dadosAmbiente.append("nenhum equipamento cadastrado");
        } else {
            for (int i = 0; i < equipamentos.size(); i++) {
                if (i > 0) dadosAmbiente.append(", ");
                Equipamento eq = equipamentos.get(i);
                dadosAmbiente.append(eq.getQuantidade()).append(" ").append(eq.getTipo())
                        .append(" (").append(eq.getPotencia()).append("W, ").append(eq.getHorasUso()).append("h/dia)");
            }
        }
        
        String sugestao = aiSugestaoService.gerarSugestao(dadosAmbiente.toString());
        return ResponseEntity.ok(sugestao);
    }

    @GetMapping("/api-configurada")
    public ResponseEntity<Boolean> isApiConfigurada() {
        return ResponseEntity.ok(aiSugestaoService.isApiConfigurada());
    }

    @Data
    public static class DashboardData {
        private Double consumoTotal;
        private Double valorEstimado;
        private Double economiaPossivel;
        private Integer quantidadeEquipamentos;
        private Integer quantidadeAmbientes;
    }
}
