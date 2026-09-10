using System;
using C__CalculadoraDeGrandezas.MenuPrincipal; // Permite enxergar a classe Menu

namespace C__CalculadoraDeGrandezas.Main
{
    public class Program
    {
        static void Main()
            {
                while (Menu.continuar) 
                {
                    Menu.Executar();
                }
            }
    }
}