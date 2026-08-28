package Atividades.Java_7_Lista_Faça_Enquanto;

import java.util.Scanner;

public class atv_8 {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Dite um número para executar a ação...");
        Thread.sleep(1000);
        System.out.println("0 - OK\n1 - EMERGÊNCIA");
        n = sc.nextInt();

        while (n < 0 || n > 1) {

            System.out.println("Digite um número válido no painel.");
            Thread.sleep(1000);
            System.out.println("0 - OK\n1 - EMERGÊNCIA");
            n = sc.nextInt();
        }

        do {

            if (n == 0) {
                System.out.println("Operação normal.");

            }

            if (n == 1) {
                System.out.println("EMERGÊNCIA ACIONADA!");
            }

        } while (n != 0 & n != 1);
        sc.close();

    }
}
