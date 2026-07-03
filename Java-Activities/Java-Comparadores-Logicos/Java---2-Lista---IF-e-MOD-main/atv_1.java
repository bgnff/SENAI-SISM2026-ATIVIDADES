package Atividades.flowgorithm_2_Lista_Se_e_MOD;

import java.util.Scanner;

public class atv_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Digite um número e o sistema dirá se é ímpar ou par: ");
        n = sc.nextInt();

        if (n % 2 == 0) {

            System.out.println("O número " + n + " é par!");

        } else {
            System.out.println("O número " + n + " é ímpar!");
        }
        sc.close();
    }
}
