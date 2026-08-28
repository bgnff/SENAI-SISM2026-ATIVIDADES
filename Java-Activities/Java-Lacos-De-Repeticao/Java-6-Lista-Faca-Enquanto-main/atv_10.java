package Atividades.Java_6_ListaFaça_Enquanto;

import java.util.Scanner;

public class atv_10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, cont,soma,s2;
        cont = 0;
        s2 = 0;
        soma = 0;

        System.out.println("Digite números até cansar. O sistema mostrará quantos estão 20 e 80:\n(Digite 0 para encerrar)");

        do {

            n = sc.nextInt();
            soma = (n % 2 == 0 & n != 0) ? soma + cont : cont + s2;


        } while (n != 0);
        sc.close();
        System.out.println("Soma total números pares: " + soma);
        System.out.println("Soma total de números ímpares: "+s2);
    }
}
