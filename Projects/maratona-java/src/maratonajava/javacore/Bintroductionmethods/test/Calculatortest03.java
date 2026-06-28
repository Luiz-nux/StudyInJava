package maratonajava.javacore.Bintroductionmethods.test;

import maratonajava.javacore.Bintroductionmethods.domain.Calculator;

public class Calculatortest03 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double result = calculator.divideTwoNumbers(20, 2);
        System.out.println(result);
        System.out.println(calculator.divideTwoNumbers(20,0));
        System.out.println("----------------------------");
        calculator.printTwoNumbersDivide(20,0);

    }
}
