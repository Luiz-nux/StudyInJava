package maratonajava.javacore.Kenum.domain;

public enum PaymentType {
        DEBIT{
            @Override
            public double calculatorDiscount(double value){
                return value * 0.1;
            }
        },
    CREDIT{
            @Override
        public double calculatorDiscount(double value){
            return value * 0.05;
        }
    };

    public abstract double calculatorDiscount(double value);
}
