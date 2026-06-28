package maratonajava.javacore.Mpolymorphism.doamin;

public class Computer extends Product{
    public static final double TAX_PERCENTAGE = 0.21;
    public Computer(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculatorTaxValue() {
        System.out.println("calculator tax value for computer");
        return this.price * TAX_PERCENTAGE;
    }
}
