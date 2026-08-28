package Atividades.Java_10_Array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class array_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] array = new int[20];
        int[] par = new int[20];
        Random rand = new Random();
        int cont = 0;

        for (int i = 0; i < array.length; i++) {

            array[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {
                par[cont] = array[i];
                cont++;
            }
        }
        System.out.println("Os números pares são:");

        for (int i = 0; i < cont; i++) {
            System.out.print(par[i] + " ");

        }
    }
}
