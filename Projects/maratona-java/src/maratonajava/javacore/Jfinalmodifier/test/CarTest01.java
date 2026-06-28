package maratonajava.javacore.Jfinalmodifier.test;

import maratonajava.javacore.Jfinalmodifier.domain.Car;
import maratonajava.javacore.Jfinalmodifier.domain.Ferrari;

public class CarTest01 {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(Car.SPEED_LIMIT);
        car.BUYER.setName("Luiz");
        System.out.println(car.BUYER);
        Ferrari ferrari = new Ferrari();
        ferrari.setName("Enzo");
        ferrari.print();
    }
}