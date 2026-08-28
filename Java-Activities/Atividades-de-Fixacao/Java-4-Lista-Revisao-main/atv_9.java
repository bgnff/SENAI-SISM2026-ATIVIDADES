package Atividades.java_Flowgorithm_4_Lista_Revisao;

import java.util.Scanner;

public class atv_9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char l;

        System.out.println("Escreva uma letra (o sistema irá verificar se é vogal ou consoante):");
        l = sc.next().charAt(0);

        String r = (l != 'a'&&l != 'e'&& l != 'i'&& l  != 'o'&& l != 'u') ? "A letra "+l+" é uma consoante." : "A letra "+l+" é uma vogal." ;

        System.out.println(r);

        sc.close();
    }
}
