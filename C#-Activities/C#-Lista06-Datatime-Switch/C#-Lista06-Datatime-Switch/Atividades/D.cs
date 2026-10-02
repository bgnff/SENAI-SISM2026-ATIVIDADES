using System;
using System.Collections.Generic;
using System.Globalization;
using System.Text;

namespace C__Lista06_Datatime_Switch.Atividades
{
    internal class D
    {
        public static void Executar()
        {
            bool validacao = false;
            while (validacao == false)
            try
            {
                Console.Clear();
                Console.WriteLine("Enunciado: Crie um programa que verifique se uma data é um feriado nacional.");
                Thread.Sleep(2000);

                Console.WriteLine();
                Console.WriteLine("Digite uma data (formato: dd/MM/yyyy):");
                DateTime data = DateTime.ParseExact(Console.ReadLine(), "dd/MM/yyyy", new CultureInfo("pt-BR"));
                    // Função usada para converter a string digitada pelo usuário em um objeto DateTime, usando o formato "dd/MM/yyyy" e a cultura "pt-BR" (português do Brasil).

                    DateTime[] feriados = { // Array de datas que representam os feriados nacionais do Brasil
                    new DateTime(data.Year, 1, 1),
                    new DateTime(data.Year, 4, 21),
                    new DateTime(data.Year, 5, 1),
                    new DateTime(data.Year, 9, 7),
                    new DateTime(data.Year, 10, 12),
                    new DateTime(data.Year, 11, 2),
                    new DateTime(data.Year, 11, 15),
                    new DateTime(data.Year, 11, 20),
                    new DateTime(data.Year, 12, 25)
                };

                if (feriados.Contains(data)) // .Contains() é um método que verifica se um determinado elemento está presente em uma coleção 
                                             // feriados.Contains(data) verifica se a data digitada pelo usuário está presente no array de feriados. Se estiver, significa que é um feriado nacional.
                    {
                        Console.WriteLine("É feriado!");
                        validacao = true;
                    }
                    else
                {
                    Console.WriteLine("Não é feriado!");
                    validacao = true;
                    }

            }
            catch (FormatException) // Captura o erro de formato caso o usuário digite uma data inválida ou em um formato diferente do esperado.
                {

                    Console.WriteLine("Data inválida! Digite no formato dd/MM/yyyy.");
                    Console.WriteLine("Pressione qualquer tecla para tentar novamente...");
                    Console.ReadKey();
                }

            Console.WriteLine("Digite qualquer tecla para voltar ao menu principal...");
            Console.ReadKey();
        }
    }
}
