using System; // Importa a biblioteca para usar o Console.

namespace Fase3 // Define o nome do espaço de trbalho como Fase3.
{
    class Fase3 // A classe Fase3 onde o código será executado.
    {
        static void Main() // Inicio da execução do método Main.
        {
            int a = 10, b = 5; // Declara duas variáveis 'a' e 'b' do tipo inteiro e atribui valores a elas.
            int soma = a + b; // A variável 'soma' armazena o resultado da soma de 'a' e 'b'.
            int produto = a * b; // A variável 'produto' armazena o resultado da multiplicação de 'a' e 'b'.

            Console.WriteLine("Soma: " + soma); // Exibe o resultado da soma no console.
            Console.WriteLine("Produto: " + produto); // Exibe o resultado do produto no console.

            Console.ReadLine(); //Aguarda o usuário pressionar Enter antes de encerrar o programa.
        }
    }
}