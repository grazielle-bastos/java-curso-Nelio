package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployee {

    public static void main(String[] args) {

        //Programa que lê os dados de um funcionário (nome, salário bruto e imposto).
        //Em seguida, mostrar os dados do funcionário (nome e salário líquido).
        //Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada (somente o salário bruto é afetado pela porcentagem) e mostrar novamente os dados do funcionário.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //1 - Criar uma classe com os atributos representando os dados (atributos), e os cálculos (métodos).

        Employee employee = new Employee();

        System.out.println("Nome: ");
        employee.nome = sc.nextLine();

        System.out.println("Salário Bruto: ");
        employee.salarioBruto = sc.nextDouble();

        System.out.println("Imposto: ");
        employee.taxa = sc.nextDouble();

        System.out.println();
        System.out.println(employee);

        System.out.println();
        System.out.print("Digite a porcentagem para aumentar o salário: ");
        double percentage = sc.nextDouble();
        employee.acrescimoSalario(percentage);

        System.out.println();
        System.out.println("Dados atualizados: " + employee);


        sc.close();

    }
}
