package Atividades.Java_11_lista_ForEach;

import java.util.Scanner;

public class ForEach_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] vet = new String[10];
        System.out.println("Digite 10 palavras.");
        for (int i = 0; i< vet.length; i++){
            System.out.print("Digite a "+(i+1)+"ª palavra: ");
            vet[i] = sc.nextLine();
        }
        for (String print : vet){
            if (print.length()>=5) System.out.println(print);
        }
        sc.close();
    }
}
