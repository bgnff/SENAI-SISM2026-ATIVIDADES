using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Text;

namespace C__Lista06_Datatime_Switch.Atividades
{
    internal class E
    {
        public static void Executar()
        {
            Console.Clear();
            Console.WriteLine("Enunciado: Crie um programa que permita ao usuário escolher uma opção de menu \r\n(1, 2 ou 3) e exiba uma mensagem de acordo com a opção escolhida.");
            Thread.Sleep(2000);
            Console.WriteLine();

            Console.WriteLine("Escolha uma opção de menu: ");
            Console.WriteLine("1 - Acesse meu github");
            Console.WriteLine("2 - Acesse meu Linkedin");
            Console.WriteLine("3 - Voltar ao menu principal");
            Console.WriteLine();

            Console.Write("Digite a opção desejada: ");
            string opcao = Console.ReadLine();

            switch (opcao)
            {
                case "1":
                    Console.WriteLine("Acesse meu github!");

                    Process.Start(new ProcessStartInfo // Abrir o link do GitHub no navegador padrão
                    {
                        FileName = "https://github.com/bgnff",
                        UseShellExecute = true
                    });

                    break;
                case "2":
                    Console.WriteLine("Acesse o meu Linkedin");

                    Process.Start(new ProcessStartInfo
                    // Abrir o link do LinkedIn no navegador padrão
                    {
                        FileName = "https://www.linkedin.com/in/brayan-oliveira-955242351?utm_source=share_via&utm_content=profile&utm_medium=member_ios",
                        // FileName direciona para o link do LinkedIn
                        UseShellExecute = true 
                        // UseShellExecute é definido como true para abrir o link no navegador padrão do sistema em que o programa está sendo executado.

                    });

                    break;
                case "3":
                    Console.WriteLine("Volte ao e navegue pelas atividades: ");
                    break;
                default:
                    Console.WriteLine("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
