using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OperadoresCsharp.Menu
{
    internal class BemVindo
    {
        public static void Mensagem() // Método para exibir a mensagem de boas-vindas
        {
            Console.WriteLine("===================================================");
            Console.WriteLine("             Olá! Seja Bem-vindo!");
            Console.WriteLine("===================================================");
            Console.WriteLine("Meu nome é Brayan e Esse programa contém:");
            Console.WriteLine("Atividades de operadores lógicos em C# (Csharp) ");
            Console.WriteLine("Navegue e veja a lógica usada para desenvolve-lo.");
            Console.WriteLine("===================================================");
            Console.WriteLine("Digite ENTER para continuar...");
            Console.ReadLine();
            Console.Clear();
        }
    }
}
