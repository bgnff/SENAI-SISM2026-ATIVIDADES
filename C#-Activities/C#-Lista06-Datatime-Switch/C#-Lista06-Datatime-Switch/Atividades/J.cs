using System;
using System.Collections.Generic;
using System.Text;

namespace C__Lista06_Datatime_Switch.Atividades
{
    internal class J
    {
        public static void Executar()
        {
            Console.Clear();
            Console.WriteLine("Enunciado: Crie um programa que permita ao usuário escolher uma das três opções de\r\ntamanho de camiseta (P, M ou G) e exiba o preço correspondente, utilizando\r\no switch.");
            Thread.Sleep(2000);
            Console.WriteLine();

            Console.Write("Digite o seu tamanho de camisa: ");
            string tamanho = Console.ReadLine().ToUpper(); // Converte a entrada para maiúscula para facilitar a comparação


            // Validação da entrada do usuário para garantir que seja P, M ou G
            while (string.IsNullOrEmpty(tamanho))
            {
                Console.WriteLine("Entrada inválida. Por favor, insira um tamanho de camiseta (P, M ou G).");
                Console.WriteLine();
                Console.Write("Digite o seu tamanho de camisa: ");
                tamanho = Console.ReadLine().ToUpper();

            }

            // Validação adicional para garantir que o tamanho seja P, M ou G
            while (tamanho != "P" && tamanho != "M" && tamanho != "G")
            {
                Console.WriteLine("Tamanho inválido. Por favor, insira P, M ou G.");
                Console.WriteLine();
                Console.Write("Digite o seu tamanho de camisa: ");
                tamanho = Console.ReadLine().ToUpper();
            }

            // Utilizando o switch para determinar o preço com base no tamanho da camiseta
            switch (tamanho)
            {
                case "P":
                    Console.WriteLine("O preço da camiseta tamanho P é: R$ 29,90");
                    break;
                case "M":
                    Console.WriteLine("O preço da camiseta tamanho M é: R$ 39,90");
                    break;
                case "G":
                    Console.WriteLine("O preço da camiseta tamanho G é: R$ 49,90");
                    break;
                default:
                    Console.WriteLine("Tamanho inválido. Por favor, insira P, M ou G.");
                    break;
            }

            Console.WriteLine("\nPressione Enter para voltar ao menu...");
            Console.ReadKey();
        }
    }
}

