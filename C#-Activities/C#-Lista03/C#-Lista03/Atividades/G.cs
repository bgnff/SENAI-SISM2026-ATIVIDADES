using System;
using System.Collections.Generic;
using System.Text;

namespace C__Lista03.Atividades
{
    internal class G
    {
        public static void Executar()
        {
            Console.WriteLine("=======================================================================");
            Console.WriteLine("                       ENUNCIADO ATIVIDADE G:");
            Console.WriteLine("Crie um programa que peça ao usuário para digitar dois números de ponto\r\nflutuante e exiba se o primeiro número é menor ou igual ao segundo número.");
            Console.WriteLine("=======================================================================");
            Console.WriteLine("");

            Console.WriteLine("Digite o primeiro número com ponto flutuante:");
            double numero1 = Convert.ToDouble(Console.ReadLine()); // Lê o primeiro número de ponto flutuante do usuário
            Console.WriteLine("Digite o segundo número com ponto flutuante:");
            double numero2 = Convert.ToDouble(Console.ReadLine()); // Lê o segundo número de ponto flutuante do usuário

            if (numero1 <= numero2)
            {
                Console.WriteLine($"O primeiro número ({numero1}) é menor ou igual ao segundo número ({numero2}).");
            }
            else
            {
                Console.WriteLine($"O primeiro número ({numero1}) é menor que o segundo número ({numero2}).");
            }
        }
    }
}
