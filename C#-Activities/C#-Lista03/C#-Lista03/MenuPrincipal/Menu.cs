using System;
using System.Collections.Generic;
using System.Text;

namespace C__Lista03.MenuPrincipal
{
    internal class Menu
    {
        public static bool continuar = true; // variavel para controlar a execução do menu

        public static int LerNumeroInteiro(string mensagem)
        {
            int resultado;
            while (true)
            {
                Console.Write(mensagem);
                string entrada = Console.ReadLine();

                if (int.TryParse(entrada, out resultado))
                {
                    return resultado; // Retorna o número e sai do método/loop
                }

                Console.WriteLine("Erro: Entrada inválida. Digite apenas números inteiros.");
            }
        }

        // Método para ler números decimais (double) com segurança
        public static double LerNumeroDecimal(string mensagem)
        {
            double resultado;
            while (true)
            {
                Console.Write(mensagem);
                string entrada = Console.ReadLine();

                if (double.TryParse(entrada, out resultado))
                {
                    return resultado;
                }

                Console.WriteLine("Erro: Entrada inválida. Digite um número decimal válido.");
            }
        }


        public static void Executar()
        {
            Console.Clear();
            Console.WriteLine("===================================");
            Console.WriteLine("Bem-vindo ao Menu De Atividades!");
            Console.WriteLine("===================================");
            Console.WriteLine("Escolha uma atividade para testar:");
            Console.WriteLine("");
            Console.WriteLine("1. Atividade A");
            Console.WriteLine("2. Atividade B");
            Console.WriteLine("3. Atividade C");
            Console.WriteLine("4. Atividade D");
            Console.WriteLine("5. Atividade E");
            Console.WriteLine("6. Atividade F");
            Console.WriteLine("7. Atividade G");
            Console.WriteLine("8. Atividade H");
            Console.WriteLine("9. Atividade I");
            Console.WriteLine("10. Atividade J");
            Console.WriteLine("0. Sair");
            Console.WriteLine("====================================");
            Console.WriteLine("");
            Console.Write("Digite o número da atividade desejada: ");

            string opcao = Console.ReadLine();
            switch (opcao)
            {
                case "0":
                    Console.WriteLine("Saindo do programa...");
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
                case "8":
                    Atividades.H.Executar();
                    break;
                case "9":
                    Atividades.I.Executar();
                    break;
                case "10":
                    Atividades.J.Executar();
                    break;

                default:
                    Console.WriteLine("Opção inválida. Tente novamente.");
                    Console.WriteLine("Aperte qualquer tecla para continuar...");
                    Console.ReadKey();
                    break;
            }
        }
    }
}
