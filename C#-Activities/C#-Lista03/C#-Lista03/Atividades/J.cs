using System;
using System.Collections.Generic;
using System.Text;

namespace C__Lista03.Atividades
{
    internal class J
    {
        public static void Executar()
        {
            Console.WriteLine("=======================================================================");
            Console.WriteLine("                       ENUNCIADO ATIVIDADE J:");
            Console.WriteLine("Crie um programa que peça ao usuário para digitar um número de ponto\r\nflutuante e exiba se ele é igual a zero.");
            Console.WriteLine("=======================================================================");
            Console.WriteLine("");

            Console.Write("Digite um número de ponto flutuante: ");
            double numero = Convert.ToDouble(Console.ReadLine());

            if (numero == 0)
            {
                Console.WriteLine("O número é igual a zero.");
            }
            else
            {
                Console.WriteLine("O número não é igual a zero.");
            }
            {

            }
            
        }
    }
}
