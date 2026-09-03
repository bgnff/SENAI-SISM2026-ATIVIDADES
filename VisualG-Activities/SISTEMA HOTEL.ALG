Algoritmo "Sistema Hotel"
Var
// variavel para selecionar as opções do procedimento menu principal
   opcaoMenu, numQuarto, diaReserva, numReserva : inteiro
   
   nomeUser, mesReserva, pause : Caractere // variavel para armazenar o nome do usuario.


   
Procedimento TelaInicio()
// exibe a tela inicial de boas vindas.
Inicio
      Escreval("================================")
      Escreval("Seja Bem-Vindo ao Hotel Confort!")
      Escreval("================================")
      Escreval("  Digite Enter para continuar.")
      Leia(pause)
FimProcedimento


Procedimento MenuPrincipal()
// exibe o menu principal para seleção e lê a interação com o usuário.
Inicio
      Escreval("==================================")
      Escreval("         Menu Principal")
      Escreval("==================================")
      Escreval(" --- Oque você deseja fazer? --- ")
      Escreval("1 - Consultar quartos disponíveis.")
      Escreval("2 - Reservar um quarto.")
      Escreval("3 - Cancelar uma reserva.")
      Escreval("4 - Fale Conosco.")
      Escreval("5 - Sair.")
      Escreval("==================================")
Leia(opcaoMenu)
FimProcedimento

Procedimento ConsultaQuarto()
// exibe os quartos disponíveis para reserva.
Inicio
limpatela
      Escreval("==================================")
      Escreval("       Quartos Disponíveis")
      Escreval("==================================")
      Escreval("1. Quarto 754(S/VARANDA)")
      Escreval("2. Quarto 102(COMUM)")
      Escreval("3. Quarto 503(LUXURY)")
      Escreval("==================================")
      Escreval("Digite enter para continuar...")
      leia(pause)
      limpatela
Fimprocedimento

Procedimento ReservarQuarto()
// Realiza a reserva dos quartos disponíveis.
Inicio
             Escreva("Digite seu nome: ")
             Leia(nomeUser)
             Escreva("Digite o número do quarto desejado: ")
             Leia(numQuarto)
             Escreval("Para qual mês você deseja reservar o quarto ", numQuarto, "?")
             Escreval("(ex: agosto, setembro..)")
             Leia(mesReserva)
             Escreva("Em qual dia do mês de ", mesReserva, "?")
             Leia(diaReserva)
             limpatela
             Escreval("==================================")
             Escreval("Sua reserva foi concluída!")
             Escreval("==================================")
             Escreval("Dia: ", diaReserva)
             Escreval("Mês: ", mesReserva)
             Escreval("Número do Quarto: ", numQuarto)
             Escreval("Número da Reserva: ", numReserva + 1)
             Escreval("==================================")
             Escreval("Obrigado ", nomeUser, " por escolher o  Hotel Confort.")
             Escreva("Digite enter para continuar...")
             Leia(pause)
             limpatela
FimProcedimento

Procedimento CancelarReserva()
// Realiza o cancelamento da reserva de quartos.
Var
   respostaUser : caractere
   certeza : logico
Inicio
   
      Escreva("Digite o número da sua reserva: ")
      Leia(numReserva)
      Escreval("Reserva nº: ", numReserva, " Quarto: ", numQuarto)
      Escreva("Tem certeza que deseja Cancelar a reserva? (S/N)")
      Leia(respostaUser)
      certeza <- (respostaUser = "S") ou (respostaUser = "s")
       Se certeza Entao
       limpatela
      Escreval("Sua reserva foi cancelada.")
      timer 2000
      timer 0
      limpatela
   Senao
        limpatela
      Escreval("Operção Cancelada. Nada foi desmarcado.")
      timer 2000
      timer 0
      limpatela
   Fimse
FimProcedimento

Procedimento FaleConosco()
// Exibe os meios de suporte da empresa.
Inicio
limpatela
      Escreval("==================================")
      Escreval("   Fale Conosco — Hotel Confort")
      Escreval("==================================")
      Escreval("Olá! ", nomeUser, " Queremos que a sua experiência seja perfeita.")
      Escreval("Entre em contato conosco através dos nossos canais oficiais:")
      Escreval("----------------------------------")
      Escreval("Telefone / WhatsApp: (11) 99999-0000")
      Escreval("E-mail: atendimento@hotelconfort.com.br")
      Escreval("Site: hotelconfort.com.br/suporte")
      Escreval("Recepção: Ramal 9 (diretamente do telefone do seu quarto)")
      Escreval("Horário de atendimento: 24 horas por dia, 7 dias por semana.")
      Escreval("==================================")
      Escreval("Hotel Confort — O seu bem-estar é a nossa prioridade.")
      Escreval("Digite enter para continuar...")
      leia(pause)
      limpatela
Fimprocedimento

Inicio
TelaInicio()
limpatela
        
Repita
 MenuPrincipal()
      
Escolha opcaoMenu
        Caso 1
             ConsultaQuarto()
        Caso 2
             ReservarQuarto()
        Caso 3
             CancelarReserva()
        Caso 4
             FaleConosco()
        Caso 5
             Escreval("Encerrando... Volte sempre!")
        OutroCaso
                 Escreval("Opção inválida. Tente novamente.")
FimEscolha
 Ate opcaoMenu = 5
Fimalgoritmo
      
