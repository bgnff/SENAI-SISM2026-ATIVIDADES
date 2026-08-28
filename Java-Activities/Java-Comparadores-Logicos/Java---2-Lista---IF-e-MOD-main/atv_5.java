package Atividades.flowgorithm_2_Lista_Se_e_MOD;

import java.util.Scanner;

public class atv_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Digite um núemro, o sistema vai declarar se ele é divisivel por 2 e 3 ao mesmo tempo:");
        n = sc.nextInt();

        if (n % 2 == 0 && n % 3 == 0) {
            System.out.println(n + " é multiplo de 2 e 3 ao mesmo tempo.");
        } else {
            System.out.println(n + " não é multiplo de 2 e 3 ao mesmo tempo.");
        }
        sc.close();
    }
}
