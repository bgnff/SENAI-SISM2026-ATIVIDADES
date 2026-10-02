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
            // DateTime.TryParseExact tenta converter a string de entrada em um objeto DateTime usando o formato especificado e a cultura "pt-BR".
            // CultureInfo.GetCultureInfo("pt-BR") especifica que a cultura utilizada para interpretar a data é a brasileira, garantindo que o formato de data seja corretamente reconhecido.
            //DateTimeStyles.None indica que não há estilos adicionais a serem aplicados durante a conversão.
            // Se a conversão for bem-sucedida, a variável "data" conterá o valor convertido e o método retornará true; caso contrário, retornará false.
            {
                string dia = data.ToString("dddd", CultureInfo.GetCultureInfo("pt-BR"));
                // data.ToString("dddd", CultureInfo.GetCultureInfo("pt-BR")) retorna o dia da semana em português, como "segunda-feira", "terça-feira", etc.
                // O formato "dddd" é usado para obter o nome completo do dia da semana.
                // CultureInfo.GetCultureInfo("pt-BR") garante que o nome do dia da semana seja exibido em português.
                if (!string.IsNullOrEmpty(dia))
                    // IsNullOrEmpty verifica se a string é nula ou vazia, retornando true se for o caso.

                    dia = char.ToUpper(dia[0]) + dia.Substring(1);
                // char.ToUpper(dia[0]) + dia.Substring(1) transforma a primeira letra do dia da semana em maiúscula, mantendo o restante da string inalterado.


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
