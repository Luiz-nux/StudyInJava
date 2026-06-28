package maratonajava.javacore.Cmethodoverloanding.domain;

public class Anime {
    private String name;
    private String type;
    private int[] seasonEpisodes;
    private String status;

    public void init(String name, String type, int... seasonEpisodes){
        this.name = name;
        this.type = type;
        this.seasonEpisodes = seasonEpisodes;
    }

    public void init(String name, String type, int[] seasonEpisodes, String status){
        this.init(name, type, seasonEpisodes);
        this.status = status;

    }

    public void print() {
        System.out.println("type: " + this.type);
        System.out.println("name: " + this.name);
        System.out.println("status: " + status);
        if (seasonEpisodes.length == 0) {
            System.out.println("no season");
            return;
        }
        for (int i = 0; i < seasonEpisodes.length; i++) {
            System.out.println("season " + (i + 1) + " episodes: " + seasonEpisodes[i]);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setSeasonEpisodes(int[] seasonEpisodes) {
        this.seasonEpisodes = seasonEpisodes;
    }

    public void getSeasonEpisodes() {
        if (seasonEpisodes.length == 0) {
            System.out.println("no season");
            return;
        }
        for (int num: seasonEpisodes){
            System.out.println(num);
        }
    }
}
