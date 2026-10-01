using System;
using System.Collections.Generic;
using System.Text;
using System.Threading;
using System.Globalization;

namespace C__Lista06_Datatime_Switch.Atividades
{
    internal class F
    {
        public static void Executar()
        {
            Console.Clear();
            Console.WriteLine("Enunciado: Crie um programa que exiba o dia da semana correspondente a uma data informada pelo usuário.");
            Thread.Sleep(2000);

            Console.WriteLine("Digite uma data (formato: dd/MM/yyyy):");
            string input = Console.ReadLine();

            if (DateTime.TryParseExact(input, "dd/MM/yyyy", CultureInfo.GetCultureInfo("pt-BR"), DateTimeStyles.None, out DateTime data))
            {
                string dia = data.ToString("dddd", CultureInfo.GetCultureInfo("pt-BR"));
                if (!string.IsNullOrEmpty(dia))
                    dia = char.ToUpper(dia[0]) + dia.Substring(1);

                Console.WriteLine($"A data {data:dd/MM/yyyy} cai em: {dia}.");
            }
            else
            {
                Console.WriteLine("Data inválida. Certifique-se do formato dd/MM/yyyy.");
            }

            Console.WriteLine("\nPressione Enter para voltar ao menu...");
            Console.ReadLine();
        }
    }
}
