using System;
using System.Collections.Generic;
using System.ComponentModel.Design;
using System.Security.Cryptography.X509Certificates;
using System.Text;

namespace C__Lista06_Datatime_Switch.Atividades
{
    internal class H
    {

        // Método para verificar se um caractere é uma vogal
        public static bool EhVogal(char c)
        {
            // Converte a letra para minúscula para facilitar a comparação
            char letra = char.ToLower(c);

            // Verifica se a letra é uma vogal
            return "aeiou".Contains(letra);
        }
        public static void Executar()
        {
            Console.Clear();
            Console.WriteLine("Enunciado: Crie um programa que permita ao usuário inserir uma letra e exiba uma\r\nmensagem informando se é uma vogal ou consoante.");
            Thread.Sleep(2000);
            Console.WriteLine();

            Console.Write("Insira qualquer tecla: ");
            string entrada = Console.ReadLine();


            // Verifica se  usuario realmente digitou algo usando IsNullOrEmpty.
            // se não digitou nada, não faz nada.
            if (!string.IsNullOrEmpty(entrada));
            {


                // Pega a primeira letra da entrada do usuário
                char primeiraLetra = entrada[0];

                // Chama o método EhVogal para verificar se a letra é uma vogal
                if (EhVogal(primeiraLetra))
                {

                    // Se for uma vogal, exibe a mensagem correspondente
                    Console.WriteLine($"A letra '{primeiraLetra}' é uma vogal.");

                }
                else
                {

                    // Se não for uma vogal, exibe a mensagem correspondente
                    Console.WriteLine($"A letra '{primeiraLetra}' é uma consoante.");
                }


                Console.WriteLine("Aperte qualquer tecla para continuar...");
                Console.ReadKey();
            }
        }
    }
}
