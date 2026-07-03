package Atividades.Java_6_ListaFaça_Enquanto;

import java.util.Scanner;

public class atv_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, cont;
        cont = 0;


        System.out.println("Digite números até cansar e o sistema mostrará os multiplos de 3:\n(Digite 0 para encerrar)");

        do {

            n = sc.nextInt();
            cont = (n % 3 == 0 & n != 0) ? cont + n : cont;


        } while (n != 0);
        sc.close();
        System.out.println("A soma dos multiplos de 3 foi de: " + cont);
    }
}
