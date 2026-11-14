using System.Numerics;

namespace Lista07_While_DoWhile;

internal sealed class AtividadeH : Atividade
{
    public AtividadeH() : base("h", "Tabuada",
        "Desenvolva um programa que solicite ao usuário para inserir um número inteiro e, em seguida, exiba a tabuada desse número até o número 10.", "do while") { }

    protected override void Executar()
    {
        int numero = Entrada.Inteiro("Digite o número da tabuada: ");
        int multiplicador = 1;
        // Executa uma vez antes de testar a condição de continuação.
        do
        {
            // A conversão para long evita ultrapassar o limite de int no produto.
            Console.WriteLine($"{numero} x {multiplicador} = {(long)numero * multiplicador}");
            multiplicador++;
        } while (multiplicador <= 10);
        
    }
}
