package maratonajava.javacore.Labstractclasses.test;

import maratonajava.javacore.Labstractclasses.domain.Developer;
import maratonajava.javacore.Labstractclasses.domain.Employee;
import maratonajava.javacore.Labstractclasses.domain.Manager;

public class EmployeeTest {
    public static void main(String[] args) {
        Manager manager = new Manager("Nami", 5000);
        Developer developer = new Developer("Zoro", 12000);
        System.out.println(manager);
        System.out.println(developer);
        manager.print();
        developer.print();
    }
}
