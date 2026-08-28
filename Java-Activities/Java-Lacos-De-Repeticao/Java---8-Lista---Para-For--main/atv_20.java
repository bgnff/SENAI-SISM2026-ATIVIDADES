package Atividades.Java_8_Lista_For;

import java.util.Scanner;

public class atv_20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, a, r;
        String reset = "\u001B[0m";
        String verde = "\u001B[32m";
        String vermelho = "\u001B[31m";

        r = 0;
        a = 0;

        System.out.println("Digite 10 notas de alunos:\nMaior que 7 =" + verde + " APROVADO");
        System.out.println(reset + "Menor que 7 =" + vermelho + " REPROVADO");

        for (int i = 1; i <= 10; i++) {
            n = sc.nextInt();

            if (n > 7) a++;
            else r++;

        }
        sc.close();
        System.out.println(reset + "Existem " + a + verde + " aprovados." + reset);
        System.out.println("Existem " + r + vermelho + " reprovados.");

    }
}
