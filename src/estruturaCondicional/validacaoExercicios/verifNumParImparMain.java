package estruturaCondicional.validacaoExercicios;

import java.util.Scanner;

public class verifNumParImparMain {
    public static void main(String[] args) {

        //Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num = sc.nextInt();

        sc.close();

        if (num % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("ÍMPAR");
        }

    }
}
