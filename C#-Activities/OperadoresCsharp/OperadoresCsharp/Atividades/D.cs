using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OperadoresCsharp.Atividades
{
    internal class D
    {
        public static void Executar()
        {
            Console.Clear();
            Console.WriteLine("===============================================");
            Console.WriteLine("            ENUNCIADO ATIVIDADE D:");
            Console.WriteLine("Escreva um programa que peça ao usuário para\r\ndigitar um número e exiba o seu quadrado.");
            Console.WriteLine("===============================================");
            Console.WriteLine("");

            Console.Write("Digite o primeiro número: ");
            double numero = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("Resultado: " + (numero * numero));

            Console.WriteLine("");
            Console.WriteLine("Digite ENTER para voltar ao menu principal...");
            Console.ReadKey();
            Console.Clear();
        }
    }
}
