package estruturaSequencial.validacaoExercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex02Main {
    public static void main(String[] args) {

        //Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos.

        //Fórmula da área: area = π * raio^2
        //Sendo π = 3.14159

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do raio de um círculo: ");
        double r = sc.nextDouble();

        double A = 3.14159 * Math.pow(r, 2);

        System.out.printf("O valor da área deste círculo é: %.4f", A);

        sc.close();
    }
}
