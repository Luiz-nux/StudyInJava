package maratonajava.javacore.Bintroductionmethods.aExercise.test;

import maratonajava.javacore.Bintroductionmethods.aExercise.domain.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        double[] salary = {3500, 2875, 3412};
        Employee employee = new Employee("Luiz", 34, salary);
        employee.dataThisEmployee();
        employee.average();
        employee.setSalaries(new double[] {1000, 2000, 3000});
        employee.getSalaries();
    }
}
