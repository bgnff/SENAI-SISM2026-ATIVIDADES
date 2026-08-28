using System; // Importa o namespace System, que contém classes básicas do .NET, como Console

namespace Atividade_D // Define o namespace do programa, que é uma forma de organizar o código e evitar conflitos de nomes
{
    class D // 
    {
        static void Main() // Ponto de entrada do programa
        {
            Console.WriteLine("Digite sim ou não:"); 

            // Lê a entrada do usuário e converte para minúsculas para facilitar a comparação
            bool resposta = Console.ReadLine().ToLower() == "sim"; 

            if (resposta == true) // Adiciona uma condição para lidar com a resposta "sim"
            {
                Console.WriteLine("Você respondeu sim.");
            }
            else if (resposta == false) // Adiciona uma condição para lidar com a resposta "não"
            {
                Console.WriteLine("Você respondeu não.");
            }
            else // Adiciona uma condição para lidar com entradas inválidas 
            {
                Console.WriteLine("Resposta inválida."); // Adiciona uma mensagem de resposta inválida caso a entrada não seja "sim" ou "não"
            }

            Console.ReadKey(); // Aguarda o usuário pressionar uma tecla antes de encerrar o programa
        }
    }
}