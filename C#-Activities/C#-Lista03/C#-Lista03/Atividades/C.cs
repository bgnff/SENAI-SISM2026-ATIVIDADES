using System;
using System.Collections.Generic;
using System.Text;

namespace C__Lista03.Atividades
{
    internal class C
    {

        public static void Executar()
        {
            Console.WriteLine("=======================================================================");
            Console.WriteLine("                       ENUNCIADO ATIVIDADE C:");
            Console.WriteLine("Crie um programa que peça ao usuário para digitar dois números inteiros\r\n e exiba se eles são iguais.");
            Console.WriteLine("=======================================================================");
            Console.WriteLine("");

            Console.Write("Digite o primeiro número inteiro: ");
            int numero1 = Convert.ToInt32(Console.ReadLine()); // Lê o primeiro número inteiro do usuário
            Console.Write("Digite o segundo número inteiro: ");
            int numero2 = Convert.ToInt32(Console.ReadLine()); // Lê o segundo número inteiro do usuário

            if (numero1 == numero2)
            {
                Console.WriteLine($"Os números são iguais: {numero1} = {numero2}");
            }
           else
            {
                Console.WriteLine($"Os números são diferentes: {numero1} != {numero2}");
            }
            Console.WriteLine("");
            Console.WriteLine("Aperte qualquer tecla para voltar ao menu principal...");
            Console.ReadKey();
            Console.Clear();

        }
    }
}
