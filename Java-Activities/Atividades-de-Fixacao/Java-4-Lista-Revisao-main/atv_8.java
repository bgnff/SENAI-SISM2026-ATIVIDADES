package Atividades.java_Flowgorithm_4_Lista_Revisao;

import java.util.Scanner;

public class atv_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a, p, soma;

        System.out.println("CALCULADORA IMC INICIADA!\nDigite o seu peso para começar:");
        p = sc.nextDouble();
        System.out.println("Agora, digite sua altura:");
        a = sc.nextDouble();

        soma = p / (a * a);

        String r = (soma < 18.5) ? "Você está abaixo do Peso." :
                (soma > 18.5 && soma < 24.9) ? "Você está com o Peso normal. IMC: "  :
                (soma > 25 && soma < 29.9) ? "Você está acima do Peso. IMC: "  :
                (soma > 30 && soma < 34.9) ? "Você está no Nível 1 de Obesidade. (severa) IMC: "  :
                (soma > 35 && soma < 39.9) ? "Você está no Nível 2 de Obesidade. IMC: "  : "Você está no Nível 3 de Obesidade (mórbida) IMC: " ;

        System.out.printf("%s%.2f%n",r,soma);

        sc.close();
    }
}
