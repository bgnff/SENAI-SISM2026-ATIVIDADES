package Atividades.java_Flowgorithm_4_Lista_Revisao;

import java.util.Scanner;

public class atv_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Digite um número (o sistema dirá se é multiplo de 7 ou 11):");
        n = sc.nextInt();

        String n2 = (n % 7 == 0 && n % 11 == 0) ? "Este número é multiplo de 7 e de 11." :
                (n % 7 == 0) ? "Este número é multiplo de 7." :
                (n % 11 == 0) ? "Este número é multiplo de 11." : "Este número não é multiplo de 11 nem de 7.";

        System.out.println(n2);

        sc.close();
    }

}
