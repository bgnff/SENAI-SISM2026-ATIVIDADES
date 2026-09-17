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
            Console.WriteLine("Escreva um programa que peça ao usuário para\r\ndigitar um número e exiba o seu valor absoluto.");
            Console.WriteLine("===============================================");
            Console.WriteLine("");
            Console.Write("Digite um número: ");
            double numero = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("Resultado: " + Math.Abs(numero));
            Console.WriteLine("");
            Console.WriteLine("Digite ENTER para voltar ao menu principal...");
            Console.ReadKey();
            Console.Clear();
        }
    }
}
