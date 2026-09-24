using System;
using System.Collections.Generic;
using System.Text;

namespace C__Lista03.Atividades
{
    internal class B
    {
        public static void Executar()
        {
            Console.Clear();
            Console.WriteLine("=======================================================================");
            Console.WriteLine("                       ENUNCIADO ATIVIDADE B:");
            Console.WriteLine("Crie um programa que peça ao usuário para digitar dois números inteiros\r\n e exiba se o primeiro número é menor que o segundo número.");
            Console.WriteLine("=======================================================================");

            Console.Write("Digite o primeiro número inteiro: ");
            int numero1 = Convert.ToInt32(Console.ReadLine()); // Lê o primeiro número inteiro do usuário
            Console.Write("Digite o segundo número inteiro: ");
            int numero2 = Convert.ToInt32(Console.ReadLine()); // Lê o segundo número inteiro do usuário

            if (numero1 < numero2)
            {
                Console.WriteLine($"O primeiro número ({numero1}) é menor que o segundo número ({numero2}).");
            }
            else if (numero1 > numero2)
            {
                Console.WriteLine($"O primeiro número ({numero1}) é maior que o segundo número ({numero2}).");
            }
            else
            {
                Console.WriteLine($"O primeiro número ({numero1}) é igual ao segundo número ({numero2}).");
            }
            Console.WriteLine("");
            Console.WriteLine("Aperte qualquer tecla para voltar ao menu principal...");
            Console.ReadKey();
            Console.Clear();
        }
    }
}
