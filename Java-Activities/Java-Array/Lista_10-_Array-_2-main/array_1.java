package Atividades.Java_10_Array;

import java.util.Scanner;

public class array_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int[] arr = new int[10];

        System.out.println("Digite 10 números para calcularmos a soma e a média deles.");

        for (int i = 0; i <arr.length; i++) {
            System.out.print("Digite o "+(1+i)+"º número: ");
            arr[i] = sc.nextInt();
            soma += arr[i];

        }
        sc.close();
        System.out.println("A soma total foi de: "+soma+"\nA média foi de: "+soma/10);

    }
}
