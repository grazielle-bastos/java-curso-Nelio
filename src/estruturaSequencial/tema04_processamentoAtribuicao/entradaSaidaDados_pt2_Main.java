package estruturaSequencial.tema04_processamentoAtribuicao;

import java.util.Scanner;

public class entradaSaidaDados_pt2_Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x;
        String s1, s2, s3;

        System.out.print("Digite a sua idade: ");
        x = sc.nextInt(); //Neste método, por não ser o nextLine, a quebra de linha consome a próxima, a variável s1 ficaria vazia se não houvesse o processamento do próximo nextLine, para suprir a necessidade de quebra de linha na entrada padrão.
        sc.nextLine(); // Limpa o buffer de leitura, consumindo a quebra de linha que fica pendente.

        System.out.print("Digite o seu apelido: ");
        s1 = sc.nextLine(); //O método nextLine lê o texto, até a quebra de linha.

        System.out.print("Digite o seu nome: ");
        s2 = sc.nextLine();

        System.out.print("Digite o seu sobrenome: ");
        s3 = sc.nextLine();

        sc.close();
    }
}
