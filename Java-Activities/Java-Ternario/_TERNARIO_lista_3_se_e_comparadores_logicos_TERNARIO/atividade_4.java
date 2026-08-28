package Atividades.lista_3_se_e_comparadores_logicos;

import java.util.Scanner;

public class atividade_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;
        String txt;

        System.out.println("Digite a sua idade:");
        idade = sc.nextInt();
        txt = (idade < 18) ? "Você é menor de idade." : "Você é maior de idade.";
        System.out.println(txt);

        /*if (idade < 18) {
            System.out.println("Você é menor de idade.");
        } else {
            System.out.println("Você é maior de idade.");
        }*/
        sc.close();
    }
}
