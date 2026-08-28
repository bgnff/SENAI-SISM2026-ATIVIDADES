package Atividades.Java_5_Lista_Enquanto;

public class atv_6 {
    public static void main(String[] args) {

        int cont, n2, n;

        cont = 1;
        n2 = 1;

        System.out.println("Exibindo a soma de todos os números de 1 a 10....");

        while (cont < 10) {

            cont = cont + 1;
            n = cont + n2;
            System.out.println(n2 + "+" + cont + "=" + n);
            n2 = n;

        }
    }
}
