using System; // Importa o namespace System, que contém classes fundamentais para a programação em C#.

namespace Atividade_C // Define o namespace Atividade_C, que é usado para organizar o código e evitar conflitos de nomes.
{
    class C // Define a classe Program, que contém o ponto de entrada do programa.
    {
        static void Main() // Define o método Main, que é o ponto de entrada do programa. Ele recebe um array de strings como argumento.
        {
            Console.WriteLine("Digite um número: "); // Imprime a mensagem "Digite um número: " no console.

            float numero = float.Parse(Console.ReadLine()); // Declara uma variável do tipo float chamada numero e atribui o valor lido do console a ela.

            Console.WriteLine("O valor do número é: " + numero); // Imprime o valor da variável numero no console.

            Console.ReadKey(); // Aguarda o usuário pressionar uma tecla antes de encerrar o programa.
        }
    }
}