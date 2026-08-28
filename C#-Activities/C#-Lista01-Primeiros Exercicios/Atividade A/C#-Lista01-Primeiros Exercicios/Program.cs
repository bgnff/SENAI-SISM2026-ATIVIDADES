using System; // importa a biblioteca necessária para usar o console

namespace Lista01_Primeiros_Exercicios // Define o nome do espaço de trabalho
{
    class A // Define a classe principal do programa
    {
        static void Main() // Define o ponto de entrada do programa, Aonde o código será executado.
        {
            Console.WriteLine("Digite um número inteiro: "); // Exibe uma mensagem no console solicitando ao usuário que digite um número inteiro
            int numero = Convert.ToInt32(Console.ReadLine()); // Lê a entrada do usuário, converte para inteiro e armazena na variável 'numero'

            Console.WriteLine("O número digitado foi: " +  numero); // Exibe o valor da variável 'numero' no console

            Console.ReadKey(); // Aguarda o usuário pressionar uma tecla antes de encerrar o programa
        }
    }
}