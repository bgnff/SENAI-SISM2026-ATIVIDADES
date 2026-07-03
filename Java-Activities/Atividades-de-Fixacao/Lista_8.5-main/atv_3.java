package Atividades.Desafio_8_5;

import java.util.Scanner;

public class atv_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Média de Notas com Pesos Dinâmicos.");

        do {
            System.out.print("Digite a 1ª nota (digite um valor negativo para sair): ");
            double nota1 = sc.nextDouble();

            if (nota1 < 0) {
                System.out.println("Encerrando o programa.");
                break;
            }

            System.out.print("Digite a 2ª nota: ");
            double nota2 = sc.nextDouble();

            System.out.print("Digite a 3ª nota: ");
            double nota3 = sc.nextDouble();

            double[] notas = {nota1, nota2, nota3};
            java.util.Arrays.sort(notas);

            double menor = notas[0];   // peso 2
            double meio = notas[1];   // peso 3
            double maior = notas[2];   // peso 5

            double media = (maior * 5 + meio * 3 + menor * 2) / (5 + 3 + 2);

            System.out.printf("Média ponderada: %.2f%n", media);

            boolean mediaOk = media >= 7.0;
            boolean notasOk = nota1 >= 4.0 && nota2 >= 4.0 && nota3 >= 4.0;

            if (mediaOk && notasOk) {
                System.out.println("Resultado: Aprovado Especial");
            } else {
                System.out.println("Resultado: Não se qualificou");
            }

            System.out.println("\n");
        } while (true);
        sc.close();
    }
}
