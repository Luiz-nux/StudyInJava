package maratonajava.javacore.Bintroductionmethods.aExercise.domain;

public class Employee {
    private String name;
    private int age;
    private double[] salaries;
    private double avg;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double[] getSalaries() {
        return salaries;
    }

    public double getAvg(){
        return avg;
    }

    public Employee (String name, int age, double[] salary){
        this.name = name;
        this.age = age;
        this.salaries = salary;
    }

    public void dataThisEmployee() {
        System.out.println("name = " + this.name);
        System.out.println("age = " + this.age);
        if (salaries == null) {
            return;
        }
            for (int i = 0; i < salaries.length; i++) {
                System.out.println("salary " + (i + 1) + " = " + salaries[i]);
            }
            average();
    }

    public void average(){
        if (salaries == null){
            return;
        }

            for (double num : this.salaries) {
                avg += num;
            }
            avg /= this.salaries.length;
            System.out.println("Average salary = " + avg);
        }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalaries(double[] salaries) {
        this.salaries = salaries;
    }

}
