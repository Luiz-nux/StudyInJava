package maratonajava.javacore.Mpolymorphism.test;

import maratonajava.javacore.Mpolymorphism.doamin.Computer;
import maratonajava.javacore.Mpolymorphism.doamin.Television;
import maratonajava.javacore.Mpolymorphism.doamin.Tomato;
import maratonajava.javacore.Mpolymorphism.service.ProductTaxReport;

public class ProductTest01 {
    public static void main(String[] args) {
        Computer computer = new Computer("NUC10i7", 1000);
        Tomato tomato = new Tomato("Italian", 5);
        Television television = new Television("Samsung 50\"", 1000);

        ProductTaxReport.generateTaxValue(computer);
        System.out.println("-------------------------");
        ProductTaxReport.generateTaxValue(tomato);
        System.out.println("-------------------------");
        ProductTaxReport.generateTaxValue(television);
    }
}
