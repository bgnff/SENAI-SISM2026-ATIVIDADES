package Atividades.Java_7_Lista_Faça_Enquanto;

import java.util.Scanner;

public class atv_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome, reset, vermelho, verde;
        reset = "\u001B[0m";
        vermelho = "\u001B[31m";
        verde = "\u001B[32m";

        System.out.println("Para realizar o login, digite o seu user: ");
        nome = sc.next();

        do {

            if (nome != "ADMIN") {

                System.out.println(vermelho + "User incorreto." + reset + " Digite novamente:");
                nome = sc.next();
            }

        } while (!nome.equals("ADMIN"));

        sc.close();
        System.out.println(verde + "User conectado.  Seja bem vindo!");

    }
}
