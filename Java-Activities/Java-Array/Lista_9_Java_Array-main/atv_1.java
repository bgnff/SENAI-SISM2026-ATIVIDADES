package Atividades.Java_Atividades_Array_9;

import java.util.Arrays;
import java.util.Scanner;

public class atv_1 {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        int[] n = new int[5];

        System.out.println("Digite 5 números: ");

        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Os números digitados foram: "+Arrays.toString(n));
    }
}
