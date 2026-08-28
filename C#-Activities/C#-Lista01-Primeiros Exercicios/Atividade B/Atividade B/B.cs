using System; // Importa a biblioteca System para utilizar funcionalidades básicas do C#. (console)

namespace Atividade_B // Define o namespace "Atividade_B" para organizar o código e evitar conflitos de nomes.
{
    class B // Define a classe "B" que contém o método principal do programa.
    {
    static void Main() // Define o método principal "Main", que é o ponto de entrada do programa.
        {
        Console.WriteLine("Digite um número real: "); // Exibe uma mensagem no console solicitando ao usuário que digite um número real.
            double numero = Convert.ToDouble(Console.ReadLine()); // Lê a entrada do usuário como uma string, converte para um número real (double) e armazena na variável "numero".

            Console.WriteLine("O número digitado é: " + numero); // Exibe no console o número digitado pelo usuário, concatenando a mensagem com o valor da variável "numero".

            Console.ReadKey(); // Aguarda o usuário pressionar uma tecla antes de encerrar o programa, permitindo que ele veja a saída no console.
        }
}
}