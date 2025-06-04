package estruturaSequencial.validacaoExercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex04Main {
    public static void main(String[] args) {

        //Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int func, horas_trab;
        double vlr_hora;

        System.out.println("Digite o número do funcionário: ");
        func = sc.nextInt();

        System.out.println("Digite o número de horas trabalhadas: ");
        horas_trab = sc.nextInt();

        System.out.println("Digite o valor que recebe por hora: ");
        vlr_hora = sc.nextDouble();

        System.out.println("O número do funcionário é: " + func);

        double salario = vlr_hora * horas_trab;

        System.out.printf("O salário do funcionário é: R$ %.2f", salario);

        sc.close();
    }
}
