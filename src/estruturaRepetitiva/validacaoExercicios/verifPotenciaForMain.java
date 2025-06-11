package estruturaRepetitiva.validacaoExercicios;

import java.util.Scanner;

public class verifPotenciaForMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // Lê o número de linhas que o programa deve imprimir

        // Laço for: começa no 1 e vai até N, repetindo N vezes
        for (int i = 1; i <= N; i++) {
            int quadrado = i * i; // Calcula o quadrado de i (número atual da linha)
            int cubo = i * i * i; // Calcula o cubo de i

            System.out.println(i + " " + quadrado + " " + cubo); // Imprime o número, seu quadrado e seu cubo na mesma linha
        }

        sc.close();

    }
}
