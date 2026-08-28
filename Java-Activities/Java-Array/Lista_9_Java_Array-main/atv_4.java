package Atividades.Java_Atividades_Array_9;

import java.util.Scanner;

public class atv_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] lista = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n;
        boolean achado = false;

        System.out.println("Digite um número presente na lista: ");
        n = sc.nextInt();

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
