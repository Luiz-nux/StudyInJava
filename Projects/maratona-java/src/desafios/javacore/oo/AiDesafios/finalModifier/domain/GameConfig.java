package desafios.javacore.oo.AiDesafios.finalModifier.domain;

public class GameConfig {
    public static final int MAX_PLAYERS = 100;
    public static final int STARTING_GOLD = 500;
    public static final String GAME_NAME = "RPG Online";

    public void print(){
        System.out.println(MAX_PLAYERS);
        System.out.println(STARTING_GOLD);
        System.out.println(GAME_NAME);
    }
}
