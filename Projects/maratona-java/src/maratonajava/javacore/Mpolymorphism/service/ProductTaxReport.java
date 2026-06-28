package maratonajava.javacore.Mpolymorphism.service;

import maratonajava.javacore.Mpolymorphism.doamin.Computer;
import maratonajava.javacore.Mpolymorphism.doamin.Product;
import maratonajava.javacore.Mpolymorphism.doamin.Tomato;

public class ProductTaxReport {

    public static void generateTaxValue(Product product){
        System.out.println("Starting the report for Product");
        double taxValue = product.calculatorTaxValue();
        System.out.println("Product " + product.getName());
        System.out.println("Price " + product.getPrice());
        System.out.println("Tax Value " + taxValue);
        if (product instanceof Tomato) {
            System.out.println(((Tomato) product).getBestConsumedBefore());
        }
    }
}