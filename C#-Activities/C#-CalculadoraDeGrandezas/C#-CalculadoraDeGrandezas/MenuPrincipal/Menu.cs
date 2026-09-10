using System;
using System.Collections.Generic;
using System.Text;
using C__CalculadoraDeGrandezas.Calculos;

namespace C__CalculadoraDeGrandezas.MenuPrincipal
{
    internal class Menu
    {
        static void CalcularPotencia()
        {
            // 2. Puxa o método público dela. O código limpa a tela, 
            // faz a pergunta, calcula e depois volta para o menu sozinho!
            CalculoPotencia.ExecutarP();
        }

        static void CalcularResistencia()
        {
            CalculoResistencia.Executar();
        }

        static void CalcularCorrente()
        {
            CalculoCorrente.Executar();
        }

        static void CalcularTensao()
        {
            CalculoTensao.Executar();
        }


        public static bool continuar = true;
        public static void Executar()

        {

            Console.Clear();
            Console.WriteLine("====================================");
            Console.WriteLine("     CALCULADORA DE GRANDEZAS");
            Console.WriteLine("====================================");
            Console.WriteLine("");

            // Mostra a opção para calcular tensão.
            Console.WriteLine("1 - Calcular Tensão");

            // Mostra a opção para calcular corrente.
            Console.WriteLine("2 - Calcular Corrente");

            // Mostra a opção para calcular resistência.
            Console.WriteLine("3 - Calcular Resistência");

            // Mostra a opção para calcular potência.
            Console.WriteLine("4 - Calcular Potência");

            // Mostra a opção para finalizar o programa.
            Console.WriteLine("0 - Sair");

            // Adiciona outra linha vazia.
            Console.WriteLine();
            Console.WriteLine("====================================");

            Console.Write("Selecione: ");
            string opcao = Console.ReadLine();

            switch (opcao)
            {

                case "1": CalcularTensao(); break;
                case "2": CalcularCorrente(); break;
                case "3": CalcularResistencia(); break;
                case "4": CalcularPotencia(); break;
                case "0":
                    continuar = false;
                        Console.WriteLine("Fechando a calculadora... Até mais!");
                    Environment.Exit(0); // <--- Finaliza o programa aqui de forma limpa
                    break;

                default: Console.WriteLine("Opção Inválida."); break;

            }


        }
    }
}
