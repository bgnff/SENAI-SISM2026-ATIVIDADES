package Atividades.flowgorithm_2_Lista_Se_e_MOD;

import java.util.Scanner;

public class atv_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Digite um número, o sistema vai declarar se ele é multiplo de 5:");
        n = sc.nextInt();

        if (n % 5 == 0) {
            System.out.println(n + " é multiplo de 5");
        } else {
            System.out.println(n + " não é multiplo de 5");
        }
        sc.close();
    }
}
