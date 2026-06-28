package desafios.javacore.oo.AiDesafios.tthis.domain;

public class Product {
    private String name;
    private double price;

    public Product (String name, double price){
    this.name = name;
    this.price = price;
    }

    public boolean discount(double percentage){
        if (percentage <0 || percentage > 100) return false;

        double discount = this.price*(percentage/100);
        double newPrice = this.price - discount;

        if (newPrice < 0) return false;

        this.price = newPrice;

        return true;
    }
    public double getPrice(){
        return price;
    }
}