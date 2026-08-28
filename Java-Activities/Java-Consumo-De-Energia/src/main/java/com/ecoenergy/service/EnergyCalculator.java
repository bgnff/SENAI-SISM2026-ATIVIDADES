package com.ecoenergy.service;

import com.ecoenergy.model.AreaComum;
import com.ecoenergy.model.Equipamento;
import java.util.ArrayList;

public class EnergyCalculator {
    private static final double PRECO_KWH = 0.90;
    private ArrayList<AreaComum> areas;

    public EnergyCalculator() {
        this.areas = new ArrayList<>();
    }

    public void adicionarArea(AreaComum area) {
        areas.add(area);
    }

    public boolean removerArea(String nomeArea) {
        for (int i = 0; i < areas.size(); i++) {
            if (areas.get(i).getNome().equals(nomeArea)) {
                areas.remove(i);
                return true;
            }
        }
        return false;
    }

    public AreaComum buscarArea(String nomeArea) {
        for (AreaComum area : areas) {
            if (area.getNome().equals(nomeArea)) {
                return area;
            }
        }
        return null;
    }

    public ArrayList<AreaComum> getAreas() {
        return areas;
    }

    public int quantidadeAreas() {
        return areas.size();
    }

    public double calcularConsumoTotalDiario() {
        double total = 0;
        for (AreaComum area : areas) {
            total += area.calcularConsumoTotalDiarioKWh();
        }
        return total;
    }

    public double calcularConsumoTotalMensal() {
        double total = 0;
        for (AreaComum area : areas) {
            total += area.calcularConsumoTotalMensalKWh();
        }
        return total;
    }

    public double calcularCustoMensal() {
        return calcularConsumoTotalMensal() * PRECO_KWH;
    }

    public double calcularCustoAnual() {
        return calcularCustoMensal() * 12;
    }

    public String classificarConsumo(double consumoKWh) {
        if (consumoKWh < 10) {
            return "BAIXO";
        } else if (consumoKWh < 50) {
            return "MEDIO";
        } else if (consumoKWh < 100) {
            return "ALTO";
        } else {
            return "MUITO ALTO";
        }
    }

    public String getSustentabilidade(double consumoKWh) {
        String classificacao = classificarConsumo(consumoKWh);
        switch (classificacao) {
            case "BAIXO":
                return "EXCELENTE - Práticas sustentáveis muito bem aplicadas!";
            case "MEDIO":
                return "BOM - Há espaço para melhorias sustentáveis.";
            case "ALTO":
                return "ATENÇÃO - Consumo elevado, reveja equipamentos.";
            case "MUITO ALTO":
                return "CRÍTICO - Ações imediatas necessárias para redução.";
            default:
                return "INDEFINIDO";
        }
    }

    public double calcularEconomiaPotencial(int reducaoHoras) {
        double economia = 0;
        for (AreaComum area : areas) {
            for (Equipamento equipamento : area.getEquipamentos()) {
                double economiaEquipamento = (equipamento.getPotenciaWatts() * reducaoHoras) / 1000;
                economia += economiaEquipamento * 30;
            }
        }
        return economia;
    }

    public double calcularEconomiaFinanceira(double economiaKWh) {
        return economiaKWh * PRECO_KWH;
    }

    public String gerarRelatorioGeral() {
        StringBuilder relatorio = new StringBuilder();
        relatorio.append("=== RELATÓRIO GERAL DE CONSUMO ===\n\n");
        relatorio.append("Total de Áreas: ").append(quantidadeAreas()).append("\n");
        relatorio.append("Consumo Diário Total: ").append(String.format("%.2f", calcularConsumoTotalDiario())).append(" kWh\n");
        relatorio.append("Consumo Mensal Total: ").append(String.format("%.2f", calcularConsumoTotalMensal())).append(" kWh\n");
        relatorio.append("Custo Mensal Estimado: R$ ").append(String.format("%.2f", calcularCustoMensal())).append("\n");
        relatorio.append("Custo Anual Estimado: R$ ").append(String.format("%.2f", calcularCustoAnual())).append("\n");
        relatorio.append("\nClassificação do Consumo: ").append(classificarConsumo(calcularConsumoTotalMensal())).append("\n");
        relatorio.append("Nível de Sustentabilidade: ").append(getSustentabilidade(calcularConsumoTotalMensal())).append("\n");
        return relatorio.toString();
    }

    public String gerarRelatorioPorArea(String nomeArea) {
        AreaComum area = buscarArea(nomeArea);
        if (area == null) {
            return "Área não encontrada!";
        }

        StringBuilder relatorio = new StringBuilder();
        relatorio.append("=== RELATÓRIO DA ÁREA: ").append(area.getNome()).append(" ===\n\n");
        relatorio.append("Descrição: ").append(area.getDescricao()).append("\n");
        relatorio.append("Quantidade de Equipamentos: ").append(area.quantidadeEquipamentos()).append("\n");
        relatorio.append("Consumo Diário: ").append(String.format("%.2f", area.calcularConsumoTotalDiarioKWh())).append(" kWh\n");
        relatorio.append("Consumo Mensal: ").append(String.format("%.2f", area.calcularConsumoTotalMensalKWh())).append(" kWh\n");
        relatorio.append("Custo Mensal: R$ ").append(String.format("%.2f", area.calcularConsumoTotalMensalKWh() * PRECO_KWH)).append("\n");
        relatorio.append("\n--- EQUIPAMENTOS ---\n");

        int contador = 1;
        for (Equipamento equipamento : area.getEquipamentos()) {
            relatorio.append(contador).append(". ").append(equipamento.getNome()).append("\n");
            relatorio.append("   Tipo: ").append(equipamento.getTipo()).append("\n");
            relatorio.append("   Potência: ").append(equipamento.getPotenciaWatts()).append(" W\n");
            relatorio.append("   Horas de Uso: ").append(equipamento.getHorasUsoDiario()).append(" h/dia\n");
            relatorio.append("   Consumo Diário: ").append(String.format("%.2f", equipamento.calcularConsumoDiarioKWh())).append(" kWh\n");
            relatorio.append("   Consumo Mensal: ").append(String.format("%.2f", equipamento.calcularConsumoMensalKWh())).append(" kWh\n\n");
            contador++;
        }

        return relatorio.toString();
    }

    public ArrayList<String> listarTodasAreas() {
        ArrayList<String> nomes = new ArrayList<>();
        for (AreaComum area : areas) {
            nomes.add(area.getNome());
        }
        return nomes;
    }

    public ArrayList<String> listarEquipamentosPorArea(String nomeArea) {
        ArrayList<String> nomes = new ArrayList<>();
        AreaComum area = buscarArea(nomeArea);
        if (area != null) {
            for (Equipamento equipamento : area.getEquipamentos()) {
                nomes.add(equipamento.getNome());
            }
        }
        return nomes;
    }
}
