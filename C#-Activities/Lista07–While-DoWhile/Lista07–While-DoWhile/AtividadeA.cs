using System.Numerics;

namespace Lista07_While_DoWhile;

// Herança: AtividadeA aproveita os dados e a apresentação da classe Atividade.
internal sealed class AtividadeA : Atividade
{
    // base(...) chama o construtor da classe mãe para preencher os dados do exercício.
    public AtividadeA() : base("a", "Números pares",
        "Crie um programa que solicite ao usuário para inserir um número inteiro positivo e, em seguida, exiba todos os números pares entre 0 e o número inserido.", "while") { }

    // override define a lógica específica deste exercício.
    protected override void Executar()
    {
        int limite = Entrada.Inteiro("Digite um inteiro positivo: ", 1);
        long par = 0;
        Console.WriteLine($"Pares entre 0 e {limite}:");
        // Testa antes de executar e inclui o limite quando ele é par.
        while (par <= limite)
        {
            Console.Write($"{par} ");
            // Avança de dois em dois para mostrar apenas os pares.
            par += 2;
        }
        Console.WriteLine();
    }
}
