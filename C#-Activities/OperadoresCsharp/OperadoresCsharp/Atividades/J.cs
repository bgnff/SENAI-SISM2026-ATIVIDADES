using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OperadoresCsharp.Atividades
{
    internal class J
    {
        public static void Executar()
        {
            Console.Clear();
            Console.WriteLine("===============================================");
            Console.WriteLine("           ENUNCIADO ATIVIDADE J:");
            Console.WriteLine("Escreva um programa que peça ao usuário para\r\ndigitar um número e exiba o seu resto da divisão por 2.");
            Console.WriteLine("===============================================");
            Console.WriteLine("");

            Console.Write("Digite um número: ");
            double numero = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine();
            Console.WriteLine("Resultado: " + (numero % 2)); // Exibe o resto da divisão do número por 2

            Console.WriteLine("");
            Console.WriteLine("Digite ENTER para voltar ao menu principal...");
            Console.ReadKey();
            Console.Clear();
        }
    }
}
