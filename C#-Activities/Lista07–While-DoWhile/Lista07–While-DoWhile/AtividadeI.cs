using System.Numerics;

namespace Lista07_While_DoWhile;

internal sealed class AtividadeI : Atividade
{
    public AtividadeI() : base("i", "Soma de uma sequência",
        "Crie um programa que solicite ao usuário para inserir uma sequência de números inteiros e, em seguida, exiba a soma desses números.", "do while") { }

    protected override void Executar()
    {
        int quantidade = Entrada.Inteiro("Quantos números deseja somar? (mínimo 1): ", 1);
        long indice = 1;
        // Acumulador: guarda o total, inclusive valores maiores que o limite de int.
        BigInteger soma = 0;
        // Executa uma vez antes de testar a condição de continuação.
        do
        {
            soma += Entrada.Inteiro($"Número {indice}: ");
            indice++;
        } while (indice <= quantidade);
        Console.WriteLine($"Soma: {soma}");
    }
}
