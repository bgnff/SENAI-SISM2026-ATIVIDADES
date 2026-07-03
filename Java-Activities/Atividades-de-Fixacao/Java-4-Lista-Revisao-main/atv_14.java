package Atividades.java_Flowgorithm_4_Lista_Revisao;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class atv_14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double n, soma;

        System.out.println("CALCULADOR DE IMPOSTOS!!");
        System.out.println("Digite seu salário (O sistema dirá se você está isento de impostos ou não):");
        n = sc.nextDouble();

        while (n < 0) {

            System.out.println("ERRO! TENTE NOVAMENTE.");
            System.out.println("Digite seu salário (O sistema dirá se você está isento de impostos ou não):");
            n = sc.nextDouble();

        }

        soma = (n > 0 && n <= 2000) ? soma = n :
                (n > 2000 && n <= 5000) ? soma = n - n * 0.1 :
                (n > 5000) ? soma = n - n * 0.2 : 0;

        String r = (n > 0 && n <= 2000) ? "Isento de impostos. \nValor total: " :
                (n > 2000 && n <= 5000) ? "Desconto de 10%.\nValor total: " :
                (n > 5000) ? "Desconto de 20%.\nValor total: " : "ERRO! DIGITE UM VALOR VÁLIDO.";

        System.out.printf("%s %.2f%n",r,soma);
        sc.close();

    }
}
