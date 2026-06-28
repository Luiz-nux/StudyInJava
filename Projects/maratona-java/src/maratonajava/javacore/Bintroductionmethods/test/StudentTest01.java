package maratonajava.javacore.Bintroductionmethods.test;

import maratonajava.javacore.Bintroductionmethods.domain.Student;
import maratonajava.javacore.Bintroductionmethods.domain.StudentPrinter;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();

        student01.name = "Hinata";
        student01.gender = 'F';
        student01.age = 22;

        student02.name = "Bakugo";
        student02.gender = 'M';
        student02.age = 16;

        StudentPrinter printer = new StudentPrinter();

        printer.print(student01);
        printer.print(student02);
        System.out.println("######################");
        printer.print(student01);
        printer.print(student02);

    }
}