using System; // Importa a biblioteca necessária para usar o console

namespace Fase10_Validacao_de_Senha // Define o nome do espaço de trabalho do programa como Fase10_Validacao_de_Senha
{
    class Fase10 // Define a classe principal do programa chamada Fase10
    {
        static void Main() // Define o ponto de entrada do programa, que é o método Main
        {
            string senhaCorreta = "senha123"; // Define a senha correta como "senha123"

            Console.WriteLine("Digitea senha: ");
            senhaCorreta = Console.ReadLine(); // Lê a senha digitada pelo usuário e armazena na variável senhaCorreta

            if (senhaCorreta == "senha123") // Verifica se a senha correta é igual a "senha123"
            {
                Console.WriteLine("Senha correta! Acesso permitido."); // Se for, imprime "Senha correta!" no console
            }
            else // Caso contrário, se a senha  não  for correta (igual a senha123)
            {
                Console.WriteLine("Senha incorreta! Acesso negado."); // Imprime "Senha incorreta!" no console

                Console.ReadLine(); // Aguarda o usuário pressionar uma tecla antes de encerrar o programa
            }

        }
    }
}