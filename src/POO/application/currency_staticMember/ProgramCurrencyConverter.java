package POO.application.currency_staticMember;

import POO.util.currency_staticMember.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class ProgramCurrencyConverter {
    public static void main(String[] args) {

        //Programa que lê a cotação do dólar, em seguida um valor em dólares a ser comprado por uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda que a pessoa terá que pagar 6% de IOF sobre o valor em dólar.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é o valor do dólar? ");
        CurrencyConverter.cotacaoDolar = sc.nextDouble();

        System.out.println("Quantos dólares serão comprados? ");
        CurrencyConverter.valorDolar = sc.nextDouble();

        CurrencyConverter.valorReais();

        sc.close();

    }
}
