package estruturaCondicional.validacaoExercicios;

import java.util.Scanner;

public class comparacoesNumerosMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.println("Insira o primeiro número: ");
        a = sc.nextInt();

        System.out.println("Insira o segundo número: ");
        b = sc.nextInt();

        System.out.println("Insira o terceiro número: ");
        c = sc.nextInt();

        sc.close();

        if (a < b && a < c) {
            System.out.println("MENOR = " + a);
        } else if (b < c) {
            System.out.println("MENOR = " + b);
        } else {
            System.out.println("MENOR = " + c);
        }

    }
}
