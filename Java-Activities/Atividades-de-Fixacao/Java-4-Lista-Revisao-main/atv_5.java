package Atividades.java_Flowgorithm_4_Lista_Revisao;

import java.util.Scanner;

public class atv_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Digite um número entre 100 e 200:");
        n = sc.nextInt();

        String r = (n > 100 && n < 200) ? "O número " + n + " está dentro do intervalo." :
                (n > 200) ? "O número " + n + " é maior que o intervalo." : "O número " + n + " é menor que o intervalo.";

        System.out.println(r);

    }
}
