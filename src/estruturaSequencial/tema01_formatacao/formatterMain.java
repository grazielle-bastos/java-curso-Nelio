package estruturaSequencial.tema01_formatacao;

import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class formatterMain {
    public static void main(String[] args) {

        double x = 10.35784;
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f\n", x);
        Locale.setDefault(Locale.US); //configurar a localidade do programa
        System.out.printf("%.4f%n", x);
        System.out.println("RESULTADO = " + x + " METROS");
        System.out.printf("RESULTADO = %.2f metros%n", x);
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n%n", nome, idade, renda); //marcadores de variáveis: %d %f %s %n

        //Exercício de Fixação:

        String product1 = "Computer";
        String product2 = "Office desk";

        double price1 = 2100.0;
        double price2 = 650.50;

        Locale.setDefault(new Locale("pt", "BR"));
        System.out.printf("Products: %n%s, which price is R$ %.2f %n%s, which price is R$ %.2f %n%n", product1, price1, product2, price2);

        int age = 30;
        int code = 5290;
        char gender = 'F';

        System.out.printf("Record: %d years old, code %d and gender: %s%n%n", age, code, gender);

        double measure = 53.234567;
        Locale.setDefault(new Locale("pt", "BR"));
        System.out.printf("Measue with eight decimal places: %.8f %nRouded (three decimal places): %.3f %n", measure, measure);

        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f", measure);
    }
}