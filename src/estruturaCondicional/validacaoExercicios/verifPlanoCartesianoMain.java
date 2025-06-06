package estruturaCondicional.validacaoExercicios;

import java.util.Locale;
import java.util.Scanner;

public class verifPlanoCartesianoMain {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do eixo X: ");
        double valorX = sc.nextDouble();

        System.out.println("Digite o valor do eixo Y: ");
        double valorY = sc.nextDouble();

        sc.close();

        if (valorX > 0 && valorY > 0) {
            System.out.println("Q1");
        } else if (valorX < 0 && valorY > 0) {
            System.out.println("Q2");
        } else if (valorX < 0 && valorY < 0) {
            System.out.println("Q3");
        } else if (valorX > 0 && valorY < 0) {
            System.out.println("Q4");
        } else if (valorX == 0 && valorY == 0) {
            System.out.println("Origem");
        } else if (valorY == 0) {
            System.out.println("Eixo X");
        } else {
            System.out.println("Eixo Y");
        }

    }

}
