package maratonajava.javacore.Bintroductionmethods.test;

import maratonajava.javacore.Bintroductionmethods.domain.Person;

public class PersonTest01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Luiz");
        person.setAge(-23);
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}