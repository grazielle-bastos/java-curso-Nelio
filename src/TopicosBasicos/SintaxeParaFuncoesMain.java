package TopicosBasicos;

import java.util.Scanner;

public class SintaxeParaFuncoesMain {
    public static void main(String[] args) {

        //Função é um procedimento que tem um significado, pode receber um dado como argumento/parâmetro, e também pode retornar ou não uma resposta.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a, b, c);

        showResult(higher);

        sc.close();
    }

    public static int max(int x, int y, int z) {
        int aux;
        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }

    public static void showResult(int value) {        //void, pois a função não retorna uma resposta, apenas imprime em tela.
        System.out.println("Higher: " + value);
    }
}
