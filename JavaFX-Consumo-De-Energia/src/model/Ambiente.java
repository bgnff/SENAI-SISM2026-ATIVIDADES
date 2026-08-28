package model;

// Classe para representar um ambiente (Biblioteca, Cantina, etc.)
// Atributos públicos para facilitar o acesso (sem encapsulamento)
public class Ambiente {
    
    // Atributos do ambiente
    public String id;
    public String nome;
    public String descricao;
    public String icone;
    public String categoria;
    
    // Construtor padrão
    public Ambiente() {
        this.id = "";
        this.nome = "";
        this.descricao = "";
        this.icone = "🏢";
        this.categoria = "Geral";
    }
    
    // Construtor com parâmetros
    public Ambiente(String id, String nome, String descricao, String icone, String categoria) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.icone = icone;
        this.categoria = categoria;
    }
    
    // Construtor simplificado
    public Ambiente(String nome, String descricao) {
        this();
        this.id = String.valueOf(System.currentTimeMillis());
        this.nome = nome;
        this.descricao = descricao;
    }
    
    // Método para retornar informações do ambiente
    public String toString() {
        return icone + " " + nome;
    }
}
