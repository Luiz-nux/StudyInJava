package maratonajava.javacore.Mpolymorphism.doamin;

public class Tomato extends Product{
    public static final double TAX_VALUE = 0.06;
    private String bestConsumedBefore;
    public Tomato(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculatorTaxValue() {
        System.out.println("calculator tax value for tomato");
        return this.price * TAX_VALUE;
    }

    public String getBestConsumedBefore() {
        return bestConsumedBefore;
    }

    public void setBestConsumedBefore(String bestConsumedBefore) {
        this.bestConsumedBefore = bestConsumedBefore;
    }
}
