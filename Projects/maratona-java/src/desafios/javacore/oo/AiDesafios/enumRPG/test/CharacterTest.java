package desafios.javacore.oo.AiDesafios.enumRPG.test;

import desafios.javacore.oo.AiDesafios.enumRPG.domain.Character;
import desafios.javacore.oo.AiDesafios.enumRPG.domain.CharacterClass;

import java.util.Scanner;

public class CharacterTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what your wanna choose name?");
        String name = scanner.nextLine();

        CharacterClass classChoose = CharacterClass.WARRIOR;
        boolean choose = true;
        while (choose){

            for (CharacterClass c: CharacterClass.values()){
                System.out.println(c.ordinal() + 1 + " - " + c.name());
            }
            byte chooseClass = scanner.nextByte();
            switch (chooseClass){
                case 1:
                    classChoose = CharacterClass.WARRIOR;
                    choose = false;
                    break;
                case 2:
                    classChoose = CharacterClass.MAGE;
                    choose = false;
                    break;
                case 3:
                    classChoose = CharacterClass.ARCHER;
                    choose = false;
                    break;
                case 4:
                    classChoose = CharacterClass.HEALER;
                    choose = false;
                    break;
                default:
                    System.out.println("Invalid option");
                    break;

            }
        }

        Character character = new Character(name, classChoose);
        character.getCharacterClass().showInfo();
    }
}
