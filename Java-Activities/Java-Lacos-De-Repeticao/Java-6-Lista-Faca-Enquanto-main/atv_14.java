package Atividades.Java_6_ListaFaça_Enquanto;

import java.util.Scanner;

public class atv_14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Digitalize suas notas.");
        System.out.println("(Somente notas acima de 0 e abaixo de 10 serão contabilizadas.)");


        do {
            n = sc.nextInt();

            if (n > 0 & n < 10) {
                System.out.println("Nota válida. Nota: " + n);
            }
        } while (n > 0 & n < 10);

        System.out.println("Nota inválida. Digite uma nota entre 0 e 10. Nota: " + n);
        sc.close();
    }
}
