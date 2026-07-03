package Atividades.Java_7_Lista_Faça_Enquanto;

import java.util.Scanner;

public class atv_4 {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        double nivel, calculo, n;
        calculo = 0;

        System.out.println("Digite o nível do tanque:");
        nivel = sc.nextInt();

        while (nivel < 0 || nivel > 100) {

            System.out.println("Valor incorreto. Digite um valor entre 0 e 100%:");
            nivel = sc.nextInt();
        }

        System.out.println("Digite quanto quer encher:");

        do {

            n = sc.nextInt();


            calculo = calculo + n;
            System.out.println("Enchendo...");
            Thread.sleep(1000);
            System.out.println("Nível atual do tanque: " + calculo + "%");


        } while (calculo < 80);
        sc.close();
        System.out.println("O seu tanque alcançou o limite de 80%!");
    }
}
