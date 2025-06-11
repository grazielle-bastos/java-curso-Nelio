package estruturaRepetitiva.validacaoExercicios;

import java.util.Scanner;

public class verifDivisoresForMain {
    public static void main(String[] args) {

        //Ler um número inteiro N e calcular todos os seus divisores.

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int result = 0;

        // Verifica todos os números de 1 até N
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) { // se i for divisor de N
                System.out.println(i); // imprime
            }
        }

        sc.close();
    }
}
