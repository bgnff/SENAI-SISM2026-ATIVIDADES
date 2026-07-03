package Atividades.Java_10_Array;

import java.io.IOException;
import java.util.Scanner;

public class array_7 {

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        char[] notas = {'A', 'B', 'C', 'D', 'E', 'A', 'B', 'C', 'D', 'E'};
        char[] resposta = new char[notas.length];
        int cont = 0;

        System.out.println("Iniciando verificador de gabarito...");
        Thread.sleep(1500);

        System.out.println("Existem 10 questões. Digite as respostas correspondentes a cada uma delas.");
        Thread.sleep(1500);

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite a resposta da questão " + (1 + i) + ":");
            resposta[i] = sc.next().charAt(0);

            while (resposta[i] != 'A' && resposta[i] != 'B' && resposta[i] != 'C' && resposta[i] != 'D' && resposta[i] != 'E') {

                System.out.println("Resposta incorreta!");
                Thread.sleep(1500);
                System.out.println("Responda a letra correspondente (ex: A,B,C..):");
                resposta[i] = sc.next().toUpperCase().charAt(0);
            }

            if (resposta[i] == notas[cont]) {
                cont++;
            }
        }
        sc.close();
        System.out.println("Parabéns! Você teve: " + cont + " acertos.");


    }
}
