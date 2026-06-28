package maratonajava.javacore.Bintroductionmethods.test;

import maratonajava.javacore.Bintroductionmethods.domain.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();

        student01.name = "Hinata";
        student01.gender = 'F';
        student01.age = 22;

        student02.name = "Bakugo";
        student02.gender = 'M';
        student02.age = 16;

        student01.print();
        student02.print();
    }
}
