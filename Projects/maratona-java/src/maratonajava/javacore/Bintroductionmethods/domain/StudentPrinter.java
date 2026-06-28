package maratonajava.javacore.Bintroductionmethods.domain;

public class StudentPrinter {
    public void print(Student student){
        System.out.println("-----------------------");

        System.out.println("Name: " + student.name);
        System.out.println("Gender: " + student.gender);
        System.out.println("Age:" + student.age);

        student.name = "Gohan";
    }
}
