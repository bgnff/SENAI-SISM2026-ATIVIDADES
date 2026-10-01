using System;
using System.Collections.Generic;
using System.Text;

namespace C__Lista06_Datatime_Switch.Atividades
{
    internal class B
    {
        public static void Executar()
        {
            Console.Clear();
            Console.WriteLine("Enunciado: Crie um programa que calcule a diferença em dias entre duas datas.");
            Thread.Sleep(2000);
            Console.WriteLine("");

            Console.WriteLine("Digite a primeira data (formato: dd/MM/yyyy):");
            DateTime data1 = DateTime.ParseExact(Console.ReadLine(), "dd/MM/yyyy", null);

            // Datetime = data1 -> cria uma váriavel do tipo DateTime chamada data1 
            // DataTime.ParseExact = converte a string digitada pelo usuário em um objeto DateTime, usando o formato especificado "dd/MM/yyyy" (dia/mês/ano).
            //ParseExact = método que converte uma string em um objeto DateTime, considerando o formato especificado.

            Console.WriteLine("Digite a segunda data (formato: dd/MM/yyyy):");
            DateTime data2 = DateTime.ParseExact(Console.ReadLine(), "dd/MM/yyyy", null);

            int dias = Math.Abs((data2 - data1).Days);
            // Math.Abs = método que retorna o valor absoluto de um número, ou seja, remove o sinal negativo, caso exista.
            // (data2 - data1) = subtração entre as duas datas, que resulta em um objeto TimeSpan, que representa o intervalo de tempo entre as duas datas.
            // .Days = propriedade do objeto TimeSpan que retorna a quantidade de dias do intervalo de tempo.

            Console.WriteLine("A diferença em dias entre as duas datas é: " + dias + " dias.");

            Console.ReadKey();
            Console.Clear();
        }
    }
}
