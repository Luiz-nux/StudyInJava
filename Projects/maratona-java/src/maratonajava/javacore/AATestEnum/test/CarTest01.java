package maratonajava.javacore.AATestEnum.test;

import maratonajava.javacore.AATestEnum.domain.Car;
import maratonajava.javacore.AATestEnum.domain.Type;

public class CarTest01 {
    public static void main(String[] args) {
        Type type = Type.typeCar("Ferrari");

        Car car = new Car(2020, type);

        car.yourSurvival();
        car.print();
    }
}
