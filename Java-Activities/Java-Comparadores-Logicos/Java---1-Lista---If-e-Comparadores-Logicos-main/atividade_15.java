package Atividades.lista_3_se_e_comparadores_logicos;

import java.util.Scanner;

public class atividade_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 3 números, o sistema vai calcular para verificar se eles podem formar um triângulo: ");
        System.out.println("Primeiro número:");
        int a = sc.nextInt();

        System.out.println("Segundo número:");
        int b = sc.nextInt();

        System.out.println("terceiro número:");
        int c = sc.nextInt();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Os lados devem ser maiores que zero!");
        } else if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Os valores " + a + ", " + b + " e " + c + " formam um triângulo!");
        } else {
            System.out.println("Os valores " + a + ", " + b + " e " + c + " não formam um triângulo.");
        }
        sc.close();
    }
}
