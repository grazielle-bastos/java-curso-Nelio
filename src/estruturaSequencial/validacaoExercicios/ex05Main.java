package estruturaSequencial.validacaoExercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex05Main {
    public static void main(String[] args) {

        //Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1, num1, cod2, num2;
        double vlr_unit1, vlr_unit2, custo1, custo2, custo_total;

        System.out.println("Digite o código da peça 1: " );
        cod1 = sc.nextInt();

        System.out.println("Digite o número da peça 1: " );
        num1 = sc.nextInt();

        System.out.println("Digite o valor unitário de cada peça 1: ");
        vlr_unit1 = sc.nextDouble();

        System.out.println("Digite o código da peça 2: " );
        cod2 = sc.nextInt();

        System.out.println("Digite o número da peça 2: " );
        num2 = sc.nextInt();

        System.out.println("Digite o valor unitário de cada peça 2: ");
        vlr_unit2 = sc.nextDouble();

        custo1 = num1 * vlr_unit1;
        custo2 = num2 * vlr_unit2;
        custo_total = custo1 + custo2;

        System.out.printf("Valor a pagar: R$ %.2f", custo_total);

        sc.close();

    }
}
