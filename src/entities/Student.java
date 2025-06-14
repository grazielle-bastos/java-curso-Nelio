package entities;

public class Student {

    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;
    public double soma;

    public double soma() {
        soma = nota1 + nota2 + nota3;
        return soma;
    }

    public void verificarAprovacao() {
        if (soma >= 60) {
            System.out.println("Aprovado(a)");
        } else {
            System.out.println("Reprovado(a)");
            double pontosAprovacao = 60 - soma;
            System.out.printf("Faltando %.2f points", pontosAprovacao);
        }
    }

}
