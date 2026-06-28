package maratonajava.javacore.Hinheritance.test;

import maratonajava.javacore.Hinheritance.domain.Employee;
import maratonajava.javacore.Hinheritance.domain.Manager;

public class InheritanceTest01 {
    public static void main(String[] args) {
        Employee employee = new Employee("toph");
        employee.setName("Toph");
        employee.setSocialSecurityNumber("121212");
        employee.setSalary(15000);

        employee.print();

        System.out.println("-------------");
        Manager manager = new Manager("ang");
        manager.setName("Ang");
        manager.setSocialSecurityNumber("676767");
        manager.setSalary(50000);
        manager.setDepartment("IT");
        manager.print();
    }
}
