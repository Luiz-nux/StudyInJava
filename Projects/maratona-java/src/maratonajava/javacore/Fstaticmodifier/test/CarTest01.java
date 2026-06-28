package maratonajava.javacore.Fstaticmodifier.test;

import maratonajava.javacore.Fstaticmodifier.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car01 = new Car(270, "BMW");
        Car car02 = new Car(290, "BMW");
        Car car03 = new Car(300, "BMW");

        car01.print();

        System.out.println(Car.getSpeedLimit());
        Car.setSpeedLimit(250);
        System.out.println(Car.getSpeedLimit());

        car01.print();
        car02.print();
        car03.print();

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}