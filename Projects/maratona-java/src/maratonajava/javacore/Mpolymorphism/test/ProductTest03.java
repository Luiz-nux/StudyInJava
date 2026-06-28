package maratonajava.javacore.Mpolymorphism.test;

import maratonajava.javacore.Mpolymorphism.doamin.Computer;
import maratonajava.javacore.Mpolymorphism.doamin.Product;
import maratonajava.javacore.Mpolymorphism.doamin.Tomato;
import maratonajava.javacore.Mpolymorphism.service.ProductTaxReport;

public class ProductTest03 {
    public static void main(String[] args) {
        Product product = new Computer("Rayzen 9", 1000);

        Tomato tomato = new Tomato("Doutch", 6);
        tomato.setBestConsumedBefore("11/10/2027");

        ProductTaxReport.generateTaxValue(tomato);

        System.out.println("------------------------------");

        ProductTaxReport.generateTaxValue(product);
    }
}
