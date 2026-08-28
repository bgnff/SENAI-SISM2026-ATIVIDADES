package Atividades.Java_Atividades_Array_9;

import java.util.Arrays;
import java.util.Scanner;

public class atv_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;

        System.out.println("Digite 5 números. O sistema mostrará o menor e o maior entre eles.");

        for (int i = 0; i < 5; i++) {

            array[i] = sc.nextInt();
            if (array[i] > maior) maior = array[i];
            if (array[i] < menor ) menor = array[i];

        }
        sc.close();
        System.out.println("O maior número é: "+maior);
        System.out.println("O menor número é: "+menor);


    }
}
