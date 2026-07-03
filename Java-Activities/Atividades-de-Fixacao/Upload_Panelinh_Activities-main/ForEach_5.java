package Atividades.Java_11_lista_ForEach;

public class ForEach_5 {
    public static void main(String[] args) {

        Integer[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (Integer obj : numeros) {
            System.out.println("5 " + "x " + obj + " = " + (obj * 5));
        }

    }
}
