package Atividades.flowgorithm_2_Lista_Se_e_MOD;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class atv_9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double p;

        System.out.println("VERIFICADOR DE DESCONTO");
        System.out.println("Obs: (Compras acima de R$ 100,00, ganham 10% de desconto.) ");
        System.out.println("Digite o valor total da sua compra: ");
        p = sc.nextDouble();

        if (p > 100) {

            p = p - p * 0.1;

            System.out.println("Obrigado pela compra!\nDesconto aplicado: 10%");
            System.out.printf("Valor total da compra: R$ %.2f%n", p);

        } else {

            System.out.println("Obriago pela compra!\nSem desconto aplicado.\nValor total da compra: R$ " + p);

        }
        sc.close();
    }
}
