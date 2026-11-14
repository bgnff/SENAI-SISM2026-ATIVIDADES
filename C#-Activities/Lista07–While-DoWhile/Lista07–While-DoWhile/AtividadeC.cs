using System.Numerics;

namespace Lista07_While_DoWhile;

internal sealed class AtividadeC : Atividade
{
    public AtividadeC() : base("c", "Soma de uma sequência",
        "Crie um programa que solicite ao usuário para inserir uma sequência de números inteiros e, em seguida, exiba a soma desses números.", "while") { }

    protected override void Executar()
    {
        int quantidade = Entrada.Inteiro("Quantos números deseja somar? (mínimo 1): ", 1);
        long indice = 1;
        // Acumulador: guarda o total, inclusive valores maiores que o limite de int.
        BigInteger soma = 0;
        // Lê exatamente a quantidade de números solicitada.
        while (indice <= quantidade)
        {
            soma += Entrada.Inteiro($"Número {indice}: ");
            indice++;
        }
        Console.WriteLine($"Soma: {soma}");
    }
}
