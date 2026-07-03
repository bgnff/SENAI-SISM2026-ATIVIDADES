package exercicio11;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]a=new int[15];
        int cont=0;
        System.out.println("Digite 15 numeros.");
        for (int i=0;i<15;i++){
            a[i]=sc.nextInt();
        }
        for (int b:a){
            if (b%2==0){
                cont++;
            }
        }
        System.out.println("Ha "+cont+" pares.");
        sc.close();
    }
}
