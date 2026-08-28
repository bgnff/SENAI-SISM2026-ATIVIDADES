using System; // Importa a biblioteca necessária para utilizar classes e métodos do sistema.

namespace Fase4_Entrada_Dados // Define o namespace do programa.{
{
    class Fase4
    {
        static void Main()
        {
            Console.Write("Digite seu nome: "); // Solicita que o usuário digite seu nome.
            string nome = Console.ReadLine(); // Lê a entrada do usuário e armazena na variável 'nome'.

            Console.WriteLine("Olá, " + nome + "!"); // Exibe uma mensagem de saudação utilizando o nome fornecido pelo usuário.

            Console.ReadLine(); // Aguarda o usuário pressionar Enter antes de encerrar o programa.
        }
    }
}