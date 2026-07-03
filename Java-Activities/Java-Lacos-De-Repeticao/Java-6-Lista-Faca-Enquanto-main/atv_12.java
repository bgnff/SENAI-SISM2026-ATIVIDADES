package Atividades.Java_6_ListaFaça_Enquanto;

import java.util.Scanner;

public class atv_12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, cont, soma;
        cont = 0;

        System.out.println("Digite um número maior que 1.");
        System.out.println("O sistema irá dividir o valor por 2 enquanto o resultado for maior que 1:");
        n = sc.nextInt();

        while (n <= 1) {

            System.out.println("Número inválido! Digite um número maior que 1:");

            n = sc.nextInt();

        }

        do {
            n = n / 2;

            cont++;


        } while (n > 1);
        sc.close();
        System.out.println("Foram realizadas " + cont + " divisões.");
    }
}
