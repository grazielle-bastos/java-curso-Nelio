package estruturaCondicional.validacaoExercicios;

import java.util.Locale;
import java.util.Scanner;

public class verifImpostoMain {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o salário: ");
        double salario = sc.nextDouble();

        sc.close();

        double imposto = 0;

        if (salario <= 2000) {
            // Até 2000 não paga nada
            imposto = 0;
        }
        else if (salario <= 3000) {
            // Paga 8% sobre a parte que ultrapassa 2000
            imposto = (salario - 2000.0) * 0.08;
        }
        else if (salario <= 4000) {
            // Paga 8% sobre 1000 (faixa de 2000 a 3000)
            // + 18% sobre o que passar de 3000
            imposto = 1000.0 * 0.08 + (salario - 3000.0) * 0.18;
        }
        else {
            // Paga 8% sobre 1000 (faixa de 2000 a 3000)
            // + 18% sobre 1500 (faixa de 3000 a 4500)
            // + 28% sobre o que passar de 4500
            imposto = 1000.0 * 0.08 + 1500.0 * 0.18 + (salario - 4500.0) * 0.28;
        }

        if (imposto == 0.0) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f%n", imposto);
        }

    }
}

