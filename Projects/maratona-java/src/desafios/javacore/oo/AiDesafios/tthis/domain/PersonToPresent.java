package desafios.javacore.oo.AiDesafios.tthis.domain;

public class PersonToPresent {
    public String name;
    public int age;

    public void toPresent() {
        System.out.println("hi my names is " + this.name+ ", i am "+ this.age + " age");
    }
}
