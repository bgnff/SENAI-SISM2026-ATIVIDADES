package Atividades.lista_3_se_e_comparadores_logicos;

import java.util.Scanner;

public class atividade_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int temp;

        System.out.println("Escreva a temperatura atual (em ºC):");
        temp = sc.nextInt();

        if (temp > 40) {
            System.out.println("Temperatura extremamente alta!");
        } else {
            System.out.println("Temperatura dentro dos limites normais. ");
        }
        sc.close();
    }
}
