using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography.X509Certificates;
using System.Text;
using System.Threading.Tasks;

namespace OperadoresCsharp.Menu
{
    internal class MenuPrincipal
    {
        public static bool continuar = true; // variavel para controlar o loop do menu principal
        public static void Executar()
        {

            Console.WriteLine("  Escolha uma opção:");
            Console.WriteLine("=======================");
            Console.WriteLine("1. Executar Atividade A");
            Console.WriteLine("2. Executar Atividade B");
            Console.WriteLine("3. Executar Atividade C");
            Console.WriteLine("4. Executar Atividade D");
            Console.WriteLine("5. Executar Atividade E");
            Console.WriteLine("6. Executar Atividade F");
            Console.WriteLine("7. Executar Atividade G");
            Console.WriteLine("8. Executar Atividade H");
            Console.WriteLine("9. Executar Atividade I");
            Console.WriteLine("10. Executar Atividade J");
            Console.WriteLine("0. Sair");

            Console.WriteLine("");

            Console.Write("Digite uma opção: ");
            string opcao = Console.ReadLine(); 
            switch (opcao)
            {
                case "0":

                    continuar = false;
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
                    Console.WriteLine("Atividade E ainda não implementada.");
                    break;
                case "6":
                    Atividades.F.Executar();
                    break;
                case "7":
                    Console.WriteLine("Atividade G ainda não implementada.");
                    break;
                case "8":
                    Console.WriteLine("Atividade H ainda não implementada.");
                    break;
                case "9":
                    Console.WriteLine("Atividade I ainda não implementada.");
                    break;
                case "10":
                    Console.WriteLine("Atividade J ainda não implementada.");
                    break;
                default: // defalt é executado quando nenhuma das opções anteriores é atendida
                    Console.Clear(); 
                    Console.WriteLine("Opção inválida. Tente novamente.");
                    Console.WriteLine("Aperte ENTER para voltar ao menu principal...");
                    Console.ReadKey();
                    Console.Clear();
                    break;


            }
        }
    }
}
