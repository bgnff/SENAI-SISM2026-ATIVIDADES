package Atividades.Java_6_ListaFaça_Enquanto;

import java.util.Scanner;

public class atv_17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, cont;
        cont = 0;


        System.out.println("Digite números aleatórios. (0 para  finalizar) ");
        System.out.println("(O programa irá somar somente os números pares):");

        do {
            n = sc.nextInt();

            cont= (n % 2 == 0 & n != 0) ? cont = cont + n : cont;

        } while (n != 0);
        sc.close();
        System.out.println("Soma total de números pares: "+ cont);

    }
}
