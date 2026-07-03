package Atividades.Java_6_ListaFaça_Enquanto;

import java.util.Scanner;

public class atv_16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, cont;
        cont = 0;

        System.out.println("Digite quantos números quiser! (0 para finalizar)");
        System.out.println("(O sistema irá  mostrar qantos números estão entre 10 e 50):");

        do {

            n = sc.nextInt();
            cont = (n < 50 & n > 10 & n != 0) ? cont + 1 : cont;

        } while (n != 0);
        sc.close();
        System.out.println("Existem " + cont + " números entre 10 e 50.");
    }
}

