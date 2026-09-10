using System;
using System.Collections.Generic;
using System.Text;
using C__CalculadoraDeGrandezas.Resistor; // Permite enxergar a classe CoresResistor

namespace C__CalculadoraDeGrandezas.Calculos
{
    internal class CalculoResistencia
    {
        // MÉTODO RESPONSÁVEL PELO CÁLCULO DA RESISTÊNCIA
        // Fórmula utilizada: R = V / I
        public static double Executar()
        {
            Console.Clear();
            Console.WriteLine("====================================");
            Console.WriteLine("     CALCULADORA DE RESISTÊNCIA ");
            Console.WriteLine("====================================");
            Console.WriteLine("");

            Console.WriteLine("Digite a tensão (em volts):");
            double tensao = Convert.ToDouble(Console.ReadLine());

            Console.WriteLine("Digite a corrente (em amperes):");
            double corrente = Convert.ToDouble(Console.ReadLine());

            double resistencia = tensao / corrente;

            Console.WriteLine($"A resistência é: {resistencia} ohms");
            CoresResistor.Executar(resistencia);

            return resistencia;

        }
    }
}
