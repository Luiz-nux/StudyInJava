package maratonajava.javacore.Gassociation.AExercise.domain;

public class Seminars {
    private String title;
    private Studenty[] students;
    private Place place;

    public Seminars(String title, Place place) {
        this.title = title;
        this.place = place;
    }

    public Seminars(String title, Place place,Studenty[] students) {
        this(title, place);
        this.students = students;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Studenty[] getStudents() {
        return students;
    }

    public void setStudents(Studenty[] students) {
        this.students = students;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }
}
