package estruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class tema03_DoWhileMain {
    public static void main(String[] args) {

        //Regra para Faça-Enquanto: Se a condição for verdadeira volta para repetição do bloco de comandos. e se for falsa, pula fora. A condição sempre é verificada no final, então o bloco de comandos é executado pelo menos uma vez.

        //Programa que lê uma temperatura em Celsius e mostra o equivalente em Fahrenheit. Perguntar se o usuário deseja repetir (s/n). Caso o usuário digite "s", repetir o programa.
        //Fórmula: F = 9C/5 + 32

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char resp;                                                  //char resp = 's';
        do {                                                        //while (resp != 'n')
            System.out.print("Digite a temperatura em Celsius: ");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
            System.out.print("Deseja repetir (s/n)? ");
            resp = sc.next().charAt(0);
        } while (resp != 'n');

        sc.close();
    }

}
