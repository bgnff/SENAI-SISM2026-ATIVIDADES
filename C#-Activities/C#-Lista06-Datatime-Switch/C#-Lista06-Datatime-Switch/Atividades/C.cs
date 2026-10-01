using System;
using System.Collections.Generic;
using System.Text;

namespace C__Lista06_Datatime_Switch.Atividades
{
    internal class C
    {
        public static void Executar()
        {
            Console.Clear();
            Console.WriteLine("Enunciado: Crie um programa que calcule a idade de uma pessoa a partir de sua data de\r\nnascimento.");
            Thread.Sleep(2000);

            Console.WriteLine();
            Console.WriteLine("Digite sua data de nascimento (formato: dd/MM/yyyy):");
            DateTime nascimento = DateTime.ParseExact(Console.ReadLine(), "dd/MM/yyyy", null);

            DateTime hoje = DateTime.Today;
            // DateTime.Today = retorna a data atual sem a hora, ou seja, apenas o dia, mês e ano.
            // DateTime.ParseExact = converte a string digitada pelo usuário em um objeto DateTime, usando o formato especificado "dd/MM/yyyy" (dia/mês/ano).


            int idade = hoje.Year - nascimento.Year;

            if (nascimento.Date > hoje.AddYears(-idade))
            {
                idade--;
            }

            Console.WriteLine("Sua idade é: " + idade + " anos.");

        }
    }
}
