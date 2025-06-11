package estruturaRepetitiva.validacaoExercicios;

import java.util.Scanner;

public class verifParesDivisaoForMain {
    public static void main(String[] args) {

        //Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // Lê o número de pares a serem processados

        for(int i=0; i<N; i++) { // Laço vai repetir N vezes

            // Lê os dois valores do par
            int par1 = sc.nextInt(); //numerador
            int par2 = sc.nextInt(); //denominador

            if(par2 == 0) { // ⚠️ Verifica antes se o denominador é zero, para evitar erro na divisão
                System.out.println("Divisão impossível");
            } else {
                double divisao = (double) par1 / par2; // Só realiza a divisão se for possível. Utilizado casting (double) para garantir divisão com casas decimais.
                System.out.printf("%.1f%n", divisao);
            }

        }

        sc.close();
    }
}
