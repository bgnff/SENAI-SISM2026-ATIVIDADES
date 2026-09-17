using System;


namespace OperadoresCsharp.Atividades
{
    internal class H
    {
        public static void Executar()
        {
            Console.Clear();
            Console.WriteLine("===============================================");
            Console.WriteLine("           ENUNCIADO ATIVIDADE H:");
            Console.WriteLine("Escreva um programa que peça ao usuário para\r\ndigitar um número e exiba o seu valor absoluto.");
            Console.WriteLine("===============================================");
            Console.WriteLine("");

            Console.WriteLine("Digite um número: ");
            double numero = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine();
            Console.WriteLine("Resultado: " + Math.Abs(numero)); 
            // Math.Abs() retorna o valor absoluto de um número, ou seja, o valor sem o sinal negativo.

            Console.WriteLine("");
            Console.WriteLine("Digite ENTER para voltar ao menu principal...");
            Console.ReadKey();
            Console.Clear();
        }
    }
}
