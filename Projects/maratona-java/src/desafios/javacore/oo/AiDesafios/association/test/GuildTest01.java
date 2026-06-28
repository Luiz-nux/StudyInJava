package desafios.javacore.oo.AiDesafios.association.test;

import desafios.javacore.oo.AiDesafios.association.domain.Guild;
import desafios.javacore.oo.AiDesafios.association.domain.Mission;
import desafios.javacore.oo.AiDesafios.association.domain.Player;

import java.util.Scanner;

public class GuildTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player you = new Player("Luiz", 1, 0);
        Player player2 = new Player("Envelopa", 1, 0);
        Guild guild = new Guild("Dragons");
        Mission mission1 = new Mission("death goblins ", 10, 2, 500);
        Mission mission2 = new Mission("death slime ", 1, 1, 100);

        you.setGuild(guild);
        player2.setGuild(guild);
        Player[] players = {you, player2};
        guild.setPlayers(players);

        System.out.println("press enter for enter the game");
        String enter = scanner.nextLine();

        boolean insideGame = true;

        while (insideGame){
            System.out.println("1- Status");
            System.out.println("2- Inventory");
            System.out.println("3- Guild members");
            System.out.println("4- Mission");
            System.out.println("5- Exit");
            int choose = scanner.nextInt();
            switch (choose){
                case 1:
                    you.printStatus();
                    System.out.println("-------------------");
                    break;
                case 2:
                    you.viewInventory();
                    break;
                case 3:
                    guild.listPlayer();
                    break;
                case 4:
                    boolean startMission = true;
                    while (startMission){
                        System.out.println("missio 1: " + mission1.getName() +" "+ mission1.getDifficulty());
                        System.out.println("missio 2: " + mission2.getName() +" "+ mission2.getDifficulty());
                        System.out.println("3- back");
                        int choose2 = scanner.nextInt();
                        switch (choose2){
                            case 1:
                                you.getReward(mission1.getXpReward(), mission1.getCashReward());
                                startMission = false;
                                break;
                            case 2:
                                if (you.getLevel() > mission2.getDifficulty()){
                                    you.getReward(mission2.getXpReward(), mission2.getCashReward());
                                }
                                startMission = false;
                                break;
                            case 3:
                                startMission = false;
                                break;
                            default:
                                System.out.println("no valid");
                                break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("bye...");
                    insideGame = false;
                    break;
                default:
                    System.out.println("no valid");
                    break;
            }
        }

    }
}
