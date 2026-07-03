package Atividades.Java_7_Lista_Faça_Enquanto;

import java.util.Scanner;

public class atv_1 {
    public static void main(String[] args) throws InterruptedException {

        double temperatura;

        Scanner sc = new Scanner (System.in);
        System.out.println("INICIANDO VERIFICAÇÃO DE TEMPERATURA DE MÁQUINAS...");
        Thread.sleep(1000);

        System.out.println("Digite a temperatura da máquina: ");
        temperatura = sc.nextDouble();

        while (temperatura<180){

            System.out.println("Temperatura inválida....");
            Thread.sleep(1000);
            System.out.println("Digite novamente: ");
            temperatura = sc.nextDouble();
        }
        String txt = (temperatura>=180&temperatura<=250) ? "Temperatura dentro das condições." :
                (temperatura>=250&temperatura<=300) ? "Iniciar atividades de resfriamento." : "Temperatura acima do normal. Desligar a máquina imediatamente!";
        System.out.println(txt);
        sc.close();
        }

    }

