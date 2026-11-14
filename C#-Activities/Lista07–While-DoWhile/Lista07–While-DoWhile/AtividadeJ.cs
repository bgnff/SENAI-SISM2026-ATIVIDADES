using System.Numerics;

namespace Lista07_While_DoWhile;

internal sealed class AtividadeJ : Atividade
{
    public AtividadeJ() : base("j", "Verificação de senha",
        "Desenvolva um programa que solicite ao usuário para inserir uma senha e, em seguida, permita que o usuário tente inserir a senha até três vezes. Caso o usuário acerte a senha, exiba uma mensagem de sucesso. Caso contrário, exiba uma mensagem informando que a senha está incorreta.", "do while") { }

    protected override void Executar()
    {
        string senha = Entrada.Senha("Cadastre a senha para este exercício (visível na tela): ");
        int tentativas = 0;
        bool acertou = false;
        // Executa uma vez antes de testar a condição de continuação.
        do
        {
            string tentativa = Entrada.Texto($"Tentativa {tentativas + 1}/3 — digite a senha: ");
            tentativas++;
            acertou = tentativa == senha;
            Console.WriteLine(acertou ? "Senha correta! Sucesso." : "Senha incorreta.");
        } while (tentativas < 3 && !acertou);
        if (!acertou) Console.WriteLine("As três tentativas foram utilizadas.");
    }
}
