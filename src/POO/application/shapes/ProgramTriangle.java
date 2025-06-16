package POO.application.shapes;

import POO.entities.shapes.staticMember.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class ProgramTriangle {

    public static void main(String[] args) {

        //Programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos possui a maior área.

        //A fórmula para calcular a área de um triângulo  a partir das medidas de seus lados a, b, c é a seguinte (fórmula de Heron):

        //area = √p(p-a)(p-b)(p-c) onde p = a+b+c/2

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //double xA, xB, xC, yA, yB, yC;
        Triangle x, y;
        x = new Triangle(); //instancia o objeto para que ele exista (alocação dinâmica de memória, de Stack para Heap)
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        //double p = (x.a + x.b + x.c) / 2;
        //double areaX = Math.sqrt(p * (p-x.a)*(p-x.b)*(p-x.c));
        double areaX = x.area(); //chama o método de cálculo da área para o seu respectivo triangulo.
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

        sc.close();
    }

}
