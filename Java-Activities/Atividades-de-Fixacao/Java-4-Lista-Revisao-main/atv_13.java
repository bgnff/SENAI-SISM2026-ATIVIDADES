package Atividades.java_Flowgorithm_4_Lista_Revisao;

import java.util.Scanner;

public class atv_13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n,met1,met2,r;

        System.out.println("VERIFICAÇÃO DE NÚMERO MÁGICO!");
        System.out.println("Digite um número de 4 digitos que eu direi se ele é um número mágico: ");
        n = sc.nextInt();

        while (n<1000||n>9999) {

            System.out.println("DIGITE UM NÚMERO DE 4 DIGITOS!");
            n = sc.nextInt();

        }
         met1 = n/100;
        met2 = n%100;

        r = (met1 + met2)*(met1+met2);

        String r2 = (r == n ) ? "O seu número é um número mágico!" : "O seu número não é um número mágico." ;

        System.out.println(r2);

        sc.close();

    }
}
