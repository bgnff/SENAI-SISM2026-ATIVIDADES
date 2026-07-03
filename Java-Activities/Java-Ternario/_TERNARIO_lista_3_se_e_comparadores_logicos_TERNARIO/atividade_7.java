package Atividades.lista_3_se_e_comparadores_logicos;

import java.util.Scanner;

public class atividade_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, n2;
        n2 = 0;

        System.out.println("Digite três números, o sistema vai derminar qual o maior entre eles.");

        for (int cont = 0; cont < 3; cont++) {
            System.out.println("Digite o número:");
            n = sc.nextInt();

            n2 = (n > n2) ? n : n2 ;


           /* if (n > n2) {
                n2 = n;
            }*/
        }
        System.out.println("O maior número é " + n2);
        sc.close();
    }
}
