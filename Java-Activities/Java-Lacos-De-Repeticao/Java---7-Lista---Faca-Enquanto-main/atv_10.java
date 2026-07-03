package Atividades.Java_7_Lista_Faça_Enquanto;

import java.util.Scanner;

public class atv_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        double n,cont,soma;
        cont = 0;
        soma = 0;

        System.out.println("Digite a quantidade de peças produzidas em 5 turnos: ");


        do {
            n = sc.nextInt();
            soma = soma + n;
            cont++;


        }while(cont<5);
        System.out.printf("A soma total de peças produzidas é de: %.2f",soma/5);

    }
}
