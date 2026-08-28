package Atividades.Java_10_Array;

import java.util.Arrays;
import java.util.Scanner;

public class array_8 {

    public static void main(String[] args) throws  InterruptedException{

        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[12];
        int memory;

        System.out.println("Iniciando troca de elementos...");
        Thread.sleep(1000);

        for (int i = 0; i < vetor.length; i++) {

            System.out.print("Digite o " + (1 + i) + "ª número:");
            vetor[i] = sc.nextInt();

        }
        for (int i = 0; i < 6; i++) {

           memory = vetor[i];
           vetor[i] = vetor[i+6];
           vetor[i+6] = memory;

        }
        sc.close();
        System.out.println("Vetor resultante: "+Arrays.toString(vetor));
    }
}
