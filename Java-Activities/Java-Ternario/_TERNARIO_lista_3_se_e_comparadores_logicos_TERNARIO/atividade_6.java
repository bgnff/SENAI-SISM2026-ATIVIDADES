package Atividades.lista_3_se_e_comparadores_logicos;

import java.util.Scanner;

public class atividade_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int idade;

        System.out.println("Digite sua idade para a classificação: ");
        idade = sc.nextInt();

        String idade2 = (idade <= 0) ? "Idade inválida." :
                        (idade <= 12) ? "Classificação: Infantil" :
                        (idade <= 17) ? "Classificação: Adolescente" :
                        (idade <= 64) ? "Classificação: Adulto" : "Classificação: Idoso";

        System.out.println(idade2);


        /*if (idade <= 12) {

            System.out.println("Classificação: Infantil");
        } else if (idade <= 17) {

            System.out.println("Classificação: Adolescente");

        } else if (idade <= 64) {

            System.out.println("Classificação: Adulto");

        } else {

            System.out.println("Classificação: Idoso");

        }*/

        sc.close();
    }
}