package Atividades.Java_Atividades_Array_9;

import java.util.Arrays;
import java.util.Scanner;

public class atv_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] n = new int[5];

        System.out.println("Digite 5 números para formar uma lista: ");

        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }
        System.out.println("Os números digitados na ordem inversa foram:" );

        for (int i = n.length - 1; i >=0; i--) {
            System.out.println(n[i]);
        }
        sc.close();
    }
}
