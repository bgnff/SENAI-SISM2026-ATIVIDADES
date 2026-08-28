package Atividades.Java_7_Lista_Faça_Enquanto;

public class atv_19 {
    public static void main(String[] args) {

        int rpmAtual = 0; // Motor começa parado
        int rpmLimite = 3000;
        int incremento = 500;

        System.out.println("Iniciando aceleração do motor...");

        do {

            System.out.println("Rotação atual: " + rpmAtual + " RPM");
            rpmAtual = rpmAtual + incremento;

        } while (rpmAtual <= rpmLimite);

        System.out.println("Limite de 3000 RPM atingido. Estabilizando motor.");
    }
}
