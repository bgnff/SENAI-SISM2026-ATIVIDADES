using System;
using System.Collections.Generic;
using System.Text;

namespace C__CalculadoraDeGrandezas.Calculos
{
    internal class CalculoPotencia
    {

        // MÉTODO RESPONSÁVEL PELO CÁLCULO DA POTÊNCIA
        // Fórmula utilizada: P = V * I
        public static void ExecutarP()
        {

            CalculoPotencia calculadoraPotencia = new CalculoPotencia();

            Console.Clear();
            Console.WriteLine("====================================");
            Console.WriteLine("     CALCULADORA DE POTÊNCIA ");
            Console.WriteLine("====================================");
            Console.WriteLine("");

            Console.WriteLine("Digite a tensão (em volts):");
            double tensao = Convert.ToDouble(Console.ReadLine());

            Console.WriteLine("Digite a corrente (em amperes):");
            double corrente = Convert.ToDouble(Console.ReadLine());

            double potencia = tensao * corrente;

            Console.WriteLine($"A potência é: {potencia} watts");

            Console.WriteLine("Digite ENTER para continuar...");
            Console.ReadLine();
            Console.Clear();

        }   
    }
}
