package maratonajava.javacore.AATestEnum.domain;

public class Car {
    public int age;
    public Type typeCar;

    public Car(int age, Type typeCar){
        this.age = age;
        this.typeCar = typeCar;
    }

    public void yourSurvival(){
        if (typeCar.speed > 250){
            System.out.println("bro is vary fast");
            return;
        }
        System.out.println("this is car good");
    }

    public void print(){
        System.out.println(age);
        System.out.println(typeCar.style);
        System.out.println(typeCar.speed);
    }
}
