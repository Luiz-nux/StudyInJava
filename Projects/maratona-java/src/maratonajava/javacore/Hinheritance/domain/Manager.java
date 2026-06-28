package maratonajava.javacore.Hinheritance.domain;

public class Manager extends Employee {
    private String department;

    static {
        System.out.println("inside Manager static init block");
    }

    {
        System.out.println("inside Manager init block 1");
    }

    {
        System.out.println("inside Manager init block 2");
    }

    public Manager(String name) {
        super(name);
        System.out.println("inside Manager constructor block");
    }

    @Override
    public void print(){
        super.print();
        System.out.println(this.department);
        paymentReport();
    }

    public void paymentReport(){
        System.out.println("the Employee " + this.name + " from the department " + this.department + " received a salary of " + this.salary);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}