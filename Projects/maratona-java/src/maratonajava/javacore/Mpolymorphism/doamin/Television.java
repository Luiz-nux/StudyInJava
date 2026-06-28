package maratonajava.javacore.Mpolymorphism.doamin;

public class Television extends Product{
    public static final double TAX_PERCENTAGE = 0.21;
    public Television(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculatorTaxValue() {
        System.out.println("calculator tax value for television");
        return this.price * TAX_PERCENTAGE;
    }
}
