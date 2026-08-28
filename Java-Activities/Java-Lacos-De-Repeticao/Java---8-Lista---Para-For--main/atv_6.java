package Atividades.Java_8_Lista_For;

public class atv_6 {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Iniciando exibição da soma de 1 até 10...");
        Thread.sleep(1500);

        int  n = 1;

        for (int i = 2; i <=10; i++) {

            int soma =  n + i;
            System.out.println(n+"+"+i+"="+soma);
            n = soma;

        }
    }
}
