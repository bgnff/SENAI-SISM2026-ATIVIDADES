package Atividades.Java_6_ListaFaça_Enquanto;

import java.util.Scanner;

public class atv_18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, cont, maior, menor;
        maior = 0;
        menor = 0;
        cont = 0;

        System.out.println("Digite 10 números. O sistema mostrará os maiores que 50 e menores que 20:");

        do {

            n = sc.nextInt();
            cont++;
            maior = (n > 50) ? maior = maior + 1 : maior;
            menor = (n < 20) ? menor = menor + 1 : menor;

        } while (cont < 10);
        sc.close();
        System.out.println("Existem "+maior+" números maiores que 50.");
        System.out.println("Existem "+menor+" números menores que 20.");

    }
}
