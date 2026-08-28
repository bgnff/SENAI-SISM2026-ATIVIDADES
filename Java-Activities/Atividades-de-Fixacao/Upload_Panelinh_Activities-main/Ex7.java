package Lista11;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vet = new int[10];
        int soma = 0,m=0;
        System.out.println("Digite 10 números e mostraremos a média e quantos estão acima da média: ");
        for (int i = 0; i < vet.length; i++) {
            vet[i] = scan.nextInt();
            soma += vet[i];
        }
        soma = soma / vet.length;
        for (int i : vet) {
            m = (i > soma)?m+1:m;
        }
        System.out.println("A média dos números foi: "+ soma +" e houveram "+m+" números acima da média");
    }
}
