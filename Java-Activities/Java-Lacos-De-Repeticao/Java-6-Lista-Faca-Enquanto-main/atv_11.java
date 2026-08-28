package Atividades.Java_6_ListaFaça_Enquanto;

import java.util.Scanner;

public class atv_11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double n;
        int cont;
        cont = 0;

        System.out.println("Digite um valor. O sistema aumentará 5% até que chegue em 1000:");
        n = sc.nextDouble();

        do {

            n = n + n*1.05;
            cont++;


        } while (n <= 1000);
        System.out.println("Número de repetições necessárias: "+cont);
    }
}
