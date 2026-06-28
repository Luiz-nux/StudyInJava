package maratonajava.javacore.Mpolymorphism.test;

import maratonajava.javacore.Mpolymorphism.doamin.Computer;
import maratonajava.javacore.Mpolymorphism.doamin.Product;
import maratonajava.javacore.Mpolymorphism.doamin.Tomato;

public class ProductTest02 {
    public static void main(String[] args) {
        Product product = new Computer("Rayzen 9", 1000);
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(product.calculatorTaxValue());

        System.out.println("---------------------------");

        Product product2 = new Tomato("Doutch", 6);
        System.out.println(product2.getName());
        System.out.println(product2.getPrice());
        System.out.println(product2.calculatorTaxValue());
    }
}