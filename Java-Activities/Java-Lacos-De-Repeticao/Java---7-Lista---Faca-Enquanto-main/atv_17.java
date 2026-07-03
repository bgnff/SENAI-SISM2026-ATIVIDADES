package Atividades.Java_7_Lista_Faça_Enquanto;

import java.util.Scanner;

public class atv_17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int dia;

        do {

            System.out.print("Digite o dia da última manutenção (1-31): ");
            dia = sc.nextInt();

            if (dia < 1 || dia > 31) {

                System.out.println("Erro: O dia deve estar entre 1 e 31. Tente novamente.");
            }
        } while (dia < 1 || dia > 31);

        sc.close();
        System.out.println("Sucesso! Dia " + dia + " registrado no sistema.");

    }
}