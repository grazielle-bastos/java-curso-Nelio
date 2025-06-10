package estruturaRepetitiva.validacaoExercicios;

import java.util.Scanner;

public class verifImparesMain {
    public static void main(String[] args) {

        //Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor inteiro, de 1 a 1000: ");
        int X = sc.nextInt();

        for (int i=0; i<=X; i++) {
            if (i % 2 !=0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
