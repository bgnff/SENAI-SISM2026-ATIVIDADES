package Atividades.Desafio_8_5;

import java.util.Scanner;

public class atv_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double popA = 50000;
        double popB = 150000;
        double TAXA_B = 1.5;
        int anos = 0;

        System.out.print("Digite a taxa de crescimento anual de A (%): ");
        double taxaA = scanner.nextDouble();

        System.out.printf("%nAno 0    Cidade A: %,.0f hab.  |  Cidade B: %,.0f hab.%n",
                popA, popB);
        System.out.println("\n");

        while (popA < popB) {

            // Aplica crescimento anual
            popA = popA * (1 + taxaA / 100.0);
            popB = popB * (1 + TAXA_B / 100.0);
            anos++;

            double diferenca = popB - popA;

            System.out.printf("Ano %d    A: %,.0f hab.  |  B: %,.0f hab.  |  Diff: %,.0f%n",
                    anos, popA, popB, diferenca);

            // Alerta: cidades se aproximando
            if (diferenca < 10_000 || anos % 5 == 0) {
                System.out.println("   Atenção: Cidades se aproximando em tamanho!");
            }
        }

        System.out.println("\n");
        System.out.printf("Cidade A ultrapassou a Cidade B no ano %d!%n", anos);
        System.out.printf("População final    A: %,.0f hab.  |  B: %,.0f hab.%n", popA, popB);

        scanner.close();
    }
}
