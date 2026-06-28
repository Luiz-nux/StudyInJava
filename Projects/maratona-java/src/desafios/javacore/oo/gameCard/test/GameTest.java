package desafios.javacore.oo.gameCard.test;

import desafios.javacore.oo.gameCard.domain.Card;

import java.util.Scanner;

public class GameTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Card cardHero = new Card();
        Card cardEnemy = new Card();
        cardHero.dmg = 1.5;
        cardHero.level = 1;
        cardEnemy.name = "Goblin";
        cardEnemy.dmg = 1;
        cardEnemy.level = 1;
        System.out.println("whats your name?");
        cardHero.name = scanner.nextLine();
        int choose;
        boolean inside = true;
        while (inside){
            cardHero.life = 13.0;
            cardEnemy.life = 7;
            System.out.println("1- view card");
            System.out.println("2- fight");
            System.out.println("3- exit");
            choose = scanner.nextInt();
            switch (choose){
                case 1:
                    cardHero.statusCard();
                    System.out.println("[--------------------------------------------]");
                    break;
                case 2:
                    boolean fight = true;

                    while (cardEnemy.life > 0 && cardHero.life > 0 && fight) {
                        cardEnemy.statusCard();
                        System.out.println("------");
                        cardHero.statusCard();
                        System.out.println("------");
                        System.out.println("1- attack");
                        System.out.println("2- run");
                        choose = scanner.nextInt();
                        switch (choose){
                            case 1:

                                cardHero.attack(cardEnemy);

                                cardEnemy.attack(cardHero);

                                System.out.println("[--------------------------------------------]");
                                break;
                            case 2:
                                System.out.println("[--------------------------------------------]");
                                fight = false;
                                break;
                            default:
                                System.out.println("this option does not exist");
                                break;
                        }
                    }
                    if (cardHero.life <= 0){
                        System.out.println("you lose");
                    } else if (cardEnemy.life <= 0){
                        System.out.println("you win");
                    } else {
                        System.out.println("you run");
                    }
                    break;
                case 3:
                    System.out.println("exit game...");
                    inside = false;
                    break;
                default:
                    System.out.println("this option does not exist");
                    break;
            }
        }
    }
}