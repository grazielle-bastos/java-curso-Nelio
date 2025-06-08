package estruturaCondicional;

import java.util.Scanner;

public class tema03_SwitchCaseMain {
    public static void main(String[] args) {

        //Fazer um programa que leia um número inteiro entre 1 a 7 representando um dia da semana (1 = domingo, 2 = segunda feira, e assim por diante). Escrever na tela o dia da semana correspondente.

        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite um dia da semana: ");
        int x = sc.nextInt();

        sc.close();

        String diaSemana;

        switch (x) {
            case 1:
                diaSemana = "Domingo";
                break;
            case 2:
                diaSemana = "Segunda-feira";
                break;
            case 3:
                diaSemana = "Terça-feira";
                break;
            case 4:
                diaSemana = "Quarta-feira";
                break;
            case 5:
                diaSemana = "Quinta-feira";
                break;
            case 6:
                diaSemana = "Sexta-feira";
                break;
            case 7:
                diaSemana = "Sábado";
                break;

            default:
                diaSemana = "Valor inválido";
                break;
        }

        System.out.print("Dia da semana: " + diaSemana);
    }
}
