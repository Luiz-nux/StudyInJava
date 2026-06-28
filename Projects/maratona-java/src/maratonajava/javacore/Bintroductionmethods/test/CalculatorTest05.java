package maratonajava.javacore.Bintroductionmethods.test;

import maratonajava.javacore.Bintroductionmethods.domain.Calculator;

public class CalculatorTest05 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int[] num = {1,2,3,4,5};
        calculator.sumArray(num);
        System.out.println("------------------------");
        calculator.sumVaArgs(num);
        System.out.println("------------------------------");
        calculator.sumVaArgs(1,2,3,4,5);
    }
}
