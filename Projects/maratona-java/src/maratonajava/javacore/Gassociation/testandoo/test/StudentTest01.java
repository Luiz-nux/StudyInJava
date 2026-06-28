package maratonajava.javacore.Gassociation.testandoo.test;

import maratonajava.javacore.Gassociation.testandoo.domain.Student;
import maratonajava.javacore.Gassociation.testandoo.domain.Team;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student01 = new Student("Luiz", 15);
        Student student02 = new Student("Everton", 16);
        Student student03 = new Student("Fabricio", 15);
        Student student04 = new Student("Julia", 14);
        Student student05 = new Student("Laura", 15);

        Team team1 = new Team("Team A");

        Student[] students = new Student[]{student01, student02, student03, student04, student05};

        for (Student student: students){
            student.setTeam(team1);
            student.print();
        }
    }
}
