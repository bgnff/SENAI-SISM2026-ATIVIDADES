package Atividades.Java_8_Lista_For;

import java.util.Scanner;

public class atv_12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, menor;
        menor = Integer.MAX_VALUE;

        System.out.println("Digite 5 números e o sistema mortrará qual o menor entre eles:");

        for (int i = 0; i < 5; i++) {

            n = sc.nextInt();

            if (n < menor) menor = n;

        }
        sc.close();
        System.out.println("O menor número é:" + menor);
    }
}