package Atividades.Java_8_Lista_For;

import java.util.Scanner;

public class atv_7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número (o sistema irá somar 1 até ele): ");
        int n = sc.nextInt();

        int soma = 0;

        for (int i = 1; i <= n; i++) {
            soma += i;
        }

        System.out.println("A soma de 1 até " + n + " é: " + soma);
        sc.close();
    }
}