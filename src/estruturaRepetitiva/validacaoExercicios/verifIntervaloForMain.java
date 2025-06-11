package estruturaRepetitiva.validacaoExercicios;

import java.util.Scanner;

public class verifIntervaloForMain {
    public static void main(String[] args) {

        //Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida. Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo)

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //Lê-se o primeiro número, que será a quantidade de valores a serem lidos depois.

        int in = 0;
        int out = 0;

        for (int i=0; i<n; i++) { //Laço for que determina na condição a quantidade de vezes, n, que o looping vai rodar.
            int x = sc.nextInt(); //A cada volta, lê um número e guarda na variável x.
            if (x >= 10 && x <= 20) { //Verifica se x está no intervalo de 10 a 20. Se sim, soma 1 em in. Se não, soma 1 em out.
                in = in + 1;
            }
            else {
                out = out + 1;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out"); //Ao final, mostra o total de números dentro e fora do intervalo.

        sc.close();
    }
}
