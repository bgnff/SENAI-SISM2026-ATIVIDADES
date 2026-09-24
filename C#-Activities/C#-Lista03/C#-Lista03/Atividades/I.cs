using System;
using System.Collections.Generic;
using System.Text;

namespace C__Lista03.Atividades
{
    internal class I
    {
        public static void Executar()
        {
            Console.WriteLine("=======================================================================");
            Console.WriteLine("                       ENUNCIADO ATIVIDADE I:");
            Console.WriteLine("Crie um programa que peça ao usuário para digitar dois números inteiros\r\n e exiba se a diferença entre eles é menor ou igual a 10.");
            Console.WriteLine("=======================================================================");
            Console.WriteLine("");

            Console.Write("Digite um número inteiro: ");
            int numero1 = Convert.ToInt32(Console.ReadLine());
            Console.Write("Digite outro número inteiro: ");
            int numero2 = Convert.ToInt32(Console.ReadLine());

            if (numero1 == numero2) 
            {
                Console.WriteLine($"Os números são iguais: {numero1} = {numero2}");
            }
            else
            {
                // Math.Abs é usado para calcular o valor absoluto da diferença entre os dois números, garantindo que a diferença seja sempre positiva, independentemente da ordem dos números.
                // A variavel diferenca armazena a diferença absoluta entre os dois números
                int diferenca = Math.Abs(numero1 - numero2); // Calcula a diferença absoluta entre os dois números
                if (diferenca <= 10) // Verifica se a diferença é menor ou igual a 10
                {
                    Console.WriteLine($"A diferença entre os números é menor ou igual a 10: |{numero1} - {numero2}| = {diferenca}");
                }
                else
                {
                    Console.WriteLine($"A diferença entre os números é maior que 10: |{numero1} - {numero2}| = {diferenca}");
                }
            }

        }
    }
}
