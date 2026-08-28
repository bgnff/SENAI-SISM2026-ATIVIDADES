package model;

public class Equipamento {
    public String id;
    public String nome;
    public String tipo;
    public double potencia;
    public int quantidade;
    public int horasUso;
    public int diasUso;
    public double consumoMensal;
    public String ambienteId;
    
    public Equipamento() {
        this.id = "";
        this.nome = "";
        this.tipo = "";
        this.potencia = 0;
        this.quantidade = 0;
        this.horasUso = 0;
        this.diasUso = 0;
        this.consumoMensal = 0;
        this.ambienteId = "";
    }
    
    public Equipamento(String nome, String tipo, double potencia, int quantidade, int horasUso, int diasUso) {
        this();
        this.id = String.valueOf(System.currentTimeMillis());
        this.nome = nome;
        this.tipo = tipo;
        this.potencia = potencia;
        this.quantidade = quantidade;
        this.horasUso = horasUso;
        this.diasUso = diasUso;
        this.consumoMensal = calcularConsumo();
    }
    
    public Equipamento(String nome, String tipo, double potencia, int quantidade, int horasUso, int diasUso, String ambienteId) {
        this(nome, tipo, potencia, quantidade, horasUso, diasUso);
        this.ambienteId = ambienteId;
    }
    
    public double calcularConsumo() {
        double resultado = (potencia * horasUso * diasUso * quantidade) / 1000;
        this.consumoMensal = resultado;
        return resultado;
    }
    
    public String toString() {
        return nome + " - " + tipo + " - " + consumoMensal + " kWh";
    }
}
