package Atividades.Java_7_Lista_Faça_Enquanto;

import java.util.Scanner;

public class atv_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int senha, cont;
        String vermelho, reset, verde;
        cont = 3;
        vermelho = "\u001B[31m";
        reset = "\u001B[0m";
        verde = "\u001B[32m";

        System.out.println("Para realizar o login digite sua senha:");
        senha = sc.nextInt();

        do {


            if (senha != 1234) {
                System.out.println(vermelho + "Senha incorreta." + reset + "Tente novamente");
                System.out.println("Você tem mais " + vermelho + cont + " tentativas.");
                cont = cont - 1;
                senha = sc.nextInt();

                if (cont < 1) {
                    break;
                }
            }

        } while (senha != 1234);
        sc.close();

        String txt = (cont < 1 & senha != 1234) ? vermelho + "Acesso bloqueado por excesso de tentativas." : verde + "Usuário logado. Seja bem vindo!";

        System.out.println(txt);

    }

}
