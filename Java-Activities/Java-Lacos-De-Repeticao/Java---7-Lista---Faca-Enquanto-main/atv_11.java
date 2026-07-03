package Atividades.Java_7_Lista_Faça_Enquanto;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class atv_11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, soma;
        soma = 0;

        System.out.println("Digite o consumo da máquina de produção (em kWh). Ao ultrapasar 500kWh o programa será finalziado:");

        do {
            n = sc.nextInt();
            soma = soma + n;

        } while (soma < 500);
        sc.close();
        System.out.println("O consumo da máquina ultrapassou 500 kWh.");
    }
}
