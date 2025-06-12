package TopicosBasicos;

public class OperacaoSplitMain {
    public static void main(String[] args) {

        //Split recebe um separador entre parênteses e gera um vetor com as partes do String, recortadas conforme o separador declarado na função de vetor de String.
        //Vetor é uma estrutura indexada, que possui os elementos.

        String s = "potato apple lemon";

        String[] vect = s.split(" ");

        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
    }
}
