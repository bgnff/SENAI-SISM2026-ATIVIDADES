package Atividades.Java_8_Lista_For;

import java.util.Scanner;

public class atv_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número. O sistema realizará uma contagem decrescente até ele:");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++){

            System.out.println(i);
        }
        sc.close();
    }
}
