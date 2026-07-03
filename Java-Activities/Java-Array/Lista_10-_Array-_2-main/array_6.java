package Atividades.Java_10_Array;

import java.util.Arrays;
import java.util.Scanner;

public class array_6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];
        int[] b = new int[10];
        int n;

        System.out.println("Adicione 10 números a lista A. ");
        for (int i = 0; i < a.length; i++) {
            System.out.print("Digite o " + (1 + i) + "ª número: ");
            a[i] = sc.nextInt();
        }
        System.out.print("Agora digite um valor para multiplica-lo na lista A: ");
        n = sc.nextInt();

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i] * n;
        }
        sc.close();
        System.out.println("Os resultados da multiplicação do número " + n + " pela lista A foram: ");
        System.out.println(Arrays.toString(b));
    }
}
