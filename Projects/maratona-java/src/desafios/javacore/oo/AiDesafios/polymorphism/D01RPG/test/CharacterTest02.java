package desafios.javacore.oo.AiDesafios.polymorphism.D01RPG.test;

import desafios.javacore.oo.AiDesafios.polymorphism.D01RPG.domain.Archer;
import desafios.javacore.oo.AiDesafios.polymorphism.D01RPG.domain.Character;
import desafios.javacore.oo.AiDesafios.polymorphism.D01RPG.domain.Mage;
import desafios.javacore.oo.AiDesafios.polymorphism.D01RPG.domain.Warrior;
import desafios.javacore.oo.AiDesafios.polymorphism.D01RPG.service.PrintCharacter;

public class CharacterTest02 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Arthur", 4, 10, 200);
        Archer archer = new Archer("Legolas", 3, 8, 150, 6);
        Mage mage = new Mage("Merlin", 5, 10, 180, 100);

        Character[] characters = {warrior, archer, mage};

       for (Character c: characters){
           PrintCharacter.print(c);
           System.out.println("-----------------------");
       }
    }
}
