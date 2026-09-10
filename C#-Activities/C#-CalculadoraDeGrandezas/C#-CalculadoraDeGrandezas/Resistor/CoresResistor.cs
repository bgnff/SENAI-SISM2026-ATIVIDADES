using C__CalculadoraDeGrandezas.Calculos;
using System;
using System.Collections.Generic;
using System.Text;

namespace C__CalculadoraDeGrandezas.Resistor
{
    internal class CoresResistor
    {
        // Mapeamento de cores com suas respectivas cores do Console
        private static readonly Dictionary<string, ConsoleColor> MapaCores = new Dictionary<string, ConsoleColor>
        {
            { "Preto", ConsoleColor.Gray },
            { "Marrom", ConsoleColor.DarkYellow },
            { "Vermelho", ConsoleColor.Red },
            { "Laranja", ConsoleColor.Yellow },
            { "Amarelo", ConsoleColor.Yellow },
            { "Verde", ConsoleColor.Green },
            { "Azul", ConsoleColor.Blue },
            { "Violeta", ConsoleColor.Magenta },
            { "Cinza", ConsoleColor.Gray },
            { "Branco", ConsoleColor.White },
            { "Dourado", ConsoleColor.Yellow }
        };

        // Método auxiliar para imprimir texto colorido
        private static void ImprimirColorido(string texto, string cor)
        {
            if (MapaCores.TryGetValue(cor, out ConsoleColor consoleColor))
            {
                ConsoleColor corAnterior = Console.ForegroundColor;
                Console.ForegroundColor = consoleColor;
                Console.Write(texto);
                Console.ForegroundColor = corAnterior;
            }
            else
            {
                Console.Write(texto);
            }
        }

        public static void Executar(double resistencia)
        {
            string[] cores =
            {
            "Preto", "Marrom", "Vermelho", "Laranja", "Amarelo",
            "Verde", "Azul", "Violeta", "Cinza", "Branco"
        };

            if (resistencia <= 0)
            {
                Console.WriteLine("Resistência inválida.");
                return;
            }

            int multiplicador = 0;
            double valor = resistencia;

            // Reduz o valor até ficar com dois dígitos
            while (valor >= 100)
            {
                valor /= 10;
                multiplicador++;
            }

            int numero = (int)Math.Round(valor);

            // Se arredondar para 100, ajusta novamente
            if (numero >= 100)
            {
                numero /= 10;
                multiplicador++;
            }

            // Separa os dois dígitos
            int primeiroDigito = numero / 10;
            int segundoDigito = numero % 10;

            // Descobre as cores
            string primeiraCor = cores[primeiroDigito];
            string segundaCor = cores[segundoDigito];
            string terceiraCor = cores[multiplicador];

            // A quarta banda será tolerância de 5%
            string quartaCor = "Dourado";

            Console.WriteLine($"Resistência: {resistencia} Ω");
            Console.WriteLine();

            Console.WriteLine("Cores do resistor:");
            Console.Write("  ");
            ImprimirColorido(primeiraCor, primeiraCor);
            Console.Write(" | ");
            ImprimirColorido(segundaCor, segundaCor);
            Console.Write(" | ");
            ImprimirColorido(terceiraCor, terceiraCor);
            Console.Write(" | ");
            ImprimirColorido(quartaCor, quartaCor);
            Console.WriteLine();

            Console.WriteLine();
            Console.WriteLine("Digite ENTER para continuar...");
            Console.ReadLine();
            Console.Clear();
        }
    }
}
