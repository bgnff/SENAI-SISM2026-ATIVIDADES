package Atividades.Java_7_Lista_Faça_Enquanto;

import java.util.Scanner;

public class atv_2 {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        double pressao, bar;
        int un = 0;
        bar = 0;

        System.out.println("INICIANDO CALCULADOR DE PRESSÃO...");
        Thread.sleep(1000);

        System.out.println("Digite a unidade de conversão desejada: ");
        System.out.println("1 - PSI\n2 - Pascal\n3 - kPa");
        un = sc.nextInt();

        do {
            switch (un) {

                case 1:
                    System.out.println("Unidade selecionada: PSI");
                    Thread.sleep(1000);
                    System.out.println("Digite a pressão da caldeira:");
                    pressao = sc.nextDouble();
                    bar = pressao * 0.0689476;
                    if (bar < 10) {
                        System.out.println("A pressão ainda não chegou no valor ideal.. Tente novamente!");
                        Thread.sleep(1000);
                    }
                    break;

                case 2:
                    System.out.println("Unidade selecionada: Pascal");
                    Thread.sleep(1000);
                    System.out.println("Digite a pressão da caldeira:");
                    pressao = sc.nextDouble();
                    bar = pressao / 100000;
                    if (bar < 10) {
                        System.out.println("A pressão ainda não chegou no valor ideal.. Tente novamente!");
                        Thread.sleep(1000);
                    }
                    break;

                case 3:
                    System.out.println("Unidaade selecionada: kPa");
                    Thread.sleep(1000);
                    System.out.println("Digite a pressão da caldeira:");
                    pressao = sc.nextDouble();
                    bar = pressao / 100;
                    if (bar < 10) {
                        System.out.println("A pressão ainda não chegou no valor ideal.. Tente novamente!");
                        Thread.sleep(1000);
                    }
                    break;

                default:
                    System.out.println("Opção inválida!");
                    System.out.println("Digite uma opção válida: ");
                    un = sc.nextInt();
            }

        } while (bar < 10);
        sc.close();
        System.out.println("Pressão Ideal!");

    }
}