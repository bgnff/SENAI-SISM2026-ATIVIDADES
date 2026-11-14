using System.Text;

namespace Lista07_While_DoWhile;

internal static class Program
{
    private static void Main()
    {
        Console.OutputEncoding = Encoding.UTF8;
        Console.InputEncoding = Encoding.UTF8;
        try { new Menu().Executar(); }
        catch (EndOfStreamException) { Console.WriteLine("\nEntrada encerrada. Até logo!"); }
    }
}
