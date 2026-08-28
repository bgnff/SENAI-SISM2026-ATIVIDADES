package Atividades.Java_10_Array;

import java.util.Scanner;

public class array_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] lista = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean achado = false;

        System.out.println("Digite um número presente na lista: ");
        int n = sc.nextInt();

        for (int i = 0; i < lista.length; i++) {

            if (lista[i] == n) {
                achado = true;
                System.out.println("Parabéns! O número " + n + " existe na lista na posição " + i);
            }

        }
        if (!achado) {
            System.out.println("O número digitado não foi encontrado na lista.");
        }
        sc.close();

    }
}
