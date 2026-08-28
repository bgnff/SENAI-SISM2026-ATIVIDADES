package Atividades.Java_8_Lista_For;

public class atv_2 {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Iniciando contagem de 10 a 0 (decrescente)...");
        Thread.sleep(1500);

        for (int i = 10; i>=1 ; i--) {

            System.out.println(i);
        }
    }
}
