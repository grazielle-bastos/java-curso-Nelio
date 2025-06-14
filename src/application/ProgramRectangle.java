package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class ProgramRectangle {
    public static void main(String[] args) {

        //Programa para ler os valores da largura e altura de um retângulo. Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //1 - Criar uma classe com os atributos representando o retangulo.

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.printf("AREA = %.2f%n", rectangle.area());
        System.out.printf("PERIMETER = %.2f%n", rectangle.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rectangle.diagonal());

        sc.close();
    }
}
