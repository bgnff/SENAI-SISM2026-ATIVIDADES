namespace Lista07_While_DoWhile;

internal sealed class Menu
{
    // O tipo base permite reunir diferentes atividades na mesma lista.
    private readonly Atividade[] atividades =
    {
        new AtividadeA(), new AtividadeB(), new AtividadeC(), new AtividadeD(),
        new AtividadeE(), new AtividadeF(), new AtividadeG(), new AtividadeH(),
        new AtividadeI(), new AtividadeJ(), new AtividadeK(), new AtividadeL()
    };

    public void Executar()
    {
        string opcao;
        // O menu aparece pelo menos uma vez e se repete até a opção 0.
        do
        {
            Console.WriteLine("\n=== LISTA 07 — WHILE / DO WHILE ===");
            foreach (Atividade atividade in atividades)
                Console.WriteLine($"{atividade.Letra}) {atividade.Titulo} ({atividade.Estrutura})");
            Console.WriteLine("0) Sair");
            opcao = Entrada.Texto("Escolha uma letra de a a l, ou 0: ").Trim().ToLowerInvariant();
            if (opcao == "0") continue;
            // Busca pela letra; null significa que nenhuma atividade foi encontrada.
            Atividade? selecionada = Array.Find(atividades, atividade => atividade.Letra == opcao);
            if (selecionada is null)
            {
                Console.WriteLine("Opção inválida. Escolha uma letra de a a l ou 0.");
                continue;
            }
            selecionada.Apresentar();
            Entrada.Texto("\nPressione Enter para voltar ao menu...");
        } while (opcao != "0");
        Console.WriteLine("Até logo!");
    }
}
