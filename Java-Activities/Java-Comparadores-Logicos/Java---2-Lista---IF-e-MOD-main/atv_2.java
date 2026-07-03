package Atividades.flowgorithm_2_Lista_Se_e_MOD;

import java.util.Scanner;

public class atv_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nota1, nota2, soma;

        System.out.println("Digite as 2 notas de um aluno.\nO sistema vai calcular a média e informar se ele está APROVADO ou REPROVADO: ");
        System.out.println("Digite a nota 1: ");
        nota1 = sc.nextInt();
        System.out.println("Digite a nota 2: ");
        nota2 = sc.nextInt();

        soma = nota1 + nota2 / 2;
        if (soma < 7) {

            System.out.println("Média: " + soma + " \nStatus: REPROVADO.\n(Média menor que 7.)");
        } else {

            System.out.println("Média: " + soma + "\nStatus: APROVADO!\n(Média maior que 7.)");
        }
        sc.close();
    }
}
