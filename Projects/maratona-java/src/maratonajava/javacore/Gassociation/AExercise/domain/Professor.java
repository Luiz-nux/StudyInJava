package maratonajava.javacore.Gassociation.AExercise.domain;

public class Professor {
    private String name;
    private String researchField;
    private Seminars[] seminars;

    public Professor(String name, String researchField) {
        this.name = name;
        this.researchField = researchField;
    }
    public Professor(String name, String researchField, Seminars[] seminars){
        this(name, researchField);
        this.seminars = seminars;
    }

    public void print(){
        System.out.println("------------");
        System.out.println("Professor: " + this.name);
        if (this.seminars == null) return;
        System.out.println("Seminars: ");
        for (Seminars seminar: seminars){
            System.out.println(seminar.getTitle());
            System.out.println(seminar.getPlace().getAddress());
            if (seminar.getStudents() == null || seminar.getStudents().length == 0) continue;
            System.out.println("** Students **");
            for (Studenty studenty: seminar.getStudents()){
                System.out.println(studenty.getName());
                System.out.println(studenty.getAge());
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResearchField() {
        return researchField;
    }

    public void setResearchField(String researchField) {
        this.researchField = researchField;
    }

    public Seminars[] getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminars[] seminars) {
        this.seminars = seminars;
    }
}
