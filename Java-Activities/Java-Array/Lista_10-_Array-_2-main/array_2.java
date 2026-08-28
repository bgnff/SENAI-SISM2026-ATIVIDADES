package Atividades.Java_10_Array;

import java.util.Scanner;

public class array_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] arr = new double[15];
        int posmenor = 0, posmaior = 0;

        System.out.println("Digite 15 números. O sistema irá verificar qual o  menor  e o maior entre eles.");

        for (int i = 0; i < 15; i++) {

            System.out.print("Digite o " + (1 + i) + "º número: ");
            arr[i] = sc.nextDouble();
        }
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > arr[posmaior]) posmaior = i;
            if (arr[i] < arr[posmenor]) posmenor = i;
        }
        sc.close();
        System.out.println("O maior digitado foi: " + arr[posmaior] + " e a sua posição foi a " + posmaior);
        System.out.println("O menor digitado foi: " + arr[posmenor] + " e a sua posição foi a " + posmenor);
    }
}
