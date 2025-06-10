package estruturaRepetitiva;

import java.util.Scanner;

public class tema02_ForMain {
    public static void main(String[] args) {
        //Regra: Início - Executa somente na primeira vez; Condição - Se verdadeiro executa e volta, e se falso pula fora do escopo; Incremento - Executa toda vez depois de voltar.

        //For é usado quando se sabe previamente a quantidade de repetições, ou o intervalo de valores.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int N = sc.nextInt();

        int soma = 0;
        for (int i=0; i<N; i++) {
            int x = sc.nextInt();
            soma += x; // soma = soma + x;
        }

        System.out.println(soma);

        sc.close();

    }
}
