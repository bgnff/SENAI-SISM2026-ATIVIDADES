package Atividades.Java_11_lista_ForEach;

import java.util.Arrays;
import java.util.Random;

public class ForEach_6 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int [] vet = new  int [12];
        Integer maior=Integer.MIN_VALUE,menor=Integer.MAX_VALUE;
        for (int i =0; i<vet.length;i++){
            vet [i] = rnd.nextInt(300);
        }
        System.out.println("Esses são os 12 numeros aleatorios "+Arrays.toString(vet));
        for (int c : vet){
            maior = (c > maior)?c:maior;
            menor = (c<menor)?c:menor;
        }
        System.out.println("O maior numero é o "+maior+" e o menor numero é o "+menor);





    }
}
