package Atividades.Java_7_Lista_Faça_Enquanto;

import java.util.Scanner;

public class atv_5 {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Iniciando verificação para pintura de umidade do ambiente...");
        Thread.sleep(1500);
        System.out.println("Digite a umidade do ambiente:");
        n = sc.nextInt();

        do {

            if (n < 40 || n > 60) {

                System.out.println("Ambiente inadequado. Digite novamente:");
                n = sc.nextInt();
            }

        } while (n < 40 || n > 60);

        sc.close();
        System.out.println("Ambiente adequado!");

    }
}
