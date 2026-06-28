package maratonajava.javacore.Gassociation.test;

import maratonajava.javacore.Gassociation.domain.Player;
import maratonajava.javacore.Gassociation.domain.Team;

public class PlayerTest03 {
    public static void main(String[] args) {
        Player player = new Player("pelé");
        Player player2 = new Player("Cafu");
        Team team = new Team("Brazil");
        Player[] players ={player, player2};

        player.setTeam(team);
        player2.setTeam(team);
        team.setPlayers(players);

        System.out.println("----Player----");
        player.print();
        player2.print();

        System.out.println("-----Team-----");
        team.print();
    }
}
