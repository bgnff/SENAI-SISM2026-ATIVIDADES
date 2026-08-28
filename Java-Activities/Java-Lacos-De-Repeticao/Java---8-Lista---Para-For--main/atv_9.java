package Atividades.Java_8_Lista_For;

import java.util.Scanner;

public class atv_9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 0;
        int fatorial = 0;

        StringBuilder sb = new StringBuilder();

        System.out.println("Digite um número e o sistema mostrará o seu fatorial:");
        n = sc.nextInt();

        for (int i = n; i>=1;i--){

            fatorial *= i;

            sb.append(i);

            if ( i > 1){

                sb.append("x");
            }

        }sc.close();
        System.out.println(sb.toString());
        System.out.println(fatorial);
    }
}
