package Atividades.Java_7_Lista_Faça_Enquanto;

import java.util.Scanner;

public class atv_14 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        double cargatotal=0, n;

        System.out.println("O sistema calcula o limite de carga de um veiculo que suporta até 1000kg, va adcionando carta até atingir o limite ou ultrapassalo.");

        do {
            System.out.print("Digite o peso da carga (kg): ");
            n = sc.nextDouble();

            cargatotal = cargatotal + n;

            System.out.println("Carga atual "+cargatotal+"kg.");

            if (cargatotal<1000){
                System.out.println("O veiculo ainda suporta "+(1000-cargatotal)+"kg.");
            }

        }while (cargatotal<1000);

        String txt = (cargatotal>1000) ? "Peso limite excedido em "+(cargatotal-1000)+"kg." : "Peso limite atingido.";
        System.out.println(txt);
        sc.close();
    }
}
