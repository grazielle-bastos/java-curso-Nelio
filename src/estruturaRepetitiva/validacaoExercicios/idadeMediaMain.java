package estruturaRepetitiva.validacaoExercicios;

import java.util.Locale;
import java.util.Scanner;

public class idadeMediaMain {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String instrucao = "Digite a idade da pessoa: ";

        System.out.print(instrucao);
        int idade = sc.nextInt();

        int soma = 0; //somar as idades
        int cont = 0; //qtd de idades

        while (idade >= 0) {
            soma += idade;
            cont += 1;
            System.out.print(instrucao);
            idade = sc.nextInt();
        }

        if (cont > 0) {
            double media = (double) soma / cont;
            System.out.printf("%.2f", media);
        } else {
            System.out.println("Impossível calcular");
        }

        sc.close();
    }
}
