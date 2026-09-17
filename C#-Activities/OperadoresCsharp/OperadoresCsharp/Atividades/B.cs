using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OperadoresCsharp.Atividades
{
    internal class B
    {
        public static void Executar()
        {
            Console.Clear();
            Console.WriteLine("===============================================");
            Console.WriteLine("            ENUNCIADO ATIVIDADE B:");
            Console.WriteLine("Escreva um programa que peça ao usuário para\r\ndigitar um número e exiba oseu dobro.");
            Console.WriteLine("===============================================");
            Console.WriteLine("");

            Console.Write("Digite um número: ");
            double numero = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("Resultado: " + (numero * 2));

            Console.WriteLine("");
            Console.WriteLine("Digite ENTER para voltar ao menu principal...");
            Console.ReadKey();
            Console.Clear();

        }
    }
}
