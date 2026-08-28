package com.ecoenergy.model;

public class Equipamento {
    private String nome;
    private double potenciaWatts;
    private int horasUsoDiario;
    private String tipo;

    public Equipamento() {
    }

    public Equipamento(String nome, double potenciaWatts, int horasUsoDiario, String tipo) {
        this.nome = nome;
        this.potenciaWatts = potenciaWatts;
        this.horasUsoDiario = horasUsoDiario;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPotenciaWatts() {
        return potenciaWatts;
    }

    public void setPotenciaWatts(double potenciaWatts) {
        this.potenciaWatts = potenciaWatts;
    }

    public int getHorasUsoDiario() {
        return horasUsoDiario;
    }

    public void setHorasUsoDiario(int horasUsoDiario) {
        this.horasUsoDiario = horasUsoDiario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double calcularConsumoDiarioKWh() {
        return (potenciaWatts * horasUsoDiario) / 1000;
    }

    public double calcularConsumoMensalKWh() {
        return calcularConsumoDiarioKWh() * 30;
    }

    @Override
    public String toString() {
        return "Equipamento{" +
                "nome='" + nome + '\'' +
                ", potenciaWatts=" + potenciaWatts +
                ", horasUsoDiario=" + horasUsoDiario +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
