package estruturaCondicional;

public class tema05_EscopoInicializacaoMain {

    public static void main(String[] args) {

        double price = 400.00;

        double discount; //Alternativa: Inicializar o discount fora do escopo da estrutura condicional. Ou atribuir no else, como exemplificado a seguir.

        if (price < 200.00) {
            discount = price * 0.1;
        } else {
            discount = 0;
        }

        System.out.println(discount);


    }
}
