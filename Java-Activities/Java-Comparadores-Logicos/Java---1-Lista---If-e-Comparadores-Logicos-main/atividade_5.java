package Atividades.lista_3_se_e_comparadores_logicos;

import java.util.Scanner;

public class atividade_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;

        System.out.println("Digite sua idade, o programa vai declarar se você pode votar:");
        idade = sc.nextInt();

        if (idade >= 16) {
            System.out.println("Você pode votar.");
        } else {
            System.out.println("Você não pode votar.");
        }
        sc.close();
    }
}
