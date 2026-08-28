package Atividades.Java_7_Lista_Faça_Enquanto;

import java.util.Scanner;

public class atv_20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalPecas = 0;
        int pecasBoas = 0;
        int refugos = 0;
        int metaTurno = 5;
        int status;

        System.out.println("--- Início do Turno (Meta: 50 peças) ---");
        System.out.println("Comandos: 0 - OK | 1 - DEFEITO");

        do {

            totalPecas++;
            System.out.print("Peça nº " + totalPecas + " - Digite o status: ");
            status = sc.nextInt();
            if (status == 0) {
                pecasBoas++;
            } else if (status == 1) {
                refugos++;
            } else {
                System.out.println("Código inválido! Use apenas 0 ou 1.");
            }
        } while (totalPecas < metaTurno);
        double porcentagemPerda = ((double) refugos / metaTurno) * 100;
        System.out.println("\n================================");
        System.out.println("      RELATÓRIO DO TURNO");
        System.out.println("================================");
        System.out.println("Total Produzido : " + totalPecas);
        System.out.println("Peças Boas      : " + pecasBoas);
        System.out.println("Refugos (Perda) : " + refugos);
        System.out.printf("Taxa de Rejeição : %.2f%%\n", porcentagemPerda);
        System.out.println("================================");
        sc.close();
    }
}
