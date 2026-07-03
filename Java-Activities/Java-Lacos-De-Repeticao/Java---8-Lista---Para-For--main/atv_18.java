package Atividades.Java_8_Lista_For;

import java.util.Scanner;

public class atv_18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n,cont;
        cont  = 0;
        System.out.println("Digite um numero primo: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            if (n % i == 0) cont++;
        }
        sc.close();
        String txt = (cont == 2) ? "O número "+n+" é um número primo." : "O número "+n+" não é  um número primo.";
        System.out.println(txt);

        }
    }

