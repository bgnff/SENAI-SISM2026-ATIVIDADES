package Atividades.Java_7_Lista_Faça_Enquanto;

import java.util.Scanner;

public class atv_13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cont = 0;

        System.out.println("Calculo de Eficiêncai.\nDigite o tempo total de cada máquina ligada e o tempo produzindo ");

        do {
            cont++;

            System.out.print("Digite o tempo total da máquina " + cont + ": ");
            int tempoT = sc.nextInt();

            System.out.print("Digite o tempo produzindo da máquina " + cont + ": ");
            int tempoP = sc.nextInt();

            double eficiencia = (double) tempoP / tempoT * 100;
            System.out.println("A eficiencia da máquina " + cont + " é de " + (int) eficiencia + "%.");

        } while (cont < 3);
        sc.close();
    }
}
