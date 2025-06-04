package estruturaSequencial.validacaoExercicios;

import java.util.Scanner;

public class ex03Main {
    public static void main(String[] args) {

        //Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

        Scanner sc = new Scanner(System.in);

        int A, B, C, D, produto_AB, produto_CD, dif_produtos;

        System.out.println("Digite o valor A: ");
        A = sc.nextInt();
        System.out.println("Digite o valor B: ");
        B = sc.nextInt();
        System.out.println("Digite o valor C: ");
        C = sc.nextInt();
        System.out.println("Digite o valor D: ");
        D = sc.nextInt();

        produto_AB = A * B;
        produto_CD = C * D;
        dif_produtos = produto_AB - produto_CD;

        System.out.println("A diferença do valor " + produto_AB + " pelo valor " + produto_CD + " resulta em " +  dif_produtos);

        sc.close();
    }
}
