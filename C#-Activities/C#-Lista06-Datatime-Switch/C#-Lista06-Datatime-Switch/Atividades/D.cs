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

                        DateTime[] feriados = {
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

                if (feriados.Contains(data))
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
            catch (FormatException)
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
