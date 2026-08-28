package Atividades.java_Flowgorithm_4_Lista_Revisao;

import java.util.Scanner;

public class atv_11 {

    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        int n;

        System.out.println("Digite um número.\n(O sistema dirá se ele é par e menor que 100 ou impar maior que 100):");
        n = sc.nextInt();

        String r = (n%2==0&&n<100) ? "O número "+n+" é par e menor que 100." :
                (n%2==0&&n>100) ? "O número "+n+" é par e maior que 100." :
                (n>100) ? "O número "+n+" é ímpar e maior que 100." : "O número "+n+" é ímpar e menor que 100." ;

        System.out.println(r);

        sc.close();

    }
}
