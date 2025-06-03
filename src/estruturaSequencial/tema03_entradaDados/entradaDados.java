package estruturaSequencial.tema03_entradaDados;

import java.util.Locale;
import java.util.Scanner;

public class entradaDados {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //Associação do objeto Scanner ao teclado no modo console

        String x; //Declaração de variável tipo String

        System.out.println("Digite uma palavra: ");
        x = sc.next();
        System.out.println("Leitura de uma palavra (texto sem espaço) \nVocê digitou: " + x);

        System.out.println("==================");

        int y; //Declaração de variável tipo int

        System.out.println("Digite um número do tipo inteiro: ");
        y = sc.nextInt();
        System.out.println("Leitura de um número inteiro \nVocê digitou: " + y);

        System.out.println("==================");

        double z; //Declaração de variável tipo double

        System.out.println("Digite um número do tipo double (com ponto flutuante): ");
        Locale.setDefault(Locale.US); //Para considerar o separador de decimais como ponto a seguir com a declaração do Scanner
        z = sc.nextDouble();
        System.out.printf("Leitura de um número com ponto flutuante %nVocê digitou: %.2f%n", z);

        System.out.println("==================");

        char w; //Declaração de variável tipo char

        System.out.println("Digite um caractere do tipo char: ");
        w = sc.next().charAt(0);
        System.out.printf("Leitura de um caracter do tipo char: %s%n", w);

        System.out.println("==================");

        String a;
        int b;
        double c;

        System.out.println("Digite seu nome, idade e altura: ");
        a = sc.next();
        b = sc.nextInt();
        c = sc.nextDouble();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        sc.close(); //Encerra o recurso criado
    }
}
