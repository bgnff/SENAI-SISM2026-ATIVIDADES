using System;
using System.Collections.Generic;
using System.Text;

namespace C__Lista03.Atividades
{
    internal class F
    {
        public static void Executar()
        {
            Console.WriteLine("=======================================================================");
            Console.WriteLine("                       ENUNCIADO ATIVIDADE F:");
            Console.WriteLine("Crie um programa que peça ao usuário para digitar um número inteiro\r\n e exiba se ele é par ou ímpar.");
            Console.WriteLine("=======================================================================");
            Console.WriteLine("");

            Console.Write("Digite um número inteiro: ");
            int numero1 = Convert.ToInt32(Console.ReadLine()); // Lê o número inteiro do usuário
            
            if (numero1 % 2 == 0)
            {
                Console.WriteLine($"O número {numero1} é par.");
            }
            else
            {
                Console.WriteLine($"O número {numero1} é ímpar.");
            }


        }
    }
}
