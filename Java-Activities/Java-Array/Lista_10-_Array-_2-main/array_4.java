package Atividades.Java_10_Array;

import java.util.Scanner;

public class array_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[10];
        System.out.println("Digite 10 nomes. O sistema exibirá a lista dos nomes da ordem contrária:");

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o " + (1 + i) + "ª nome: ");
            nomes[i] = sc.nextLine();
        }

        System.out.println("Os nomes digitados na ordem contrária: ");
        for (int i = nomes.length - 1; i >= 0; i--) {
            System.out.print(nomes[i] + " , ");
        } sc.close();

    }
}
