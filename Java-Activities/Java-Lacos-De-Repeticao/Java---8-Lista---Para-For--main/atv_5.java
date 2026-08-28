package Atividades.Java_8_Lista_For;

public class atv_5 {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Iniciando exibição de números pares de 0 a 20...");
        Thread.sleep(1000);

        for (int i = 0; i <= 20; i = i + 2) {

            System.out.println(i);

        }
    }
}
