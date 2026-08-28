package exercicio11;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        int soma = 0;
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int b : a) {
            soma += b;
            System.out.println(soma);
        }
    }
}
