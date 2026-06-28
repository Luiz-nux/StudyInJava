package desafios.javacore.oo.AiDesafios.polymorphism.D02Employees.domain;

public class Employee{
    private String name;
    private double salary;
    private Positions positions;

    public Employee(String name, double salary, Positions positions) {
        this.name = name;
        this.salary = salary;
        this.positions = positions;
    }

    public double calculateSalary(){
        return this.salary + (this.salary * positions.getBonus());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Positions getPositions() {
        return positions;
    }

    public void setPositions(Positions positions) {
        this.positions = positions;
    }
}
