using System;
using System.Collections.Generic;
using System.Text;

namespace C__Lista03.Atividades
{
    internal class D
    {
        public static void Executar()
        {
            Console.WriteLine("=======================================================================");
            Console.WriteLine("                       ENUNCIADO ATIVIDADE D:");
            Console.WriteLine("Crie um programa que peça ao usuário para digitar três números inteiros\r\n e exiba se o primeiro número é menor que o segundo número e maior que o\r\nterceiro número.");
            Console.WriteLine("=======================================================================");
            Console.WriteLine("");

            Console.Write("Digite o primeiro número inteiro:");
            int numero1 = Convert.ToInt32(Console.ReadLine()); // Lê o primeiro número inteiro do usuário
            Console.Write("Digite o segundo número inteiro:");
            int numero2 = Convert.ToInt32(Console.ReadLine()); // Lê o segundo número inteiro do usuário
            Console.Write("Digite o terceiro número inteiro:");
            int numero3 = Convert.ToInt32(Console.ReadLine()); // Lê o terceiro número inteiro do usuário  

            if (numero1 < numero2 && numero1 > numero3)
            {
                Console.WriteLine($"O primeiro número ({numero1}) é menor que o segundo número ({numero2}) e maior que o terceiro número ({numero3}).");
            }
            else
            {
                Console.WriteLine($"O primeiro número ({numero1}) não é menor que o segundo número ({numero2}) e maior que o terceiro número ({numero3}).");
            }

        }
    }
}
