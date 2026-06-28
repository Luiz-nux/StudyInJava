package maratonajava.javacore.Bintroductionmethods.domain;

public class Person {
    private String name;
    private int age;


    public void print(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public void setName(String x){
        this.name = x;
    }

    public void setAge(int x){
        if (x < 0) {
            System.out.println("invalid age");
            return;
        }
        this.age = x;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
}