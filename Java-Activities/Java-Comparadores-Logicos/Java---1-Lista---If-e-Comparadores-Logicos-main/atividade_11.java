package Atividades.lista_3_se_e_comparadores_logicos;

import java.util.Scanner;

public class atividade_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Digite um número, o sistema vai declarar se ele é divisivel por 5:");
        n = sc.nextInt();

        if (n % 5 == 0) {
            System.out.println("O núemro " + n + " è divisivel por 5.");
        } else {
            System.out.println("O núemro " + n + " não è divisivel por 5.");
        }

        sc.close();
    }
}
