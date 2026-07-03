package Atividades.Java_5_Lista_Enquanto;

import java.util.Scanner;

public class atv_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int l, cont;

        cont = 0;

        System.out.println("Digite um número de limite que o sistema exibirá os multiplos de 5:");
        l = sc.nextInt();

        while (cont <= l) {

            System.out.println(cont);
            cont = cont + 5;
            sc.close();

        }


    }
}
