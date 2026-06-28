package desafios.javacore.oo.AiDesafios.polymorphism.D01RPG.service;

import desafios.javacore.oo.AiDesafios.polymorphism.D01RPG.domain.Archer;
import desafios.javacore.oo.AiDesafios.polymorphism.D01RPG.domain.Character;
import desafios.javacore.oo.AiDesafios.polymorphism.D01RPG.domain.Mage;

public class PrintCharacter {
    public static void print(Character character){
        System.out.println("Name: " + character.getName());
        System.out.println("Level: " + character.getLevel());
        System.out.println("Damage: " + character.getDamage());
        System.out.println("Life: " + character.getLife());
        if (character instanceof Mage){
            System.out.println("MP: " + ((Mage) character).getMp());
        }
        if (character instanceof Archer){
            System.out.println("Critical: " + ((Archer) character).getCriticalMultiplier());
        }
    }
}
