package estruturaSequencial.tema02_casting;

public class castingMain {

    public static void main(String[] args) {

        int x;
        double y;

        x = 5;
        y = 2 * x;

        System.out.println(x);
        System.out.println(y);

        System.out.println("\n====================\n");

        double b, B, h, area;

        b = 6.0; //float: 6f
        B = 8.0; //float: 8f
        h = 5.0; //float: 5f

        area = (b + B) / 2.0 * h; //float: 2.0 => 2f

        System.out.println("Área de um trapézio: " + area);

        System.out.println("\n====================\n");

        int a, c;
        double resultado;

        a = 5;
        c = 2;

        resultado = (double) a / c;

        System.out.println("Aplicação de casting, para converter o tipo dos valores int para double: " + resultado);

        System.out.println("\n====================\n");

        double d;
        int e;

        d = 5.0;
        e = (int) a;

        System.out.println("Aplicação de casting, para converter o tipo do valor double para int: " + e);


    }
}
