package estruturaRepetitiva.validacaoExercicios;

import java.util.Locale;
import java.util.Scanner;

public class verifMediaConjuntoForMain {
    public static void main(String[] args) {
        //Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.

        Locale.setDefault(Locale.US); //Define o formato numérico (utiliza-se o ponto)
        Scanner sc = new Scanner (System.in);

        int N = sc.nextInt(); // Lê a quantidade de casos de teste (quantas vezes o laço vai rodar)

        for (int i=0; i<N; i++) {

            // Lê os três valores reais do caso de teste atual
            double x = sc.nextDouble(); //peso 2
            double y = sc.nextDouble(); //peso 3
            double z = sc.nextDouble(); //peso 5

            // Fórmula da média ponderada:
            // (x * 2 + y * 3 + z * 5) / (2 + 3 + 5)
            double media = (x * 2 + y * 3 + z * 5) / 10;

            // Exibe o resultado com uma casa decimal
            System.out.printf("%.1f%n", media);
        }

        sc.close();
    }
}
