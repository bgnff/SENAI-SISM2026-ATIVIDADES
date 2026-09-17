using System;
namespace OperadoresCsharp.Main;
using OperadoresCsharp.Menu;
public class Program
{
    static void Main()
    {
        BemVindo.Mensagem(); // Exibe a mensagem de boas-vindas

        while (MenuPrincipal.continuar)
        {
               MenuPrincipal.Executar(); // Chama o método Executar() da classe MenuPrincipal para exibir o menu e processar a escolha do usuário
        }

    }

}

  