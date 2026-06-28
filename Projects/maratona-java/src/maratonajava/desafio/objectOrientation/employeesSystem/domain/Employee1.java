package maratonajava.desafio.objectOrientation.employeesSystem.domain;

public class Employee1 {
    protected String name;
    protected int age;
    protected double salary;

    public Employee1(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void print(){
        System.out.println("Name: " + this.name);
        System.out.println("age: " + this.age);
        System.out.println("Salary: " + this.salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
