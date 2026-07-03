package Atividades.lista_3_se_e_comparadores_logicos;

import java.util.Scanner;

public class atividade_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, n2;

        System.out.println("Digite 2 números que o sistema dirá se são iguais: ");
        n = sc.nextInt();
        n2 = sc.nextInt();

        if (n != n2) {
            System.out.println("Os números " + n + " e " + n2 + " são diferentes. ");
        } else {
            System.out.println("Os números " + n + " e " + n2 + " são iguais. ");
        }

        sc.close();
    }
}
