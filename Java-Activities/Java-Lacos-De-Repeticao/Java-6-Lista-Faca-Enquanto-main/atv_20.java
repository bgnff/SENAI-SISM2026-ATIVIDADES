package Atividades.Java_6_ListaFaça_Enquanto;

import java.util.Locale;
import java.util.Scanner;

public class atv_20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale brlocale = new Locale("pt" , "BR");

        double valor, soma, desc, result;
        soma = 0;
        desc = 0;
        result = 0;

        System.out.println("Digite os valores dos produtos comprados (0 para finalizar):");

        do {
            valor = sc.nextDouble();
            soma = soma + valor;

        } while (valor != 0);

        if (soma > 500) {

            desc = soma * 0.10;
            result = soma - desc;

            System.out.printf("Valor total: R$%.2f%n ", soma);
            System.out.printf("Valor de desconto: R$%.2f%n ", desc);
            System.out.printf("Valor final: R$%.2f%n ", result);
        } else {

            System.out.printf("Valor total: %.2f%nR$ ", soma);


        }
    }
}
