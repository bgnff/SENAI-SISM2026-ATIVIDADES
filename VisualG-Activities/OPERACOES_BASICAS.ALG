Algoritmo "Operacoes_Basicas"
// Disciplina   : [Linguagem e Lógica de Programação] 
// Professor   : Antonio Carlos Nicolodi 

// Este algoritmo mostra algumas operações básicas em programação
// Ele recebe dois números digitados pelo usuário e realiza cálculos simples.

var

   // Declaração das variáveis
   // real permite trabalhar com números inteiros e decimais
   numero1, numero2: real
   soma, subtracao, multiplicacao, divisao, media: real

inicio

   // Exibe uma mensagem inicial para o usuário
   escreval("=== OPERAÇÕES BÁSICAS NO VISUALG ===")
   escreval

   // Solicita o primeiro número
   escreva("Digite o primeiro número: ")

   // Lê o valor digitado e armazena na variável numero1
   leia(numero1)

   // Solicita o segundo número
   escreva("Digite o segundo número: ")

   // Lê o valor digitado e armazena na variável numero2
   leia(numero2)

   // Operação de soma
   soma <- numero1 + numero2

   // Operação de subtração
   subtracao <- numero1 - numero2

   // Operação de multiplicação
   multiplicacao <- numero1 * numero2

   // Operação de divisão
   divisao <- numero1 / numero2

   // Cálculo da média dos dois números
   media <- (numero1 + numero2) / 2

   // Exibe uma linha em branco para organizar a saída
   escreval("")

   // Exibe os resultados das operações
   escreval("=== RESULTADOS ===")

   // Mostra o resultado da soma
   escreval("Soma: ", soma)

   // Mostra o resultado da subtração
   escreval("Subtração: ", subtracao)

   // Mostra o resultado da multiplicação
   escreval("Multiplicação: ", multiplicacao)

   // Mostra o resultado da divisão
   escreval("Divisão: ", divisao)

   // Mostra o resultado da média
   escreval("Média: ", media)

fimalgoritmo
