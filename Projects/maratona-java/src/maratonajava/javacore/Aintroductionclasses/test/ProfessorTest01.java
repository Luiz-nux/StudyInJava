package maratonajava.javacore.Aintroductionclasses.test;

import maratonajava.javacore.Aintroductionclasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.name = "chico";
        professor.age = 500;
        professor.gender = 'M';
        System.out.println("name: " +professor.name +", age: " + professor.age +", gender: " + professor.gender);
    }
}
