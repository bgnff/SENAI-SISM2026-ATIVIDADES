package Atividades.Java_6_ListaFaça_Enquanto;

import java.util.Scanner;

public class atv_15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, cont;
        cont = 0;
        String nome;

        System.out.println("Digite seu user:");
        nome = sc.next();

        System.out.println("Olá " + nome + "!");
        System.out.println("Digite sua senha para continuar:");
        n = sc.nextInt();

        while (n != 1234) {

            System.out.println("Senha incorreta! Tente novamente: ");
            n = sc.nextInt();

        }sc.close();

        System.out.println("Usuário logado! Seja bem vindo "+nome+"!");

    }
}
