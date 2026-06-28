package maratonajava.javacore.Aintroductionclasses.test;

import maratonajava.javacore.Aintroductionclasses.domain.Car;

public class CarExercise01 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.name = "Chevrolet";
        car1.model = "Onix";
        car1.year = 2005;

        car2.name = "Fiat";
        car2.model = "Mobi";
        car2.year = 2003;

        car2 = car1;

        System.out.println("Car 1: " + car1.name + " (" + car1.model + ") " + car1.year);
        System.out.println("Car 2: " + car2.name + " (" + car2.model + ") " + car2.year);
    }
}
