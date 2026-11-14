using System.Numerics;

namespace Lista07_While_DoWhile;

internal sealed class AtividadeE : Atividade
{
    public AtividadeE() : base("e", "Soma até um negativo",
        "Crie um programa que solicite ao usuário para inserir números inteiros até que um número negativo seja inserido. Em seguida, exiba a soma dos números inseridos (excluindo o número negativo).", "while") { }

    protected override void Executar()
    {
        // Acumulador: guarda o total, inclusive valores maiores que o limite de int.
        BigInteger soma = 0;
        Console.WriteLine("Digite inteiros; um negativo encerra e não entra na soma.");
        int numero = Entrada.Inteiro("Número: ");
        // O negativo encerra o laço antes de entrar na soma.
        while (numero >= 0)
        {
            soma += numero;
            numero = Entrada.Inteiro("Número: ");
        }
        Console.WriteLine($"Soma: {soma}");
    }
}
