package maratonajava.javacore.Kenum.test;

import maratonajava.javacore.Kenum.domain.Customer;
import maratonajava.javacore.Kenum.domain.CustomerType;
import maratonajava.javacore.Kenum.domain.PaymentType;

public class CustomerTest01 {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Luiz", CustomerType.INDIVIDUAL, PaymentType.DEBIT);
        Customer customer2 = new Customer("Luiz", CustomerType.COMPANY, PaymentType.CREDIT);

        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(PaymentType.DEBIT.calculatorDiscount(100));
        System.out.println(PaymentType.CREDIT.calculatorDiscount(100));
        CustomerType customerType = CustomerType.valueOf("INDIVIDUAL");
        System.out.println(customerType);
        CustomerType customerType2 = CustomerType.getByReportValue("Individual");
        System.out.println(customerType2);
    }
}