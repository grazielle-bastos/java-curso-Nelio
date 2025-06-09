package estruturaRepetitiva.validacaoExercicios;

import java.util.Scanner;

public class ordemCrescDecMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String instrucao = "Digite um número inteiro: ";

        System.out.print(instrucao);
        int x = sc.nextInt();

        System.out.print(instrucao);
        int y = sc.nextInt();

        while (x != y) {
            if (x < y) {
                System.out.println("Crescente \n");
            } else {
                System.out.println("Decrescente \n");
            }

            System.out.println(instrucao);
            x = sc.nextInt();

            System.out.println(instrucao);
            y = sc.nextInt();

        }

        sc.close();
    }
}
