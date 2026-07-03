package Atividades.java_Flowgorithm_4_Lista_Revisao;

import java.util.Scanner;

public class atv_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char num;
        int num2, num3, soma, result;

        System.out.println("CALCULADORA INICIADA!\nDigite a caractere desejada para operação:");
        System.out.println("+ - SOMA");
        System.out.println("* - MULTIPLICAÇÃO");
        System.out.println("/ - DIVISÃO");
        System.out.println("- - SUBTRAÇÃO");
        num = sc.next().charAt(0);

        while (num != '+' && num != '*' && num != '/' && num != '-') {

            System.out.println("ESSA CARACTERE NÃO EXISTE NO PAINEL.");
            System.out.println("Digite uma caractere correspondente ao painel: ");
            num = sc.next().charAt(0);

        }
        if (num == '+') {

            System.out.println("OPÇÃO SELECIONADA: ADIÇÃO");

            System.out.println("Digite os valores:");
            num2 = sc.nextInt();
            System.out.println("+");
            num3 = sc.nextInt();
            soma = num2 + num3;
            System.out.println(num2 + " + " + num3 + " = " + soma);

        } else if (num == '*') {

            System.out.println("OPÇÃO SELECIONADA: MULTIPLICAÇÃO");

            System.out.println("Digite os valores:");
            num2 = sc.nextInt();
            System.out.println("X");
            num3 = sc.nextInt();
            soma = num2 * num3;
            System.out.println(num2 + " X " + num3 + " = " + soma);


        } else if (num == '/') {

            System.out.println("OPÇÃO SELECIONADA: DIVISÃO");

            System.out.println("Digite os valores:");
            num2 = sc.nextInt();
            System.out.println(":");
            num3 = sc.nextInt();
            soma = num2 / num3;
            System.out.println(num2 + " : " + num3 + " = " + soma);

        } else if (num == '-') {

            System.out.println("OPÇÃO SELECIONADA: SUBTRAÇÃO");

            System.out.println("Digite os valores:");
            num2 = sc.nextInt();
            System.out.println("-");
            num3 = sc.nextInt();
            soma = num2 - num3;
            System.out.println(num2 + " - " + num3 + " = " + soma);
        }
        sc.close();



    }


}
