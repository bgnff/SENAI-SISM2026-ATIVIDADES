using System;
using System.Collections.Generic;
using System.Text;

namespace C__Lista06_Datatime_Switch.Atividades
{
    internal class I
    {
        public static void Executar()
        {
            Console.Clear();
            Console.WriteLine("Enunciado: Crie um programa que leia um número inteiro de 1 a 7 e exiba o dia da\r\nsemana correspondente, utilizando o switch.");
            Thread.Sleep(2000);
            Console.WriteLine();

            Console.Write("Digite um número inteiro de 1 a 7: ");
            int numero = int.Parse(Console.ReadLine());

            switch (numero)
            {
                case 1:
                    Console.WriteLine("O dia da semana correspondente é: Segunda-feira");
                    break;
                case 2:
                    Console.WriteLine("O dia da semana correspondente é: Terça-feira");
                    break;
                case 3:
                    Console.WriteLine("O dia da semana correspondente é: Quarta-feira");
                    break;
                case 4:
                    Console.WriteLine("O dia da semana correspondente é: Quinta-feira");
                    break;
                case 5:
                    Console.WriteLine("O dia da semana correspondente é: Sexta-feira");
                    break;
                case 6:
                    Console.WriteLine("O dia da semana correspondente é: Sábado");
                    break;
                case 7:
                    Console.WriteLine("O dia da semana correspondente é: Domingo");
                    break;
                default:
                    Console.WriteLine("Número inválido. Por favor, insira um número entre 1 e 7.");
                    break;

            }

            Console.WriteLine("\nPressione Enter para voltar ao menu...");
            Console.ReadKey();

        }
    }
}
