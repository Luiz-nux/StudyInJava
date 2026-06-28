package Logica.arrays;

import java.util.Scanner;

public class MenorAoMaior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("escolha o numero "+(i+1)+":");
            numbers[i] = scanner.nextDouble();
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                 double temp = numbers[i];
                 numbers[i] = numbers[j];
                 numbers[j] = temp;
        }
        
    }
}
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}

}
}
