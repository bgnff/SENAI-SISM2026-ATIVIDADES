package Atividades.Java_8_Lista_For;

import java.util.Scanner;

public class atv_17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder txt = new StringBuilder();

        int n;

        System.out.println("Digite um número e o sistema mostrará seus divisores: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                txt.append(i).append(", ");
            }

        }
        sc.close();
        System.out.println("Divisores: " + txt);
    }
}
