package maratonajava.javacore.Gassociation.AExercise.test;

import maratonajava.javacore.Gassociation.AExercise.domain.Place;
import maratonajava.javacore.Gassociation.AExercise.domain.Professor;
import maratonajava.javacore.Gassociation.AExercise.domain.Seminars;
import maratonajava.javacore.Gassociation.AExercise.domain.Studenty;

public class SeminarsTest01 {
    public static void main(String[] args) {
        Place place = new Place("gymnasium");
        Seminars seminars = new Seminars("racism", place);
        Studenty studenty01 = new Studenty("Luiz", 18);
        Studenty studenty02 = new Studenty("Louis", 18);
        Professor professor = new Professor("Lucas", "Astronomy");

        studenty01.setSeminars(seminars);
        studenty02.setSeminars(seminars);

        Studenty[] students = {studenty01, studenty02};
        Seminars[] seminars1 = {seminars};
        seminars.setStudents(students);
        professor.setSeminars(seminars1);

        professor.print();

    }
}