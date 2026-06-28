package maratonajava.javacore.Gassociation.testandoo.domain;

public class Student {
    private String name;
    private int age;
    private Team team;


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public void print(){
        System.out.println("----------------------------");
        System.out.println(this.name);
        System.out.println(this.age);
        if (this.team != null) {
            System.out.println(this.team.getName());
        }
    }
}
