namespace Lista07_While_DoWhile;

internal static class Entrada
{
    public static string Texto(string mensagem)
    {
        Console.Write(mensagem);
        // Se a entrada terminar, avisa Main por meio de uma exceção.
        return Console.ReadLine() ?? throw new EndOfStreamException();
    }

    public static int Inteiro(string mensagem, int minimo = int.MinValue)
    {
        // Pede novamente até receber um inteiro válido; return encerra a repetição.
        while (true)
        {
            if (int.TryParse(Texto(mensagem), out int valor) && valor >= minimo)
                return valor;
            Console.WriteLine(minimo == int.MinValue
                ? "Digite um número inteiro válido (entre -2147483648 e 2147483647)."
                : $"Digite um número inteiro entre {minimo} e 2147483647.");
        }
    }

    public static string Senha(string mensagem)
    {
        string senha;
        // Lê pelo menos uma senha e repete se estiver vazia.
        do
        {
            senha = Texto(mensagem);
            if (string.IsNullOrWhiteSpace(senha)) Console.WriteLine("A senha não pode ficar vazia.");
        } while (string.IsNullOrWhiteSpace(senha));
        return senha;
    }
}
