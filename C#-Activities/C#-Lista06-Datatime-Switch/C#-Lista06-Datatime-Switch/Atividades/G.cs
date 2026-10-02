using System;
using System.Collections.Generic;

namespace C__Lista06_Datatime_Switch.Atividades
{

    internal class G
    {
        public static void Executar()
        {
            Console.Clear();
            Console.WriteLine("Enunciado: Crie um programa que permita ao usuário escolher uma cor\r\n (vermelho, azulou verde) e exiba uma mensagem informando a cor escolhida.");
            Thread.Sleep(2000);
            Console.WriteLine();

            Console.WriteLine("Escolha uma cor: ");
            Console.WriteLine("1 - Vermelho");
            Console.WriteLine("2 - Azul");
            Console.WriteLine("3 - Verde");
            Console.WriteLine();
            Console.Write("Digite a opção desejada: ");
            string opcao = Console.ReadLine();

            switch (opcao)
            {
                case "1":
                    Console.ForegroundColor = ConsoleColor.Red;  //usamos console.ForegroundColor para atribuir a cor vermelha ao texto que será exibido no console.
                    // Usamos ConsoleColor.Red para definir a cor do texto como vermelho.
                    Console.WriteLine("Você escolheu a cor Vermelho!");
                    Console.ResetColor();
                    // Depois de exibir a mensagem, podemos restaurar a cor original usando console.ResetColor() para que o restante do texto seja exibido na cor padrão do console.
                    break;
                case "2":
                    Console.ForegroundColor = ConsoleColor.Blue; 
                    Console.WriteLine("Você escolheu a cor Azul!");
                    Console.ResetColor();
                    break;
                case "3":
                    Console.ForegroundColor = ConsoleColor.Green;
                    Console.WriteLine("Você escolheu a cor Verde!");
                    Console.ResetColor();
                    break;
                default:
                    Console.ForegroundColor = ConsoleColor.Yellow;
                    Console.WriteLine("Opção inválida. Tente novamente.");
                    Console.ResetColor();
                    break;

            }

            Console.WriteLine();
            Console.WriteLine("Aperte qualquer tecla para continuar...");
            Console.ReadKey();

        }

    }
}
