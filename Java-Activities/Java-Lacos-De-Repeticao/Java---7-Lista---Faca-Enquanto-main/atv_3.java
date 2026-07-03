package Atividades.Java_7_Lista_Faça_Enquanto;

public class atv_3 {
    public static void main(String[] args) throws InterruptedException {

        int cont = 0;

        System.out.println("INICIANDO SENSOR ÓPTICO...");
        Thread.sleep(1000);

        do {
            cont++;
            Thread.sleep(100);
            System.out.println("Foram lidas " + cont + " peças da esteira");

        } while (cont < 50);
    }
}
