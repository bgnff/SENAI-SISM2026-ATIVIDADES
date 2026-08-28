package Atividades.Java_10_Array;

import java.io.IOException;
import java.util.Scanner;

public class array_9 {
    public static void main(String[] args) throws InterruptedException {

        char vetor[] = new char[15];
        Scanner sc = new Scanner(System.in);
        String vogais = "AEIOUaeiou";
        int cont = 0;

        System.out.println("Digite 15 letras. O sistema irá verificar quantas vogais existem. ");
        Thread.sleep(1000);

        for (int i = 0; i < vetor.length; i++) {

            System.out.print("Digite a " + (1 + i) + "ª letra: ");
            vetor[i] = sc.next().charAt(0);
            if (vogais.indexOf(vetor[i]) != -1) cont++;
        }
        sc.close();
        System.out.println("Existem " + cont + " vogais.");
    }
}
