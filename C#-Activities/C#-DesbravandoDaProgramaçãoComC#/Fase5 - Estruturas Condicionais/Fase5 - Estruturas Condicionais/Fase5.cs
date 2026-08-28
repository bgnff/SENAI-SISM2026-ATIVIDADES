using System;

namespace Fase5_Estrutura_de_soluções
{

    class Fase5
    {
        static void Main()
        {

            Console.Write("Digite sua idade: "); // Solicita ao usuário que digite sua idade.
            int idade = int.Parse(Console.ReadLine()); // Lê a entrada do usuário e converte para inteiro.

            if (idade >= 18)
            { // Se a  idade for maior ou igual a 18, o código dentro do  if será executado

                Console.WriteLine("Você é maior de idade."); // Exibe a mensagem se indicando que o usuário é maior de idade.

            }
            else // Caso a condição não seja verdadeira, (idade < 18), executa o código abaixo.
            {
                Console.WriteLine("Você é menor de idade."); // Exibe a mensagem indicando que o usuário é menor de idade.

            }

            Console.ReadLine(); // Aguarda o usuário pressionar Enter antes de encerrar o programa.
        }

    }
}
