package Atividades.java_Flowgorithm_4_Lista_Revisao;

import java.util.Scanner;

public class atv_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i, f;

        System.out.println("Digite o horário de inicio do jogo:");
        i = sc.nextInt();

        while (i > 24) {

            System.out.println("HORA INVÁLIDA! Tente novamente.");
            System.out.println("Digite o horário de inicio do jogo:");
            i = sc.nextInt();
        }

        System.out.println("Digite o horário do fim do jogo:");
        f = sc.nextInt();

        while (f > 24) {

            System.out.println("HORA INVÁLIDA! Tente novamente.");
            System.out.println("Digite o horário do fim do jogo:");
            f = sc.nextInt();
        }

        int soma = (f<i) ? (f+24) - i :
                f - i ;

        System.out.println(soma);

        sc.close();

    }
}
