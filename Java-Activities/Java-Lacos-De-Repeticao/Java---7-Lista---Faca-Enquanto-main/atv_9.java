package Atividades.Java_7_Lista_Faça_Enquanto;

import java.util.Scanner;

public class atv_9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome, reset, vermelho, verde;
        int cont;
        cont = 3;
        reset = "\u001B[0m";
        vermelho = "\u001B[31m";
        verde = "\u001B[32m";

        System.out.println("Para fazer o login, digite o seu user com o crachá de sua empresa: ");
        nome = sc.next();

        do {

            if (!nome.startsWith("SENAI-")) {

                System.out.println(vermelho + "Crachá Inválido. Tente novamente:");
                System.out.println("Você tem mais " + vermelho + cont + " tentativas.");
                cont = cont - 1;
                nome = sc.next();

            }
            if (cont < 1) {
                break;
            }

        } while (!nome.startsWith("SENAI-"));
        sc.close();

        nome = (!nome.startsWith("SENAI-")) ? vermelho + "Sua conta foi bloqueada por questões de segurança." : verde + "Login realizado. Seja bem vindo!";
        System.out.println(nome);
    }
}
