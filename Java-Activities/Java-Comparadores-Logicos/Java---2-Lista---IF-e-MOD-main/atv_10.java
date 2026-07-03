package Atividades.flowgorithm_2_Lista_Se_e_MOD;

import java.util.Scanner;

public class atv_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String user;
        int pass;

        System.out.println("PARA CONTINUAR REALIZE O LOGIN");
        System.out.println("Digite seu USER:");
        user = sc.next();

        System.out.println("Digite sua SENHA: ");
        pass = sc.nextInt();

        if (pass != 1234) {

            System.out.println("Senha INCORRETA");

        } else {

            System.out.println("Usuário LOGADO.");
        }
        sc.close();
    }
}

