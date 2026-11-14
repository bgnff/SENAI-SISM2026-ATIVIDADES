namespace Lista07_While_DoWhile;

// Classe base: reúne os dados comuns e deixa a execução para as classes filhas.
internal abstract class Atividade
{
    // As propriedades com get podem ser lidas; seus valores são definidos no construtor.
    public string Letra { get; }
    public string Titulo { get; }
    public string Enunciado { get; }
    public string Estrutura { get; }

    // O construtor recebe os dados enviados pelas classes filhas por base(...).
    protected Atividade(string letra, string titulo, string enunciado, string estrutura)
    {
        Letra = letra;
        Titulo = titulo;
        Enunciado = enunciado;
        Estrutura = estrutura;
    }

    public void Apresentar()
    {
        Console.Clear();
        Console.WriteLine($"\nAtividade {Letra}) {Titulo} — {Estrutura}");
        Console.WriteLine($"Enunciado: {Enunciado}\n");
        Console.WriteLine(Estrutura == "while"
            ? "while testa a condição antes: o bloco pode não executar nenhuma vez."
            : "do while testa a condição depois: o bloco executa pelo menos uma vez.");
        Console.WriteLine();
        // Polimorfismo: executa a versão definida pela atividade escolhida.
        Executar();
    }

    // Cada classe filha deve implementar este método com override.
    protected abstract void Executar();
}
