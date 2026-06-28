package maratonajava.javacore.Aintroductionclasses.test;

import maratonajava.javacore.Aintroductionclasses.domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student = new Student();
        Student people = new Student();
        student.age = 31;
        student.name = "louis";
        student.gender = 'M';
        people.name = "what";
        people.age = 21;
        people.gender = 'M';
        System.out.println(student.age);
        System.out.println(student.name);
        System.out.println(student.gender);
        System.out.println(people.age);
        System.out.println(people.name);
        System.out.println(people.gender);
    }
}
