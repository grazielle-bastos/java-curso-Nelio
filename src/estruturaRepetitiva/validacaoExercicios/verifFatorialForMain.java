package estruturaRepetitiva.validacaoExercicios;

import java.util.Scanner;

public class verifFatorialForMain {
    public static void main(String[] args) {


        //Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
        //Lembrando que, por definição, fatorial de 0 é 1.

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        //Fatorial é uma multiplicação acumulada:
        //Comece com 1, e multiplica por cada número até N.
        int fatorial = 1; // Inicia com 1, pois é o neutro da multiplicação

        // Repetir de N até 1, multiplicando os valores
        for(int i=1; i<=N; i++) {
            fatorial = fatorial * i; // ou fatorial *= i;
        }

        System.out.println(fatorial);

        sc.close();
    }
}
