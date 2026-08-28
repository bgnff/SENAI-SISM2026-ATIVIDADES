package Atividades.Java_6_ListaFaça_Enquanto;

import java.util.Scanner;

public class atv_9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, cont;
        cont = 0;


        System.out.println("Digite números até cansar. O sistema mostrará quantos estão 20 e 80:\n(Digite 0 para encerrar)");

        do {

            n = sc.nextInt();
            cont = (n < 80 & n > 20 & n != 0) ? cont + 1 : cont;


        } while (n != 0);
        sc.close();
        System.out.println("Existem " + cont + " números entre 20 e 80.");
    }
}
