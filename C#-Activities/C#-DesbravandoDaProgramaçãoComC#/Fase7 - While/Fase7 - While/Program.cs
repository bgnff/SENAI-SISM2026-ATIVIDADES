using System; // Importa a biblioteca para usar o console.

namespace Fase7_While // Define o nome do espaço de trabalho como Fase7_While.
{
    class Fase7 // Define a classe Fase7 onde o programa será executado.
    {
        static void Main() // Define o método Main, que é o ponto de entrada do programa.
        {
            int i = 1; // Inicializa a variável i com 1.
            while (i <= 5) // Inicia um loop que vai se repetir enquanto i for menor ou igual a 5.
            {
                Console.WriteLine("Contagem: " + i); // Imprime o valor atual de i no console.
                i++; // Incrementa o valor de i a cada repetição do loop.
            }

            Console.ReadLine(); // Aguarda o usuário pressionar Enter antes de fechar o console.
        }
    }
}