package Atividades.java_Flowgorithm_4_Lista_Revisao;

import java.util.Scanner;

public class atv_15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int d, m;

        System.out.println("Para verificarmos se você é do signo de Áries");
        System.out.println("Digite o dia do seu nascimento:");
        d = sc.nextInt();

        while (d < 0 || d > 31) {

            System.out.println("DIGITE UM DIA VÁLIDO.");
            System.out.println("Digite o dia do seu nascimento:");
            d = sc.nextInt();

        }

        System.out.println("Digite o mês do seu nascimento:");
        m = sc.nextInt();

        while (m < 0 || m > 12){

            System.out.println("DIGITE UM MÊS VÁLIDO.");
            System.out.println("Digite o mês do seu nascimento:");
            m = sc.nextInt();
        }


            String r = (d >= 21 && d <= 31 && m == 3 || d >= 1 && d <= 19 && m == 4) ? "O seu signo é de Áries." :
                    "O seu signo não é  de Áries.";

        System.out.println(r);

        sc.close();

    }
}
