package Atividades.Java_6_ListaFaça_Enquanto;

import java.util.Scanner;

public class atv_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, cont, soma, s;
        cont = 1;
        soma = 0;
        s = 0;

        System.out.println("INICIANDO CONTAGEM COM LIMITE....\nO sistema irá somar números acima de 50.");

        System.out.println("Digite 8 números:");

        do {

            n = sc.nextInt();
            soma = (n > 50) ? soma + n : soma;
            cont = cont + 1;


        } while (cont <= 8);
        sc.close();
        System.out.println("O total da soma foi de: "+soma);
    }
}