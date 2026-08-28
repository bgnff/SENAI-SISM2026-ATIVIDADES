package Atividades.lista_3_se_e_comparadores_logicos;

import java.util.Scanner;

public class atividade_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp;

        System.out.println("Escreva a temperatura atual (em ºC):");
        temp = sc.nextInt();

        if (temp < 15) {
            System.out.println("Está frio brrrrrr. \uD83E\uDD76\uD83E\uDDCA❄\uFE0F");
        } else if (temp <= 25) {
            System.out.println("Agradave hmmmmm. \uD83D\uDC4D\uD83D\uDC4D\uD83D\uDE0B\uD83D\uDE0B");
        } else {
            System.out.println("Quente aaaaaaaaaaaaa. \uD83D\uDD25\uD83D\uDD25☠\uFE0F☠\uFE0F☠\uFE0F☠\uFE0F");
        }
        sc.close();
    }
}
