package Atividades.lista_3_se_e_comparadores_logicos;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class atividade_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario;
        String txt;

        System.out.println("Digite seu salário, o programa vai declarar se vocé tem um salário alto ou salário baixo: ");
        salario = sc.nextDouble();

        txt = (salario < 2000) ? "Salario baixo" : "Salário alto.";
        System.out.println(txt);


        /*if (salario < 2000) {
            System.out.println("Salário baixo.");
        } else {
            System.out.println("Salário alto.");
        }*/
        sc.close();
    }
}
