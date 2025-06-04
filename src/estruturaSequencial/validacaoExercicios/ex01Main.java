package estruturaSequencial.validacaoExercicios;

import java.util.Scanner;

public class ex01Main {
    public static void main(String[] args) {

        //Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa, conforme exemplos

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor x: ");
        int x = sc.nextInt();

        System.out.println("Digite o valor y: ");
        int y = sc.nextInt();

        int soma = x + y;

        System.out.println("SOMA = " + soma);

        sc.close();

        /*System.out.println("\n==================\n");

        int a = 10;
        int b = 30;
        int soma_AB = a + b;

        System.out.println("SOMA = " + soma_AB);

        System.out.println("\n==================\n");

        int c = -30;
        int d = 10;
        int soma_CD = c + d;

        System.out.println("SOMA = " + soma_CD);

        System.out.println("\n==================\n");

        int e = 0;
        int f = 0;
        int soma_EF = e + f;

        System.out.println("SOMA = " + soma_EF);*/

    }
}
