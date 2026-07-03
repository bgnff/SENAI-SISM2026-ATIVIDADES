package Atividades.java_Flowgorithm_4_Lista_Revisao;

import java.util.Scanner;

public class atv_4_treino {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("VERIFICADOR DE CATEGORIA DE NADADOR");
        System.out.println("Digite sua idade para a inserção da categoria: ");
        n = sc.nextInt();

        String n2 = (n >= 5 && n <= 7) ? "Categoria: Nadador Infantil" :
                (n >= 8 && n <= 17) ? "Categoria: Nadador Juvenil" :
                (n >= 18) ? "Categoria: Nadador Sênior" : "Idade Inválida!";

        System.out.println(n2);

        sc.close();
    }
}
