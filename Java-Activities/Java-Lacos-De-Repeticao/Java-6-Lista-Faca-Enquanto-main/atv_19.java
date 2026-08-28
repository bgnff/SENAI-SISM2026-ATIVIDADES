package Atividades.Java_6_ListaFaça_Enquanto;

import java.util.Scanner;

public class atv_19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, soma, cont;
        soma = 0;
        cont = 0;

        System.out.println("Digite quantos números quiser! (0 para finalizar)");
        System.out.println("O sistema irá somar e calcular a média dos números maiores que 100: ");

        do {
            n = sc.nextInt();

            soma = (n > 100) ? soma + n : soma;
            cont = (n > 100) ? cont + 1 : cont;


        } while (n != 0);
        sc.close();
        System.out.println("A média dos números maiores que 100 foi de: " + soma / cont);
    }
}
