package Atividades.Java_6_ListaFaça_Enquanto;

import java.util.Scanner;

public class atv_13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, cont, soma, soma2;
        cont = 0;
        soma = 0;

        System.out.println("Digite quantos números quiser!");
        System.out.println("O sistema mostrará quantos números foram digitados, a soma e a média deles (0 para finalizar):");

        do {
            n = sc.nextInt();

            if (n != 0) {
                cont++;
                soma = soma + n;
            }

        } while (n != 0);
        sc.close();

        soma2 = soma / cont;

        System.out.println("Foram digitados " + cont + " números.");
        System.out.println("Soma de todos os números digitados: " + soma);
        System.out.println("A média de todos os números digitados: " + soma2);


    }
}
