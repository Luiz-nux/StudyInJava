package maratonajava.logica.loops;

import java.util.Scanner;

public class MonthlyCarExercise {
    public static void main(String[] args) {
        double monthlyprice = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("whats price car?");
        double priceCar = scanner.nextDouble();

        for (int mounthCount = 1; mounthCount < priceCar; mounthCount++) {
            monthlyprice = priceCar / mounthCount;
            if (monthlyprice < 1000) {
                break;
            }
                System.out.println("mount cont " + mounthCount + " price = $" + monthlyprice);
        }
    }
}
