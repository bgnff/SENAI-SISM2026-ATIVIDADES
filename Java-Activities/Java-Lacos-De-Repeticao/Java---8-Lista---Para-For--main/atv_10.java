package Atividades.Java_8_Lista_For;

import java.util.Scanner;

public class atv_10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double n;
        double soma = 0;

        System.out.println("Digite 5 números e o sistema dará a média no final:");

        for (int i = 0; i < 5; i++) {

            n = sc.nextDouble();
            soma = 0;
            soma = soma + n;
        }
        sc.close();
        System.out.println("A média dos números foi de: " + soma / 5);
    }
}
