package POO.entities.shapes;

public class Rectangle {

    //Atributos: Largura, Altura,
    //Atributos para cálculos: Área, Perímetro e Diagonal.

    public double width; //Largura
    public double height; //Altura

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }

}
