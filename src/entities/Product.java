package entities;

public class Product {

    //Encapsulamento: Definir o modificador de acesso de atributos para Private
    String name;
    private double price;
    private int quantity;

    //construtor padrão
    public Product() {
    }

    //construtor
    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    //construtor
    public Product(String name, double price){
        this.name = name;
        this.price = price;
        //quantity = 0; //*OPCIONAL
    }

    //Método responsável por obter o atributo (get), implementação padrão deste método é retornar o atributo
    public String getName() {
        return name;
    }

    //Método responsável por alterar o valor do atributo (set), não retorna nada, e recebe o valor do atributo. Atribui o valor recebido para o atributo do objeto.
    public void setName (String name) {
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $"
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }

}
