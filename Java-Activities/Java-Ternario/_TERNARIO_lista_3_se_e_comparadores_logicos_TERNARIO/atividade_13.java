package Atividades.lista_3_se_e_comparadores_logicos;

import java.util.Scanner;

public class atividade_13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ano;

        System.out.println("Digite um ano, o sistema vai declarar se ele é bissexto: ");
        ano = sc.nextInt();

        String txt = (ano % 4 == 0 && ano % 100 != 0) ? ano + " é um ano bissexto." : ano + " não é um ano bissexto.";
        System.out.println(txt);

        /*if (ano % 4 == 0 && ano % 100 != 0) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }*/

        sc.close();
    }
}
