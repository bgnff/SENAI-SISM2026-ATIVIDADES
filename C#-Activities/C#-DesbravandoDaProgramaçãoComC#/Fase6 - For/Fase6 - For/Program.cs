using System; // Importa a biblioteca para usar o console.

namespace Fase6_For // Define o nomme do espaço de trabalho para Fase6_For para organizar o código.
{
    class Fase6 // Define a classe Fase6 onde o código será executado.
    {
        static void Main() // Ponto de entrada do programa.
        {

           for (int i = 1; i <=5; i++) // Laço que começa em 1 e vai até 5.
            {
                Console.WriteLine("Contagem: " + i); // Exibe o valor de i a cada interação.
            }
            Console.ReadKey(); // Aguarda o usuário pressionar uma tecla antes de encerrar o programa.
        }
    }
}