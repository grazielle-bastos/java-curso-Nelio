package POO.application.grades;

import POO.entities.grades.Student;

import java.util.Locale;
import java.util.Scanner;

public class ProgramGrade {
    public static void main(String[] args) {

        //Programa que lê o nome de um aluno e as três notas que ele obteve nos três trimestres do ano (para entrada: primeiro trimestre vale 30, e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam para o aluno obter o mínimo para ser aprovado (que é 60% da nota).

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        Student student = new Student();

        System.out.print("Digite o nome do aluno: ");
        student.nome = sc.nextLine();

        System.out.println("Digite a nota do primeiro trimestre, considerando 30 pontos para a nota máxima: ");
        student.nota1 = sc.nextDouble();

        System.out.println("Digite a nota do segundo trimestre, considerando 35 pontos para a nota máxima: ");
        student.nota2 = sc.nextDouble();

        System.out.println("Digite a nota do terceiro trimestre, considerando 35 pontos para a nota máxima: ");
        student.nota3 = sc.nextDouble();

        student.soma();
        System.out.printf("Nota final: %.2f%n", (double) student.soma);

        student.verificarAprovacao();

        sc.close();

    }

}
