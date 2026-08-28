using System; // Importa a biblioteca necessária para usar o console.

namespace Fase9_Calculadora // Define o nome do espaço de trabalho como Fase9_Calculadora.
{
    class Fase9 // Definine a classe Fase9.
    {
        static void Main() // Define o método principal que será executado quando o programa iniciar.
        {
            Console.WriteLine("Calculadora Simples"); // Exibe uma mensagem no console.
            Console.WriteLine("Escolha a operação:"); // Solicita ao usuário que escolha uma operação.
            Console.WriteLine("1 - Adição"); // Opção de adição.
            Console.WriteLine("2 - Subtração"); // Opção de subtração.
            Console.WriteLine("3 - Multiplicação"); // Opção de multiplicação.
            Console.WriteLine("4 - Divisão"); // Opção de divisão.
            int operacao = Convert.ToInt32(Console.ReadLine()); // Lê a escolha do usuário e converte para inteiro.
            Console.WriteLine("Digite o primeiro número:"); // Solicita o primeiro número.
            double num1 = Convert.ToDouble(Console.ReadLine()); // Lê o primeiro número e converte para double.
            Console.WriteLine("Digite o segundo número:"); // Solicita o segundo número.
            double num2 = Convert.ToDouble(Console.ReadLine()); // Lê o segundo número e converte para double.
            double resultado; // Declara a variável resultado.
            switch (operacao) // Inicia uma estrutura de decisão baseada na operação escolhida.
            {
                case 1: // Caso a operação seja adição.
                    resultado = num1 + num2; // Realiza a adição.
                    Console.WriteLine($"Resultado: {resultado}"); // Exibe o resultado.
                    break; // Sai do switch.
                case 2: // Caso a operação seja subtração.
                    resultado = num1 - num2; // Realiza a subtração.
                    Console.WriteLine($"Resultado: {resultado}"); // Exibe o resultado.
                    break; // Sai do switch.
                case 3: // Caso a operação seja multiplicação.
                    resultado = num1 * num2; // Realiza a multiplicação.
                    Console.WriteLine($"Resultado: {resultado}"); // Exibe o resultado.
                    break; // Sai do switch.
                case 4: // Caso a operação seja divisão.
                    if (num2 != 0) // Verifica se o divisor não é zero para evitar erro de divisão por zero.
                    {
                        resultado = num1 / num2; // Realiza a divisão.
                        Console.WriteLine($"Resultado: {resultado}"); // Exibe o resultado.
                    }
                    else
                    {
                        Console.WriteLine("Erro: Divisão por zero não é permitida."); // Exibe uma mensagem de erro.
                    }
                    break; // Sai do switch.
            }
        }
    }
}

