package Atividades.Java_8_Lista_For;

import java.util.Scanner;

public class atv_11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, maior;
        maior = Integer.MIN_VALUE;

        System.out.println("Digite 5 números e o sistema mortrará qual o maior entre eles:");

        for (int i = 0; i < 5; i++) {

            n = sc.nextInt();

            if (n > maior) maior = n;

        }
        sc.close();
        System.out.println("O maior número é:" + maior);
    }
}
