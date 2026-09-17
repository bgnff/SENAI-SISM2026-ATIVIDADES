using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OperadoresCsharp.Atividades
{
    internal class A
    {

        public static void Executar()
        {
            Console.Clear();
            Console.WriteLine("===============================================");
            Console.WriteLine("                 ENUNCIADO:");
            Console.WriteLine("Escreva um programa que peça ao usuário para\r\ndigitar dois números e exiba a soma deles.");
            Console.WriteLine("===============================================");
            Console.WriteLine("");
            Console.Write("Digite o primeiro número: ");
            int numero1 = Convert.ToInt32(Console.ReadLine());
            Console.Write("Digite o segundo número: ");
            int numero2 = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Resultado: " + (numero1 + numero2));
            Console.WriteLine("");
            Console.WriteLine("Digite ENTER para voltar ao menu principal...");
            Console.ReadKey();
            Console.Clear();


        }


    }
}
