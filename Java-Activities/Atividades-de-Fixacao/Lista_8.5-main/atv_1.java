package Atividades.Desafio_8_5;

import java.util.Scanner;

public class atv_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, passos;
        passos = 0;

        System.out.print("Digite um número inteiro positivo: ");
        n = sc.nextInt();

        while (n <= 0) {
            System.out.println("Por favor, digite um número positivo.");
            n = sc.nextInt();
        }

        while (n != 1) {
            if (n % 2 == 0) n = n / 2; // par: divide por 2
            else n = n * 3 + 1; // ímpar: multiplica por 3 e soma 1
            passos++;
        }
        sc.close();
        System.out.println("Passos necessários: " + passos);
    }
}