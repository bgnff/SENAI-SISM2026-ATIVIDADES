package Atividades.lista_3_se_e_comparadores_logicos;

import java.util.Scanner;

public class atividade_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;
        String idade2;


        System.out.println("Digite sua idade, o programa vai declarar se você pode votar:");
        idade = sc.nextInt();
        idade2 = (idade >= 16) ? "Você pode votar." : "Você não pode votar.";
        System.out.println(idade2);

        /*if (idade >= 16) {
            System.out.println("Você pode votar.");
        } else {
            System.out.println("Você não pode votar.");
        } */

        sc.close();
    }
}
