package Atividades.flowgorithm_2_Lista_Se_e_MOD;

import java.util.Scanner;

public class atv_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anoN, anoA;

        System.out.println("Digite seu ano de nascimento e o ano atual para saber se você já atingiu a maioridade penal:");
        System.out.println("Ano de nascimento:");
        anoN = sc.nextInt();
        System.out.println("Ano atual:");
        anoA = sc.nextInt();

        if (anoA-anoN>=18){
            System.out.println("Você ja alcançou a maioridade.");
        }else {
            System.out.println("Você ainda não alcançou a maioridade.");
        }
        sc.close();
    }
}
