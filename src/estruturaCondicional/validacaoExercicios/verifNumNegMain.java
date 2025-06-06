package estruturaCondicional.validacaoExercicios;

import java.util.Scanner;

public class verifNumNegMain {
    public static void main(String[] args) {

        //Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num = sc.nextInt();

        sc.close();

        if (num < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NÃO NEGATIVO");
        }

    }
}
