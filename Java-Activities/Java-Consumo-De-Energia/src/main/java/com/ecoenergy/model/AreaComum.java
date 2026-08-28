package com.ecoenergy.model;

import java.util.ArrayList;

public class AreaComum {
    private String nome;
    private String descricao;
    private ArrayList<Equipamento> equipamentos;

    public AreaComum() {
        this.equipamentos = new ArrayList<>();
    }

    public AreaComum(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.equipamentos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<Equipamento> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(ArrayList<Equipamento> equipamentos) {
        this.equipamentos = equipamentos;
    }

    public void adicionarEquipamento(Equipamento equipamento) {
        equipamentos.add(equipamento);
    }

    public boolean removerEquipamento(String nomeEquipamento) {
        for (int i = 0; i < equipamentos.size(); i++) {
            if (equipamentos.get(i).getNome().equals(nomeEquipamento)) {
                equipamentos.remove(i);
                return true;
            }
        }
        return false;
    }

    public int quantidadeEquipamentos() {
        return equipamentos.size();
    }

    public double calcularConsumoTotalDiarioKWh() {
        double total = 0;
        for (Equipamento equipamento : equipamentos) {
            total += equipamento.calcularConsumoDiarioKWh();
        }
        return total;
    }

    public double calcularConsumoTotalMensalKWh() {
        double total = 0;
        for (Equipamento equipamento : equipamentos) {
            total += equipamento.calcularConsumoMensalKWh();
        }
        return total;
    }

    @Override
    public String toString() {
        return "AreaComum{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", quantidadeEquipamentos=" + quantidadeEquipamentos() +
                '}';
    }
}
