package Atividades.Java_8_Lista_For;

public class atv_4 {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Iniciando contagem de 0 até 100 de 5 em 5...");
        Thread.sleep(1000);

        for (int i = 0; i <= 100; i = i + 5) {

            System.out.println(i);

        }
    }
}
