using System;
using System.Collections.Generic;
using System.Text;

namespace C__Lista03.Atividades
{
    internal class H
    {
        public static void Executar()
        {
            Console.WriteLine("=======================================================================");
            Console.WriteLine("                       ENUNCIADO ATIVIDADE H:");
            Console.WriteLine("Crie um programa que peça ao usuário para digitar um número inteiro\r\n e exiba se ele é positivo ou negativo.");
            Console.WriteLine("=======================================================================");
            Console.WriteLine("");

            Console.Write("Digite um número inteiro: ");
            int numero = Convert.ToInt32(Console.ReadLine());

            if (numero > 0)
            {
                Console.WriteLine($"O número {numero} é positivo.");
            }
            else if (numero < 0)
            {
                Console.WriteLine($"O número {numero} é negativo.");
            }
            else
            {
                Console.WriteLine("O número é zero.");
            }
        }
    }
}
