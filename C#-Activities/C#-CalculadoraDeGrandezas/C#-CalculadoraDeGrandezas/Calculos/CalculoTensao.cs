using System;
using System.Collections.Generic;
using System.Text;

namespace C__CalculadoraDeGrandezas.Calculos
{
    internal class CalculoTensao
    {
        // MÉTODO RESPONSÁVEL PELO CÁLCULO DA TENSÃO
        // Fórmula utilizada: V = I * R
        public static void Executar()

        {
            Console.Clear();
            Console.WriteLine("====================================");
            Console.WriteLine("     CALCULADORA DE TENSÃO");
            Console.WriteLine("====================================");
            Console.WriteLine("");

            Console.WriteLine("Digite a corrente (em amperes):");
            double corrente = Convert.ToDouble(Console.ReadLine());

            Console.WriteLine("Digite a resistência (em ohms):");
            double resistencia = Convert.ToDouble(Console.ReadLine());

            double tensao = corrente * resistencia;

            Console.WriteLine($"A tensão é: {tensao} volts");

            Console.WriteLine("Digite ENTER para continuar...");
            Console.ReadLine();
            Console.Clear();
        }
    }
}
