package estruturaRepetitiva.validacaoExercicios;

import java.util.Scanner;

public class testeMesaMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String valorX = "Digite um número inteiro que represente 'X': ";
        String valorY = "Digite um número inteiro que represente 'Y': ";

        System.out.print(valorX);
        int x = sc.nextInt();

        System.out.print(valorY);
        int y = sc.nextInt();

        while (x < 3) {
            y += 2; // y = y + 2;
            x += 1; //x = x + 1;
            System.out.println(x + "-" + y);
        }

        sc.close();
    }
}
