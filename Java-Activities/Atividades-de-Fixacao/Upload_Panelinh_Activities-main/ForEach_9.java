package Atividades.Java_11_lista_ForEach;

import java.util.Arrays;
import java.util.Random;

public class ForEach_9 {
    public static void main(String[] args) {

        Random rnd = new Random();
        char[] letras = new char[20];
        int cont = 0;
        Character vogais;

        for (int i = 0; i < letras.length; i++) {
            letras[i] = (char) ('A' + rnd.nextInt(26));
        }
        for (Character letra : letras) {

            if (letra == 'A' || letra == 'a' || letra == 'E' ||
                    letra == 'e' || letra == 'I' ||
                    letra == 'i' || letra == 'O' || letra == 'o' || letra == 'U' || letra == 'u') {
                vogais = letra;
                cont++;
                System.out.print("Vogal: " + vogais + " ");
            }
        }

        System.out.println("\nExistem " + cont + " vogais no vetor.");
    }
}
