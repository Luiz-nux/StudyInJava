package maratonajava.desafio.objectOrientation.employeesSystem.test;

import maratonajava.desafio.objectOrientation.employeesSystem.domain.Developer;
import maratonajava.desafio.objectOrientation.employeesSystem.domain.Employee1;
import maratonajava.desafio.objectOrientation.employeesSystem.domain.Manager;

public class DeveloperTest01 {
    public static void main(String[] args) {
        Employee1 employee = new Employee1("Luiz", 18, 1000);
        Manager manager = new Manager("Luiz", 21, 3600, "TI");
        Developer developer = new Developer("Luiz", 24, 10000, "TI", "Java");

        employee.print();
        System.out.println("---------------");
        manager.print();
        System.out.println("---------------");
        developer.print();
    }
}