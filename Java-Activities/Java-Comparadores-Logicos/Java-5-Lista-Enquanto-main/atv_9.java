package Atividades.Java_5_Lista_Enquanto;

public class atv_9 {
    public static void main(String[] args) {

        int n,cont,n2;

        cont = 0;
        n2 = 0;
        n = 0;

        while (cont < 50) {

            cont = cont + 2;
            n = cont + n2;
            System.out.println(n2 + "+" + cont + "=" + n);
            n2 = n;

        }
    }
}
