package estruturaCondicional.validacaoExercicios;

import java.util.Locale;
import java.util.Scanner;

public class verifIRMain {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o salário: ");
        double salario = sc.nextDouble();

        sc.close();

        double imposto = 0;

        if (salario <= 2000) {
            System.out.println("Isento");
        } else {
            if (salario > 4500) {
                imposto += (salario - 4500) * 0.28;
                salario = 4500;
            }
            if (salario > 3000) {
                imposto += (salario - 3000) * 0.18;
                salario = 3000;
            }
            if (salario > 2000) {
                imposto += (salario - 2000) * 0.08;
            }

            System.out.printf("R$ %.2f\n", imposto);
        }
    }
}

