package Atividades.Desafio_8_5;

public class atv_2 {
    public static void main(String[] args) {
        StringBuilder exp = new StringBuilder();
        int n1 = 0;
        int n2 = 1;
        int soma = 0;

        System.out.println("===Sequência de Fibonacci Específica===\n");
        System.out.println("Sequência de Fibonacci sera calculada.\nSe o termo por impar e múltiplo de 3, ele sera adicionado em uma variavel de soma total enquanto o termo gerado for menor que 50000.");

        while (soma < 50000) {
            int save = n1 + n2;
            n1 = n2;
            n2 = save;
            if (save % 3 == 0) soma += save;
            exp.append(save);
            exp.append(" ");
        }
        System.out.println(exp);
        System.out.println("A soma final é: "+soma);
    }
}
