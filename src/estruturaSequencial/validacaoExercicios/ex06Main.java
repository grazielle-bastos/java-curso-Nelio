package estruturaSequencial.validacaoExercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex06Main {
    public static void main(String[] args) {

        /* Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
        a) a área do triângulo retângulo que tem A por base e C por altura.
        b) a área do círculo de raio C. (pi = 3.14159)
        c) a área do trapézio que tem A e B por bases e C por altura.
        d) a área do quadrado que tem lado B.
        e) a área do retângulo que tem lados A e B */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;

        System.out.println("Digite o valor de A: ");
        A = sc.nextDouble();

        System.out.println("Digite o valor de B: ");
        B = sc.nextDouble();

         System.out.println("Digite o valor de C: ");
        C = sc.nextDouble();

        areaTriangulo = A * C / 2;
        System.out.printf("Fórmula para cálculo da área do triângulo retângulo: (base_A x altura_C) / 2 = %.3f%n", areaTriangulo);

        areaCirculo = 3.14159 * Math.pow(C, 2);
        System.out.printf("Fórmula para cálculo da área do círculo: 3,14159 * raio_C^2 = %.3f%n", areaCirculo);

        areaTrapezio = (A + B) * C / 2;
        System.out.printf("Fórmula para cálculo da área do trapézio: base_A + base_B * altura_C /2 = %.3f%n", areaTrapezio);

        areaQuadrado = B*B;
        System.out.printf("Fórmula para cálculo da área do quadrado: base_B * base_B = %.3f%n", areaQuadrado, " cm²");

        areaRetangulo = A*B;
        System.out.printf("Fórmula para cálculo da área do quadrado: base_B * altura = %.3f%n", areaRetangulo, " cm²");

        sc.close();

    }
}
