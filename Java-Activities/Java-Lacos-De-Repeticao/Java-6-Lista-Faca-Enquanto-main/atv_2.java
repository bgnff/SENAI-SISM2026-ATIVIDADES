package Atividades.Java_6_ListaFaça_Enquanto;

import java.util.Scanner;

public class atv_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, cont;
        cont = 0;


        System.out.println("Digite números até cansar e o sistema mostrará os maiores que 10:\n(Digite 0 para encerrar)");

        do {

            n = sc.nextInt();
            cont = (n > 10) ? cont + 1 : cont;


        } while (n != 0);
        sc.close();

        System.out.println("Progreama encerrado.");
        System.out.println("Existem " + cont + " números maiores que 10.");
    }
}
