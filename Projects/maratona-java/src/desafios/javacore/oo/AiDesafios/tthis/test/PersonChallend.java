package desafios.javacore.oo.AiDesafios.tthis.test;

import desafios.javacore.oo.AiDesafios.tthis.domain.PersonToPresent;

public class PersonChallend {
    public static void main(String[] args) {
        PersonToPresent person = new PersonToPresent();
        person.name = "Davi";
        person.age = 19;

        person.toPresent();
    }
}
