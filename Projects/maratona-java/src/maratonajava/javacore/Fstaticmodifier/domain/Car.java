package maratonajava.javacore.Fstaticmodifier.domain;

public class Car {
    private String name;
    private double maxSpeed;
    private static double speedLimit = 280;

    public Car(double maxSpeed, String name) {
        this.maxSpeed = maxSpeed;
        this.name = name;
    }

    public void print(){
        System.out.println("--------------------------");
        System.out.println("name: " + this.name);
        System.out.println("Max speed: " + this.maxSpeed);
        System.out.println("Speed limit: " + Car.speedLimit);
    }

    public static void setSpeedLimit(double speedLimit){
        Car.speedLimit = speedLimit;
    }

    public static double getSpeedLimit(){
        return Car.speedLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }



}
