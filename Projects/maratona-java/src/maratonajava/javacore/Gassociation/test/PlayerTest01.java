package maratonajava.javacore.Gassociation.test;

import maratonajava.javacore.Gassociation.domain.Player;

public class PlayerTest01 {
    public static void main(String[] args) {
        Player p1 = new Player("pelé");
        Player p2 = new Player("Neymar");
        Player p3 = new Player("Romário");

        Player[] players = {p1, p2, p3};

        for (Player player: players){
            player.print();
        }
    }
}