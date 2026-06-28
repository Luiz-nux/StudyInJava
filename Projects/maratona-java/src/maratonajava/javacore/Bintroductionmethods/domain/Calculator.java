package maratonajava.javacore.Bintroductionmethods.domain;

public class Calculator {
    public void sumTwoNumbers () {
        System.out.println(10 + 10);
    }

    public void subtractNumber(){
        System.out.println(15 - 3);
    }

    public void multiplyTwoNumbers(int num1, int num2){
        System.out.println(num1 * num2);
    }

    public double divideTwoNumbers(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
            return num1 / num2;

    }

    public void printTwoNumbersDivide(double num1, double num2) {
        if (num2 == 0){
            System.out.println("can't divide by 0");
            return;
        }
        System.out.println(num1/num2);
    }

    public void changeTwoNumber(int num1,int num2){
        num1 = 99;
        num2 = 34;
        System.out.println("inside changeTwoNumbers");
        System.out.println("num1 "+ num1);
        System.out.println("num2 "+ num2);
    }

    public void sumArray(int[] numbers){
        int sum = 0;
        for(int num: numbers){
            sum += num;
        }
        System.out.println(sum);
    }

    public void sumVaArgs(int... numbers){
        int sum = 0;
        for(int num: numbers){
            sum += num;
        }
        System.out.println(sum);
    }

}
