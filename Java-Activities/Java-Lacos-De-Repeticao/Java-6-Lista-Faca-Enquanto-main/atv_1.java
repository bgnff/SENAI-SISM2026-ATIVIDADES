package Atividades.Java_6_ListaFaça_Enquanto;

import java.util.Scanner;

public class atv_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, n2, soma;
        soma = 0;

        System.out.println("INICIANDO CONTAGEM COM LIMITE....\nO sistema irá somar números até o número limite.");

        System.out.println("Digite um número limite:");
        n = sc.nextInt();
        System.out.println("Digite os números para somar: ");

        do {

            n2 = sc.nextInt();
            soma = soma + n2;

        } while (soma < n);
        sc.close();
        System.out.println("Valor final: " + soma);

    }
}
