package maratonajava.javacore.Jfinalmodifier.test;

import maratonajava.javacore.Jfinalmodifier.domain.Car;

public class BuyerTest01 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car();
        car.BUYER.setName("luiz");
        System.out.println(car.BUYER.getName() + " " + car2.BUYER.getName());
    }
}
