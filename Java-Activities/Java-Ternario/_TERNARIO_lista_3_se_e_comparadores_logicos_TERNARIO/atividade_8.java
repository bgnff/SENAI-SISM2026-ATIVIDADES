package Atividades.lista_3_se_e_comparadores_logicos;

import java.util.Scanner;

public class atividade_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Digite um número e o sistema irá verificar se ele é negativo ou positivo: ");
        n = sc.nextInt();

        String n2 = (n < 0) ? "O número " + n + " é negativo." :
                    (n > 0) ? "O número " + n + " é positivo." : "O número é zero.";

        System.out.println(n2);

        /*if (n < 0) {

            System.out.println("O número " + n + " é negativo.");

        } else if (n > 0) {

            System.out.println("O número " + n + " é positivo.");

        } else {
            System.out.println("O número é zero.");

        }*/
        sc.close();
    }
}
