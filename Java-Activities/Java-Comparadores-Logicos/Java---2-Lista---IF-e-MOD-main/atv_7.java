package Atividades.flowgorithm_2_Lista_Se_e_MOD;

import java.util.Scanner;

public class atv_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("O sistema irá dizer se um número é ZERO, NEGATIVO ou POSITIVO.");
        System.out.println("Digite o número:");
        n = sc.nextInt();

        if (n < 0) {

            System.out.println("Esse número é NEGATIVO!");

        } else if (n == 0) {

            System.out.println("Esse número é ZERO!");
        } else {

            System.out.println("Esse número é POSITIVO!");

        }
        sc.close();
    }
}
