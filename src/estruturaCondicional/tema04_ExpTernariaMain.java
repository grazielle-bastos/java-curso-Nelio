package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class tema04_ExpTernariaMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Locale.setDefault(new Locale("pt", "BR"));
        System.out.print("Digite o preço do produto: ");
        double preco = sc.nextDouble();

        sc.close();

        double TotalDesconto = (preco < 20) ? preco * 0.1 : preco * 0.05;

        System.out.printf("Total do desconto: %.2f", TotalDesconto);
    }
}
