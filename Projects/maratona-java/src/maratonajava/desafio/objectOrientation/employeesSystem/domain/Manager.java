package maratonajava.desafio.objectOrientation.employeesSystem.domain;

public class Manager extends Employee1 {
    protected String department;

    public Manager(String name, int age, double salary, String department){
        super(name, age, salary);
        this.department = department;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("Department: " + this.department);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
