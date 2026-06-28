package maratonajava.javacore.Gassociation.AExercise.domain;

public class Studenty {
    private String name;
    private int age;
    private Seminars seminars;

    public Studenty(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Studenty(String name, int age, Seminars seminars){
        this(name, age);
        this.seminars = seminars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Seminars getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminars seminars) {
        this.seminars = seminars;
    }
}
