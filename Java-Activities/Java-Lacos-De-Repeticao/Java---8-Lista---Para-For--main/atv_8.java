package Atividades.Java_8_Lista_For;

import java.util.Scanner;

public class atv_8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, soma;
        soma = 0;

        System.out.println("Digite um número e descubra a tabuada do mesmo:");
        n = sc.nextInt();

        for (int i = 0; i <=10; i++) {

            soma = n*i;

            System.out.println(n + "x" + i + "=" + soma);
        }
    }
}
