package Atividades.Java_8_Lista_For;

import java.util.Scanner;

public class atv_13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        int cont = 0;
        System.out.println("Digite 10 números. O sistema mostrará no final quantos são pares:");

        for (int i = 0; i < 10; i++){
            n = sc.nextInt();

            if (n %2 == 0){
                cont++;
            }

        }
        sc.close();
        System.out.println("Existem "+cont+" números pares.");
    }
}
