package Atividades.Java_11_lista_ForEach;

import java.util.Scanner;

public class ForEach_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] cidades = {"São Paulo", "Rio de Janeiro", "Salvador", "Fortaleza", "Belo Horizonte"};
        for (String cidade:cidades){
            System.out.println(cidade);
        }
    }
}
