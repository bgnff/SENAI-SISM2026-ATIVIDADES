using System.Numerics;

namespace Lista07_While_DoWhile;

internal sealed class AtividadeB : Atividade
{
    public AtividadeB() : base("b", "Tabuada",
        "Desenvolva um programa que solicite ao usuário para inserir um número inteiro e, em seguida, exiba a tabuada desse número até o número 10.", "while") { }

    protected override void Executar()
    {
        int numero = Entrada.Inteiro("Digite o número da tabuada: ");
        int multiplicador = 1;
        // Repete a tabuada de 1 a 10.
        while (multiplicador <= 10)
        {
            // A conversão para long evita ultrapassar o limite de int no produto.
            Console.WriteLine($"{numero} x {multiplicador} = {(long)numero * multiplicador}");
            multiplicador++;
        }
        
    }
}
