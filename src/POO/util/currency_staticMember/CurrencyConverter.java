package POO.util.currency_staticMember;

public class CurrencyConverter {

    private static final double IOF = 0.06;

    public static double cotacaoDolar;

    public static double valorDolar;

    public static double valorConversao() {
        return valorDolar * cotacaoDolar;
    }

    public static double valorTotal() {
        return IOF * valorConversao() + valorConversao();
    }

    public static void valorReais() {
        System.out.printf("Valor a ser pago em reais = %.2f", valorTotal());
    }

}
