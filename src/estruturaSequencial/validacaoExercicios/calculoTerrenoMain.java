package estruturaSequencial.validacaoExercicios;

import java.util.Locale;
import java.util.Scanner;

public class calculoTerrenoMain {
    public static void main(String[] args) {

        //Terreno Retangular - Entrada, processamento e Saída de Dados.

        //Área = largura * comprimento
        //Preço = área * preço do metro quadrado

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a largura do terreno: ");
        double largura = sc.nextDouble(); //20.0
        System.out.printf("\nA largura do terreno é %.1f\n", largura);

        System.out.println("====================");

        System.out.println("\nDigite o comprimento do terreno: ");
        double comprimento = sc.nextDouble(); //30.0
        System.out.printf("\nO comprimento do terreno é %.1f\n", comprimento);

        System.out.println("====================");

        System.out.println("\nDigite o preço por metro quadrado do terreno: ");
        double MetroQuadrado = sc.nextDouble(); //200.00
        System.out.printf("\nO preço por metro quadrado do terreno é %.2f%n", MetroQuadrado);

        sc.close();

        System.out.println("====================");

        double valorArea = (largura * comprimento);

        System.out.printf("\nO preço da área por metro quadrado do terreno é %.2f \n", valorArea);

        System.out.println("====================");

        double valorPreco = (MetroQuadrado * valorArea);

        System.out.printf("\nO valor do preço do terreno é %.2f\n", valorPreco);

    }
}
