package desafios.javacore.oo.AiDesafios.polymorphism.D01RPG.test;

import desafios.javacore.oo.AiDesafios.polymorphism.D01RPG.domain.Archer;
import desafios.javacore.oo.AiDesafios.polymorphism.D01RPG.domain.Character;
import desafios.javacore.oo.AiDesafios.polymorphism.D01RPG.domain.Mage;
import desafios.javacore.oo.AiDesafios.polymorphism.D01RPG.domain.Warrior;

public class CharacterTest01 {
    public static void main(String[] args) {
        Warrior c1 = new Warrior("Arthur", 30);
        Mage c2 = new Mage("Merlin", 50);
        Archer c3 = new Archer("Legolas", 20);

        Character[] characters = {c1, c2, c3};

    }
}
