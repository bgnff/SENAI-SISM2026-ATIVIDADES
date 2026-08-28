package Atividades.Java_6_ListaFaça_Enquanto;

import java.util.Scanner;

public class atv_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double n, soma, cont;
        cont = 0;
        soma = 0;

        System.out.println("Digite números. O sistema irá calcular a média dos números positivos:");
        System.out.println("(Digite um número negativo para finalizar)");

        do {

            n = sc.nextDouble();
            soma = (n > 0) ? soma + n : soma;
            cont = (n > 0) ? cont + 1 : cont;

        } while (n > 0);
        sc.close();

        System.out.println("Programa finalizado.\nA média foi de: " + soma / cont);
    }
}
