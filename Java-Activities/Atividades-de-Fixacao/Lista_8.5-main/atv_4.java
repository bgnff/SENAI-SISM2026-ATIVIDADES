package Atividades.Desafio_8_5;

import java.util.Scanner;

public class atv_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double consumo, excedente;

        do {
            System.out.print("Digite o consumo mensal em m³ (0 para sair): ");
            consumo = sc.nextDouble();

            if (consumo == 0) {
                System.out.println("Encerrando o programa.");
                break;
            }

            if (consumo < 0) {
                System.out.println("Consumo inválido. Digite um valor positivo.");
                continue;
            }

            double valor;

            if (consumo <= 15) {
                valor = 35.00;

            } else if (consumo <= 30) {
                excedente = consumo - 15;
                valor = 35.00 + excedente * 4.50;

            } else {
                excedente = consumo - 15;
                valor = 35.00 + excedente * 7.00;

            }

            System.out.printf("Consumo: %.2f m³%n", consumo);
            System.out.printf("Valor da fatura: R$ %.2f%n", valor);
            System.out.println("\n");

        } while (true);

        sc.close();
    }
}
