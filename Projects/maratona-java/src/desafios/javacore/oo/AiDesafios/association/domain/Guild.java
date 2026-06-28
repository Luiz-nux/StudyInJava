package desafios.javacore.oo.AiDesafios.association.domain;

public class Guild {
    private String name;
    private Player[] players;

    public Guild(String name) {
        this.name = name;
    }

    public void listPlayer(){
        if (players == null) return;
        for (Player player: players){
            System.out.println(player.getName());
        }
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
