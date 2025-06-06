package estruturaCondicional.validacaoExercicios;

import java.util.Locale;
import java.util.Scanner;

public class resultadoNotasMain {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double nota1;
        double nota2;

        System.out.print("Digite a nota do primeiro semestre: ");
        nota1 = sc.nextDouble();

        System.out.print("Digite a nota do segundo semestre: ");
        nota2 = sc.nextDouble();

        sc.close();

        double notaFinal = nota1 + nota2;

        System.out.printf("A nota final do aluno é: %.1f%n", notaFinal);

        if (notaFinal < 60.00 ) {
            System.out.println("REPROVADO");
        }

    }

}
