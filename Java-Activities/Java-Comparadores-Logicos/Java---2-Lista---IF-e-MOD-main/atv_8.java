package Atividades.flowgorithm_2_Lista_Se_e_MOD;

import java.util.Scanner;

public class atv_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, n2, soma;

        System.out.println("Digite 2 números e o programa dirá se um é divisivel pelo outro: ");
        System.out.println("Digite o primeiro número: ");
        n = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        n2 = sc.nextInt();

        soma = n % n2;

        if (soma == 0) {

            System.out.println("Status: DIVISÃO EXATA!\nO número " + n + " é divisivel pelo número " + n2);

        } else {

            System.out.println("Status: SOBROU... \nO resto da divisão é: " + soma);
        }
        sc.close();
    }
}
