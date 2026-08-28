package Atividades.Java_8_Lista_For;

import java.util.Scanner;

public class atv_14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        int soma = 0;
        System.out.println("Digite 6 números. O sistema irá somar somente os positivos:");

        for (int i = 0; i < 6; i++) {
            n = sc.nextInt();

            if (n > 0) {

                soma += n;

            }
        }
        sc.close();
        System.out.println("Total de soma dos números positivos: " + soma);

    }
}
