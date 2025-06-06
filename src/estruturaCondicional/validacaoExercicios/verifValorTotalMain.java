package estruturaCondicional.validacaoExercicios;

import java.util.Scanner;

public class verifValorTotalMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o código do produto (de 1 a 5): ");
        int cod = sc.nextInt();

        System.out.println("Digite a quantidade deste produto: ");
        int qtd = sc.nextInt();

        sc.close();

        String especificacao = "";
        double preco = 0;

        switch (cod) {
            case 1:
                especificacao = "Cachorro Quente";
                preco = 4.00;
                break;
            case 2:
                especificacao = "X-Salada";
                preco = 4.50;
                break;
            case 3:
                especificacao = "X-Bacon";
                preco = 5.00;
                break;
            case 4:
                especificacao = "Torrada simples";
                preco = 2.00;
                break;
            case 5:
                especificacao = "Refrigerante";
                preco = 1.50;
                break;
        }

        double total = qtd * preco;

        System.out.printf("Total do produto %s: %.2f", especificacao, total);

    }
}
