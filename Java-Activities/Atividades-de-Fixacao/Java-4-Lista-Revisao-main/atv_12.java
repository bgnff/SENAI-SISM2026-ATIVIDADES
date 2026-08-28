package Atividades.java_Flowgorithm_4_Lista_Revisao;

import java.util.Scanner;

public class atv_12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        double v, soma;

        System.out.println("Digite o valor do produto: ");
        v = sc.nextDouble();

        System.out.println("Selecione a forma de pagamento:\n1 - À vista (10% de desc)\n2 - Cartão (5% de desc)");
        System.out.println("3 - 2x (Preço normal)");
        n = sc.nextInt();

        while (n!= 1 && n != 2 && n != 3) {

            System.out.println("NÚMERO INCORRETO!\nDigite um número disponível no painel:");
            System.out.println("1 - À vista (10% de desc)\n2 - Cartão (5% de desc)\n3 - 2x (Preço normal)\"");
            n = sc.nextInt();
        }

        soma = 0;

        double i = (n == 1) ? soma = v - (v * 0.1) :
                (n == 2) ? soma = v - (v * 0.05) :
                (n == 3) ? soma=v : 0 ;
        String i2 = (n == 1) ? "Valor total:  R$ " :
                (n == 2) ? "Valor total: R$ " :
                (n == 3) ? "Valor da parcela:  R$ "+soma/2 +"\nValor total: R$ " : "ERRO!! TENTE NOVAMENTE.";

        System.out.printf("%s %.2f%n", i2, soma);

        sc.close();
    }
}