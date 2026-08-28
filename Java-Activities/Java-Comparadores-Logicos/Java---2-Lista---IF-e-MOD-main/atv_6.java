package Atividades.flowgorithm_2_Lista_Se_e_MOD;

import java.util.Scanner;

public class atv_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n,n2;

        System.out.println("Digite dois números que o sistema irá exibir qual deles é  o maior: ");
        System.out.println("Digite o primeiro número: ");
        n = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        n2 = sc.nextInt();

        if (n == n2){

            System.out.println("Digite 2 números diferentes!!!");

        } else if (n<n2) {
            System.out.println("O número " + n2 + " é o maior \nO número " + n + " é o menor.");

        } else {
            System.out.println("O número "+n+" é o maior \nO número "+n2+" é o menor.");

        } sc.close();

    }
}
