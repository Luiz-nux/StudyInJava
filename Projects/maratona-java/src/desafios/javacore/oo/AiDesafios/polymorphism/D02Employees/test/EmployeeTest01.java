package desafios.javacore.oo.AiDesafios.polymorphism.D02Employees.test;

import desafios.javacore.oo.AiDesafios.polymorphism.D02Employees.domain.Employee;
import desafios.javacore.oo.AiDesafios.polymorphism.D02Employees.domain.Positions;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee employee = new Employee("developer", 15000, Positions.DEVELOPER);
        System.out.println(employee.calculateSalary());
    }
}
