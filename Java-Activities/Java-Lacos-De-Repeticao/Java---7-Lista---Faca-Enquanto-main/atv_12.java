package Atividades.Java_7_Lista_Faça_Enquanto;

import java.util.Scanner;

public class atv_12 {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        int n, defeitos, pcs;
        defeitos = 0;
        pcs = 0;

        System.out.println("INICIANDO VERIFICAÇÃO DE PEÇAS PRODUZIDAS....");
        Thread.sleep(1500);
        System.out.println("Para verificar a se a peça está com DEFEITO ou OK faça:");
        System.out.println("0 - OK\n1- DEFEITO");

        do {
            n = sc.nextInt();

            if (n == 1) {

                defeitos = defeitos + 1;
            }

            if (n == 0) {

                pcs = pcs + 1;
            }
            System.out.println("Existem " + pcs + " peças OK.");
            System.out.println("Existem " + defeitos + " peças com defeito.");


        } while (defeitos < 5);
        sc.close();
        System.out.println("As peças defeituosas ultrapassaram o limite.");
    }
}
