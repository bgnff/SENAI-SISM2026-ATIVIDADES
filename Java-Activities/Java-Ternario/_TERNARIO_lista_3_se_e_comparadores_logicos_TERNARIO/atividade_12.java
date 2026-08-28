package Atividades.lista_3_se_e_comparadores_logicos;

import java.util.Scanner;

public class atividade_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, maior, menor;
        maior = Integer.MIN_VALUE;
        menor = Integer.MAX_VALUE;

        System.out.println("Digite três números, o sistema vai derminar qual o maior e o menor entre eles.");

        for (int cont = 0; cont < 3; cont++) {
            System.out.println("Digite o número:");
            n = sc.nextInt();

            maior = (n>maior) ? n : maior;
            menor = (n<menor) ? n : menor;

            /*if (n > maior) {
                maior = n;
            }
            if (n < menor){
                menor = n;
            }*/
        }
        System.out.println("O maior número é " + maior);
        System.out.println("O menor número é " + menor);
        sc.close();
    }
}
