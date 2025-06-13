package entities;

public class Triangle {

    //Classe é a definição do tipo estruturado que pode conter (membros), tais como, Atributos (dados/campo), Métodos (funções/operações)
    //Objetos são instancias da classe
    //Atributos são as características (dados/campo) da classe.

    //Declarar os atributos dentro da classe Triangle
    public double a;
    public double b;
    public double c;

    public double area() { //modificador de acesso + tipo do dado que o método retorna, usa-se void para quando não retornar nada + nome do método + (Lista de parâmetros do método);
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c)); //Corpo do método
        //double result = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        //return result;
    }

}
