package Atividades.Java_10_Array;

import java.util.Arrays;
import java.util.Scanner;

public class aray_10 {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        int[] V = new int[10];
        int[] S = new int[10];
        int memory = 0;

        System.out.println("Iniciando Vetor Acumulado... Digite 10 números!");
        Thread.sleep(1000);
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            V[i] = sc.nextInt();
            memory += V[i];
            S[i] = memory;
        }
        sc.close();
        System.out.println("Vetor Acumulado resultante: " + Arrays.toString(S));
    }
}
