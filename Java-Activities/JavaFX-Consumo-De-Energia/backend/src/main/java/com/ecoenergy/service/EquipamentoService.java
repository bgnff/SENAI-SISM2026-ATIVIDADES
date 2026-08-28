package com.ecoenergy.service;

import com.ecoenergy.model.Equipamento;
import com.ecoenergy.repository.EquipamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class EquipamentoService {

    private final EquipamentoRepository equipamentoRepository;

    public List<Equipamento> listarTodos() {
        return equipamentoRepository.findAll();
    }

    public List<Equipamento> listarPorAmbiente(Long ambienteId) {
        return equipamentoRepository.findByAmbienteId(ambienteId);
    }

    public Optional<Equipamento> buscarPorId(Long id) {
        return equipamentoRepository.findById(id);
    }

    public Equipamento salvar(Equipamento equipamento) {
        return equipamentoRepository.save(equipamento);
    }

    public Equipamento atualizar(Long id, Equipamento equipamento) {
        Equipamento existente = equipamentoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Equipamento não encontrado"));
        
        existente.setNome(equipamento.getNome());
        existente.setTipo(equipamento.getTipo());
        existente.setPotencia(equipamento.getPotencia());
        existente.setQuantidade(equipamento.getQuantidade());
        existente.setHorasUso(equipamento.getHorasUso());
        existente.setDiasUso(equipamento.getDiasUso());
        existente.setAmbienteId(equipamento.getAmbienteId());
        
        return equipamentoRepository.save(existente);
    }

    public void deletar(Long id) {
        if (!equipamentoRepository.existsById(id)) {
            throw new RuntimeException("Equipamento não encontrado");
        }
        equipamentoRepository.deleteById(id);
    }

    public Double calcularConsumoTotal() {
        return equipamentoRepository.findAll().stream()
                .mapToDouble(eq -> eq.getConsumoMensal() != null ? eq.getConsumoMensal() : 0.0)
                .sum();
    }

    public Long contarPorTipo(String tipo) {
        return equipamentoRepository.findByTipo(tipo).stream()
                .mapToLong(Equipamento::getQuantidade)
                .sum();
    }
}
