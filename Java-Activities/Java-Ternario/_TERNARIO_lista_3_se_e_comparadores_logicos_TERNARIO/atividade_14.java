package Atividades.lista_3_se_e_comparadores_logicos;

import java.util.Scanner;

public class atividade_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;

        System.out.println("Digite a nota do alunoa, o sistema vai declarar se ele foi aprovado ou reprovado: ");
        nota = sc.nextDouble();

        String txt = (nota >= 7) ? "Aluno aprovado." : "Aluno reprovado.";
        System.out.println(txt);

        /*if (nota >= 7) {
            System.out.println("Aluno aprovado.");
        } else {
            System.out.println("Aluno reprovado.");
        }*/
        sc.close();
    }
}
