using System;


namespace Fase2 // Define o namespace "Fase2" que agrupa as classes relacionadas.
{
    class Fase2 // Define a classe "Fase2" que contém o código a ser executado.
    {
        static void Main(string[] args) // O método "Main", que é o ponto de entrada do programa.
        {
            int idade = 25; // Declara uma variável inteira chamada "idade" e atribui o valor 25 a ela.
            string nome = "Brayan"; // Declara uma variável string chamada "nome" e atribui o valor "Brayan" a ela.
            double altura = 1.75; // Declara uma variável double chamada "altura" e armazena um número decimal tipo double.

            Console.WriteLine("Nome: " + nome);
            Console.WriteLine("Idade: " + idade);
            Console.WriteLine("Altura: " + altura);

            Console.ReadLine(); // Aguarda o usuário pressionar Enter antes de encerrar o programa.
        }
    }
}
