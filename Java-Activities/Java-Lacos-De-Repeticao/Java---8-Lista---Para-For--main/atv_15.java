package Atividades.Java_8_Lista_For;

import java.util.Scanner;

public class atv_15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        int cont = 0;
        System.out.println("Digite 8 números que o sistema irá informar quantos são maiores que 50:");

        for (int i = 0; i < 10; i++) {
            n = sc.nextInt();

            if (n > 50) {
                cont++;
            }
        }
        sc.close();
        System.out.println("Existem " + cont + " números maiores que 50.");
    }
}
