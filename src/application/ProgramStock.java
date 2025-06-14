package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProgramStock {
    public static void main(String[] args) {

        //Programa que lê os dados de um produto em estoque (nome, preço e quantidade no estoque). Em seguida:
        //- Mostra os dados do produto (nome, preço, quantidade no estoque, valor total no estoque).
        //- Realizar uma entrada no estoque e mostrar novamente os dados do produto.
        //- Realizar uma saída no estoque e mostrar novamente os dados do produto.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");

        System.out.println("Name: ");
        product.name = sc.nextLine();

        System.out.println("Price: ");
        product.price = sc.nextDouble();

        System.out.println("Quantity in Stock: ");
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        sc.close();

    }

}
