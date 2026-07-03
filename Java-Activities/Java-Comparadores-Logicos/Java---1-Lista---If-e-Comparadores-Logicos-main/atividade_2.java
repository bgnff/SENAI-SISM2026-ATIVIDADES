package Atividades.lista_3_se_e_comparadores_logicos;

import java.util.Scanner;

public class atividade_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double preco;

        System.out.println("Digite o preço do produto comprado: ");
        preco = sc.nextDouble();

        if (preco < 100) {


            System.out.printf("Desconto de 10% aplicado.\nValor total: R$ %.2f%n", preco - (preco * 0.1));


        } else {

            System.out.printf("Sem desconto aplicado.\nValor total: R$ %.2f%n", preco);
        }
        sc.close();
    }
}
