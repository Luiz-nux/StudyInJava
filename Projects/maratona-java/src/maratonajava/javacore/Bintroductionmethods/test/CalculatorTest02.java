package maratonajava.javacore.Bintroductionmethods.test;

import maratonajava.javacore.Bintroductionmethods.domain.Calculator;

import java.util.Scanner;

public class CalculatorTest02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Choose first numbers to multiply:");
        int one = scanner.nextInt();
        System.out.println("Choose second numbers to multiply:");
        int two = scanner.nextInt();

        calculator.multiplyTwoNumbers( one, two);
    }
}
