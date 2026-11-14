using System.Numerics;

namespace Lista07_While_DoWhile;

internal sealed class AtividadeG : Atividade
{
    public AtividadeG() : base("g", "Números pares",
        "Crie um programa que solicite ao usuário para inserir um número inteiro positivo e, em seguida, exiba todos os números pares entre 0 e o número inserido.", "do while") { }

    protected override void Executar()
    {
        int limite = Entrada.Inteiro("Digite um inteiro positivo: ", 1);
        long par = 0;
        Console.WriteLine($"Pares entre 0 e {limite}:");
        // Executa uma vez antes de testar a condição de continuação.
        do
        {
            Console.Write($"{par} ");
            // Avança de dois em dois para mostrar apenas os pares.
            par += 2;
        } while (par <= limite);
        Console.WriteLine();
    }
}
