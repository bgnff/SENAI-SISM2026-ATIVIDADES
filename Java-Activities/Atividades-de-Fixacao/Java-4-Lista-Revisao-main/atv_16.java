package Atividades.java_Flowgorithm_4_Lista_Revisao;

import java.util.Scanner;

public class atv_16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("VERIFICAÇÃO DE NÚMERO DIVISIVEL POR 2,3 E 5!");
        System.out.println("Digite um número e o sistema irá verifica-lo:");
        n = sc.nextInt();

        String r = (n % 2 == 0 & n % 3 == 0 & n % 5 == 0) ? "O número " + n + " é divisivel por 2,3 e 5." : "O número " + n + " não é divisivel por 2,3 e 5.";
        System.out.println(r);
        sc.close();
    }
}
