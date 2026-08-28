using System; // Importa a biblioteca necessária para usar o console.

namespace Fase8_Metodos // Define o nome do espaço de trabalho para Fase8_Metodos
{
    class Fase8 // Define a classe "Fase8"
    {
        static void Main()
        {
            Saudacao(); // chama a função saudacao, que será definida abaixo.
            Console.ReadLine(); // Aguarda o usuário pressionar Enter antes de encerrar o programa.

        }

        static void Saudacao() // Define  o método Saudacao, que exibe uma mensagem de boas vindas.
        {
            Console.WriteLine("Olá! Bem-vindo ao programa!"); // Exibe uma mensagem de boas vindas no console.

        }
    }
}