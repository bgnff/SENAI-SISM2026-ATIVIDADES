package Atividades.Java_6_ListaFaça_Enquanto;

import java.util.Scanner;

public class atv_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, cont;
        cont = 0;


        System.out.println("Digite números até cansar e o sistema mostrará quantos são multiplos de 5:\n(Digite 0 para encerrar)");

        do {

            n = sc.nextInt();
            cont = (n % 5 == 0 & n != 0) ? cont + 1 : cont;


        } while (n != 0);
        sc.close();
        System.out.println("Existem " + cont+" números multiplos de 5.");
    }
}
