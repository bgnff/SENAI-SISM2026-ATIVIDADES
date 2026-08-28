package Atividades.Java_6_ListaFaça_Enquanto;

import java.util.Scanner;

public class atv_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, maior, menor;
        maior = Integer.MIN_VALUE;
        menor = Integer.MAX_VALUE;

        System.out.println("Digite números. O sistema irá imprimir o maior e o menor entre eles:");
        System.out.println("(Digite 0 pra pará)");

        do {

            n = sc.nextInt();

            maior = (n > maior&n!=0) ? n : maior;
            menor = (n < menor&n!=0) ? n : menor;

        } while (n != 0);
        sc.close();
        System.out.println("O maior número é: "+maior);
        System.out.println("O menor número é: "+menor);

    }
}
