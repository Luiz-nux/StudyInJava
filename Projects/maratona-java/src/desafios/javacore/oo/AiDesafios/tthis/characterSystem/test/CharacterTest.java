package desafios.javacore.oo.AiDesafios.tthis.characterSystem.test;

import desafios.javacore.oo.AiDesafios.tthis.characterSystem.domain.Character;

import java.util.Scanner;

public class CharacterTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Character character = new Character("lord", 100, 5, 1, 100);
        Character dino = new Character("Raptor", 500, 10, 1, 250);
        double characterLife = character.getLife();
        System.out.println("1- Start Game");
        int choose = scanner.nextInt();
        boolean game = character.startGame(choose);
        while (game) {
            System.out.println("1- view to character");
            System.out.println("2- explore");
            System.out.println("3- heal");
            System.out.println("4- exit");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    character.viewCharacter();
                    System.out.println("-----------------");
                    break;

                case 2:
                    System.out.println("you view a raptor, whats your choose?");
                    System.out.println("1- fight");
                    System.out.println("2- run");
                    choose = scanner.nextInt();
                    switch (choose) {
                        case 1:
                            boolean inFight = true;
                            boolean deadDino;
                            boolean deadCharacter;

                            while (inFight) {
                                dino.viewCharacter();

                                System.out.println("----------");
                                System.out.println("you attack raptor");
                                character.attack(dino);
                                deadDino = dino.deadOrNo();
                                if (deadDino){
                                    System.out.println("you victory");
                                    inFight = false;
                                    break;
                                }

                                System.out.println("raptor attack you");
                                character.receiveDmg(dino);
                                deadCharacter = character.deadOrNo();
                                if (deadCharacter){
                                    System.out.println("you lose");
                                    inFight = false;
                                    break;
                                }

                                System.out.println("------------------------");

                                System.out.println("1- attack");
                                System.out.println("2- run");
                                choose = scanner.nextInt();
                                switch (choose) {
                                    case 1:
                                        break;
                                    case 2:
                                        System.out.println("you run");
                                        inFight = false;
                                        break;
                                    default:
                                        System.out.println("invalid option");
                                        break;
                                }

                            }
                            break;

                        case 2:
                            System.out.println("you run");
                            break;
                        default:
                            System.out.println("invalid option");
                            break;
                    }
                    break;
                case 3:
                    character.heal(characterLife);
                    break;
                case 4:
                    System.out.println("bey...");
                    game = false;
                    break;
                default:
                    System.out.println("invalid option");
                    break;
            }
        }
    }
}
