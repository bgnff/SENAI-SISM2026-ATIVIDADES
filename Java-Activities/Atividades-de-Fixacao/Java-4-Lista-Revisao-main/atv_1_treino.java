package Atividades.java_Flowgorithm_4_Lista_Revisao;

import java.util.Scanner;

public class atv_1_treino {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, maior;
        maior = Integer.MIN_VALUE;

        System.out.println("Digite 3 números e o sistema dirá qual é o maior entre eles. ");

        for (int cont = 0; cont < 3; cont++) {

            System.out.println("Digite os números:  ");
            n = sc.nextInt();

            if (n > maior) {

                maior = n;
            }


        }
        sc.close();

        System.out.println("O maior número é o " + maior);


    }
}
