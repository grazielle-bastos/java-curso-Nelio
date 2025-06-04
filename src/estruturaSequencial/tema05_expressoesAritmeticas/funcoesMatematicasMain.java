package estruturaSequencial.tema05_expressoesAritmeticas;

public class funcoesMatematicasMain {
    public static void main(String[] args) {

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);

        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println("Raiz quadrada de " + y + " = " + B);
        System.out.println("Raiz quadrada de 25 = " + C);

        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);

        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println(x + " elevado ao quadrado = " + B);
        System.out.println("5 elevado ao quadrado = " + C);

        A = Math.abs(y);
        B = Math.abs(z);

        System.out.println("Valor absoluto de " + y + " = " + A);
        System.out.println("Valor absoluto de " + z + " = " + B);

        //Funções matemáticas em expressões maiores:
        // Fórmula de Bhaskara:

        double a = 1;
        double b = -3;
        double c = 2;
        double delta = Math.pow(b, 2.0) - 4 * a * c;

        double x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2.0 * a);

        System.out.println("Os valores dos coeficientes: \nA = " + a + "\nB = " + b + "\nC = " + c);
        System.out.println("O valor do discriminante: (delta) = b^2 - 4 * " + a + " * " + c + " resulta em " + delta);

        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else {
            System.out.println("As raízes da equação são: " + x1 + " e " + x2);
        }

    }
}
