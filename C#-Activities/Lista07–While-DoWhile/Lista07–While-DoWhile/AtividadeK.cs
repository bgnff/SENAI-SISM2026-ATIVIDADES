using System.Numerics;

namespace Lista07_While_DoWhile;

internal sealed class AtividadeK : Atividade
{
    public AtividadeK() : base("k", "Soma até um negativo",
        "Crie um programa que solicite ao usuário para inserir números inteiros até que um número negativo seja inserido. Em seguida, exiba a soma dos números inseridos (excluindo o número negativo).", "do while") { }

    protected override void Executar()
    {
        // Acumulador: guarda o total, inclusive valores maiores que o limite de int.
        BigInteger soma = 0;
        Console.WriteLine("Digite inteiros; um negativo encerra e não entra na soma.");
        int numero;
        // Executa uma vez antes de testar a condição de continuação.
        do
        {
            numero = Entrada.Inteiro("Número: ");
            // O negativo serve apenas para encerrar: não entra na soma.
            if (numero >= 0) soma += numero;
        } while (numero >= 0);
        Console.WriteLine($"Soma: {soma}");
    }
}
