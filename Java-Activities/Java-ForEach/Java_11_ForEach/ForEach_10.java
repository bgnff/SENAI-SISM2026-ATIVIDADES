package Atividades.Java_11_lista_ForEach;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ForEach_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random(10);
        int[] a = new int[10];
        int b, c = 0;
        System.out.println("Digite um de 0 a 10 numero ");
        b = sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(10);

        }
        for (int obj : a) {
            if (b == obj) {
                c++;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println("Ha " + c + " numeros iguais no vetor.");
        sc.close();
    }
}
