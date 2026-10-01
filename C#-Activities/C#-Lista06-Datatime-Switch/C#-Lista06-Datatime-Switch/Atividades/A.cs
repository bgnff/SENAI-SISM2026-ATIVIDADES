using System;
using System.Collections.Generic;
using System.Text;

namespace C__Lista06_Datatime_Switch.Atividades
{
    internal class A
    {
        public static void Executar()
        {
            Console.Clear();
            Console.WriteLine(" Enunciado: Crie um programa que exiba a data e hora atual.");
            Thread.Sleep(2000);
            Console.WriteLine("");

            Console.WriteLine("Data e hora atual: " + DateTime.Now); // DateTime.Now exibe a data e hora atual do sistema.
            Console.WriteLine("Digite qualquer tecla para voltar ao menu principal...");
            Console.ReadKey();
            Console.Clear();
            
        }

    }
}
