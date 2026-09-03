Algoritmo "Sistema Biblioteca Digital"
// Disciplina : Linguagem e Lógica de Programação
// Professor  : Antonio Carlos Nicolodi

Var
   opcaoMenu : inteiro
   nome, livro : caractere


// Procedimento para exibir a tela inicial
Procedimento TelaInicial()
Inicio
   Escreval("=======================================")
   Escreval(" Bem-vindo ao Sistema Biblioteca Saber")
   Escreval("=======================================")
   Escreval("Pressione Enter para continuar...")
FimProcedimento


// Procedimento para exibir o menu principal
Procedimento MenuPrincipal()
Inicio
   Escreval("")
   Escreval("=======================================")
   Escreval("            MENU PRINCIPAL")
   Escreval("=======================================")
   Escreval("1 - Consultar Livros Disponíveis")
   Escreval("2 - Empréstimo de Livros")
   Escreval("3 - Devolução de Livros")
   Escreval("4 - Fale Conosco")
   Escreval("5 - Sair")
   Escreval("=======================================")
   Escreva("Escolha uma opção: ")
   Leia(opcaoMenu)
FimProcedimento


// Procedimento para consulta de livros
Procedimento ConsultarLivro()
Inicio
   Escreval("")
   Escreval("=======================================")
   Escreval("          LIVROS DISPONÍVEIS")
   Escreval("=======================================")
   Escreval("1 - O Hobbit")
   Escreval("2 - Dom Casmurro")
   Escreval("3 - A Revolução dos Bichos")
   Escreval("=======================================")
FimProcedimento


// Procedimento para realizar empréstimo de livros
Procedimento EmprestimoLivro()
Inicio
   Escreval("")
   Escreval("=======================================")
   Escreval("        EMPRÉSTIMO DE LIVROS")
   Escreval("=======================================")

   Escreva("Digite o seu nome: ")
   Leia(nome)

   Escreva("Digite o nome do livro que deseja emprestar: ")
   Leia(livro)

   Escreval("")
   Escreval(nome, " pegou emprestado o livro: ", livro)
FimProcedimento


// Procedimento para devolução de livros
Procedimento DevolucaoLivro()
Inicio
   Escreval("")
   Escreval("=======================================")
   Escreval("         DEVOLUÇÃO DE LIVROS")
   Escreval("=======================================")

   Escreva("Digite o seu nome: ")
   Leia(nome)

   Escreva("Digite o nome do livro que deseja devolver: ")
   Leia(livro)

   Escreval("")
   Escreval(nome, " devolveu o livro: ", livro)
FimProcedimento


// Procedimento para Fale Conosco
Procedimento FaleConosco()
Inicio
   Escreval("")
   Escreval("=======================================")
   Escreval("             FALE CONOSCO")
   Escreval("=======================================")
   Escreval("Para dúvidas, entre em contato:")
   Escreval("atendimento@bibliotecasaber.com")
FimProcedimento


// Programa principal
Inicio

   TelaInicial()

   Repita

      MenuPrincipal()

      Escolha opcaoMenu

         Caso 1
            ConsultarLivro()

         Caso 2
            EmprestimoLivro()

         Caso 3
            DevolucaoLivro()

         Caso 4
            FaleConosco()

         Caso 5
            Escreval("")
            Escreval("Encerrando o sistema... Até logo!")

         OutroCaso
            Escreval("")
            Escreval("Opção inválida! Tente novamente.")

      FimEscolha

   Ate opcaoMenu = 5

FimAlgoritmo