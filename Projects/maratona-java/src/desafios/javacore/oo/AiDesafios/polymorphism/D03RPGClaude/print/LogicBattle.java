package print;

import domain.Character;
import domain.SkillsCharacter;

public class LogicBattle {
    public static void simpleBattle(Character characterAttack, Character enemy){
        if (characterAttack instanceof SkillsCharacter skillsCharacter){
            System.out.println(characterAttack.getName() + " used skill");
            enemy.receiveDamage(skillsCharacter.skill());
        }  else {
            System.out.println(characterAttack.getName() + " attack with " + characterAttack.getTypeDamage());
            enemy.receiveDamage(characterAttack.attack());
        }
        System.out.println(enemy.getName() + " receive damage ");
        System.out.println(enemy.getName() + " life: " + enemy.getLife());
    }

    public static void status(Character character){
        System.out.println("Name: " + character.getName());
        System.out.println("Life: " + character.getLife());
        System.out.println("Damage: " + character.getDamage());
        System.out.println("Type: " + character.getTypeDamage());
    }
}
