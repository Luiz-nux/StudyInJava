package desafios.javacore.oo.AiDesafios.tthis.test;

import desafios.javacore.oo.AiDesafios.tthis.domain.Product;

import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product tv = new Product("tv", 1500);
        System.out.println("what is the discount amount for the tv?");
        double percent = scanner.nextDouble();

        if (tv.discount(percent)) {
            System.out.println("new peice tv: " + tv.getPrice());
        }else {
            System.out.println("discount not valid");
        }
    }
}
