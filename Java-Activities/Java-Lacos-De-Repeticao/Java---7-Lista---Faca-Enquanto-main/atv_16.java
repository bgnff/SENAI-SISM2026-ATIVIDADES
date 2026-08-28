package Atividades.Java_7_Lista_Faça_Enquanto;

import java.util.Scanner;

public class atv_16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int materiaPrim = 100;

        System.out.println("Sistema de estoque de insumo.");

        do {

            System.out.println(materiaPrim + " unidades de matéria-prima no estoque.");
            System.out.print("Digite qual foi a quantidade usada: ");
            int n = sc.nextInt();

            materiaPrim = materiaPrim - n;

        } while (materiaPrim > 10);

        sc.close();
        System.out.println(materiaPrim + " unidades de matéria-prima no estoque.");
        System.out.println("Estoque de baixo, recomendado o restoque de matéria-prima.");
    }
}
