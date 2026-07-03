package Atividades.Java_8_Lista_For;

public class atv_16 {

    public static void main(String[] args) throws  InterruptedException {

        StringBuilder txt = new StringBuilder();

        int n1 = 0;
        int n2 = 1;

        System.out.println("Os 10 números da sequência de Fibonacci são: ");
        Thread.sleep(1000);

        for (int i = 1; i <= 10; i++) {
             int soma = n1 + n2;
             n1 = n2;
             n2 = soma;

             txt.append(soma);
             if (i<10) txt.append(", ");

        }
        System.out.println(txt);
    }
}
