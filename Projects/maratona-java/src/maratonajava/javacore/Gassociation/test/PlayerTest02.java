package maratonajava.javacore.Gassociation.test;

import maratonajava.javacore.Gassociation.domain.Player;
import maratonajava.javacore.Gassociation.domain.Team;

public class PlayerTest02 {
    public static void main(String[] args) {
        Player player1 = new Player("pelé");
        Team team1 = new Team("Brazil's national team");

        player1.setTeam(team1);

        player1.print();
    }
}