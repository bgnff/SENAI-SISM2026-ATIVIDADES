package Atividades.Java_5_Lista_Enquanto;

import java.util.Scanner;

public class atv_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, cont, soma;

        soma = 0;
        cont = 0;

        System.out.println("Digite as 5 notas para calcular a média:");

        while (cont < 5) {

            n = sc.nextInt();
            cont = cont + 1;
            soma = soma + n;

            sc.close();

        } soma = soma / 5;

        System.out.println(soma);
    }
}
