package estruturaRepetitiva;

import java.util.Scanner;

public class tema01_EnquantoMain {
    public static void main(String[] args) {
        //Regra: Condição sendo verdadeira, executa e volta. E condição sendo falsa, pula fora do escopo condicional.

        //While é usado quando não se sabe previamente a quantidade necessária de repetições.

        Scanner sc = new Scanner(System.in);

        String instrucao = "Digite um número inteiro: ";
        System.out.print(instrucao);

        int x = sc.nextInt();

        int soma = 0;

        while (x != 0) {
            System.out.print(instrucao);
            soma += x; //soma = soma + x;
            x = sc.nextInt();
        }

        System.out.println("Total: " + soma);

        sc.close();

    }
}
