using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OperadoresCsharp.Atividades
{
    internal class G
    {
        public static void Executar()
        {
            Console.Clear();
            Console.WriteLine("===============================================");
            Console.WriteLine("           ENUNCIADO ATIVIDADE G:");
            Console.WriteLine("Escreva um programa que peça ao usuário para\r\ndigitar dois números e exiba o resultado da subtração do segundo pelo primeiro.");
            Console.WriteLine("===============================================");
            Console.WriteLine("");

            Console.Write("Digite o primeiro número: ");
            double numero1 = Convert.ToDouble(Console.ReadLine());
            Console.Write("Digite o segundo número: ");
            double numero2 = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine();
            Console.WriteLine("Resultado: " + (numero2 - numero1));

            Console.WriteLine("");
            Console.WriteLine("Digite ENTER para voltar ao menu principal...");
            Console.ReadKey();
            Console.Clear();
        }
    }
}
