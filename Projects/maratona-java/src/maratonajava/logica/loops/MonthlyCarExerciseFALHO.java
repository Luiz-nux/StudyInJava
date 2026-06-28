package maratonajava.logica.loops;

import java.util.Scanner;

public class MonthlyCarExerciseFALHO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double carPrice;
        double valueinstallments = 0;
        boolean valueAbove1000 = false;
        System.out.println("which is car price");
        carPrice = scanner.nextDouble();
        while (!valueAbove1000) {
            System.out.println("what will be be the total value of your installments");
            valueinstallments = scanner.nextDouble();
            if (valueinstallments < 1000) {
                System.out.println("value above 1000");
            } else {
                valueAbove1000 = true;
            }
        }
        double installments = carPrice/ valueinstallments;
        System.out.println("tota installments = "+installments);
    }
}
