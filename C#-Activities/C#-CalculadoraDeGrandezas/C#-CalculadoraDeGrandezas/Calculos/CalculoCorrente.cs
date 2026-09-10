using System;
using System.Collections.Generic;
using System.Text;

namespace C__CalculadoraDeGrandezas.Calculos
{
    internal class CalculoCorrente
    {
        // MÉTODO RESPONSÁVEL PELO CÁLCULO DA CORRENTE
        // Fórmula utilizada: I = V / R
        public static void Executar()
        {
            Console.Clear();
            Console.WriteLine("====================================");
            Console.WriteLine("     CALCULADORA DE CORRENTE");
            Console.WriteLine("====================================");
            Console.WriteLine("");

            Console.WriteLine("Digite a tensão (em volts):");
            double tensao = Convert.ToDouble(Console.ReadLine());

            Console.WriteLine("Digite a resistência (em ohms):");
            double resistencia = Convert.ToDouble(Console.ReadLine());

            double corrente = tensao / resistencia;
            Console.WriteLine($"A corrente é: {corrente} amperes");

            Console.WriteLine("Digite ENTER para continuar...");
            Console.ReadLine();
            Console.Clear();

        }

    }
}
