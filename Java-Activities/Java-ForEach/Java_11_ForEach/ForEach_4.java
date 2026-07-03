package Atividades.Java_11_lista_ForEach;

import java.util.Scanner;

public class ForEach_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] notas = new double[8];
        boolean ver = false;

        System.out.println("Digite a notas dos alunos.");
        for (int i=0; i< notas.length; i++){
            System.out.print("Digite a nota do "+(i+1)+"º aluno: ");
            notas[i] = sc.nextInt();
        }
        for (double check : notas){
            if (check<5.0){
                System.out.println("Alerta a nota "+check+" é menor do que 5.0.");
                ver = true;
            }
        }
        if (!ver) System.out.println("Todas as notas são iguais ou maiores que 5.0.");
        sc.close();
    }
}
