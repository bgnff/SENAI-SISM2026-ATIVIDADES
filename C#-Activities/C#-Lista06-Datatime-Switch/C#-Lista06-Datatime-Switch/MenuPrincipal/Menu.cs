using System;
using System.Collections.Generic;
using System.Text;


namespace C__Lista06_Datatime_Switch.MenuPrincipal
{
    internal class Menu
    {
        public static bool Continuar = true;

        public static DateTime LerDateTime(string mensagem)
        {

            DateTime resultado;
            while (true)
            {
                 try
                {
                    Console.Write(mensagem);
                    string entrada = Console.ReadLine();
                    entrada = DateTime.ParseExact(entrada, "dd/MM/yyyy", null).ToString("dd/MM/yyyy");


                    if (DateTime.TryParse(entrada, out resultado))
                    {

                        return resultado; // Retorna a data e sai do método/loop

                    }
                    
                 }
                 catch (FormatException)
                {
                    
                        Console.WriteLine("Erro: Entrada inválida. Digite no formato especificado.");
                    Console.WriteLine("Pressione qualquer tecla para tentar novamente...");
                    Console.ReadKey();
                    Console.Clear();

                }
            }
        }
        public static void Executar()
        {
            Console.Clear();
            Console.WriteLine("===================================");
            Console.WriteLine("Bem-vindo ao Menu De Atividades!");
            Console.WriteLine("===================================");
            Console.WriteLine();
            Console.WriteLine("Escolha uma opção:");
            Console.WriteLine("1 - Atividade A");
            Console.WriteLine("2 - Atividade B");
            Console.WriteLine("3 - Atividade C");
            Console.WriteLine("4 - Atividade D");
            Console.WriteLine("5 - Atividade E");
            Console.WriteLine("6 - Atividade F");
            Console.WriteLine("7 - Atividade G");
            Console.WriteLine("8 - Atividade H");
            Console.WriteLine("0 - Sair");
            Console.WriteLine("====================================");
            Console.WriteLine();

            Console.Write("Digite a opção desejada: ");

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
                case "6":
                    Atividades.F.Executar();
                    break;
                case "7":
                    Atividades.G.Executar();
                    break;

                default:
                    Console.WriteLine("Opção inválida. Tente novamente.");
                    Thread.Sleep(1000);
                    break;
            }
        }
    }
}
