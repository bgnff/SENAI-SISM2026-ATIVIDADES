package Atividades.Java_6_ListaFaça_Enquanto;

import java.util.Scanner;

public class atv_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;


        System.out.println("Digite números aleatoriamente. O sistema mostrará o dobro deles:");
        System.out.println("(Digite 0 para finalizar)");

        do {

            n = sc.nextInt();
            n=n*2;
            System.out.println("O dobro do número digitado é: "+n);


        } while (n != 0);
        sc.close();
        System.out.println("Programa finalizado.");

    }
}
