package estruturaCondicional.validacaoExercicios;

import java.util.Locale;
import java.util.Scanner;

public class raizesBhaskaraMain {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Coeficientes da equação do segundo grau, representado por ax^2 + bx + c = 0
        double a;
        double b;
        double c;

        System.out.println("Digite o valor A: ");
        a = sc.nextDouble();

        System.out.println("Digite o valor B: ");
        b = sc.nextDouble();

        System.out.println("Digite o valor C: ");
        c = sc.nextDouble();

        sc.close();

        //Fórmula do delta, representado por b^2 - 4ac
        double delta = Math.pow(b, 2) - 4 * a * c;
        //Fórmula das raízes, representadas por (-b^2 + delta) / 2a, e (-b^2 - delta) / 2a
        double R1 = (-b + Math.sqrt(delta)) / (2 * a);
        double R2 = (-b - Math.sqrt(delta)) / (2 * a);

        //Regras para o resultado das raízes: Delta não pode ser negativo e o coeficiente 'a' não pode ser zero.
        if (delta < 0 || a == 0) {
            System.out.println("Impossível calcular");
        } else {
            System.out.printf("R1 = %.5f%n", R1);
            System.out.printf("R2 = %.5f%n", R2);
        }

    }
}
