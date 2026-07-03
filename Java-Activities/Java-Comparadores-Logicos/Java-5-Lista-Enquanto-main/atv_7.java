package Atividades.Java_5_Lista_Enquanto;

import java.util.Scanner;

public class atv_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cont, n2, n, n3;

        cont = 1;
        n2 = 1;

        System.out.println("Digite um número limite e o sistema mostrará a soma de todos os números até ele:");
        n3 = sc.nextInt();

        while (cont < n3) {

            cont = cont + 1;
            n = cont + n2;
            System.out.println(n2 + "+" + cont + "=" + n);
            n2 = n;

            sc.close();
        }
    }
}
