using System;
using System.Collections.Generic;
using System.Text;


namespace C__Lista06_Datatime_Switch.MenuPrincipal
{
    internal class Menu
    {
        public static bool Continuar = true;
        public static void Executar()
        {
            Console.Clear();
            Console.WriteLine("Escolha uma opção:");
            Console.WriteLine("1 - Atividade A");
            Console.WriteLine("2 - Atividade B");
            Console.WriteLine("3 - Atividade C");
            Console.WriteLine("4 - Atividade D");
            Console.WriteLine("5 - Atividade E");
            Console.WriteLine("0 - Sair");

            string opcao = Console.ReadLine();
            switch (opcao)
            {
                case "0":
                    Console.WriteLine("Saindo...");
                    Environment.Exit(0);
                    break;
                case "1":
                    Atividades.A.Executar();
                    break;
                case "2":
                    Atividades.B.Executar();
                    break;
                case "3":
                    Atividades.C.Executar();
                    break;
                case "4":
                    Atividades.D.Executar();
                    break;
                case "5":
                    Atividades.E.Executar();
                    break;
                default:
                    Console.WriteLine("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
