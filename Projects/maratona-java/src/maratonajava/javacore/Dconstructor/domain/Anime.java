package maratonajava.javacore.Dconstructor.domain;

public class Anime {
    private String name;
    private String type;
    private int episodes;
    private String status;
    private String studio;

    public Anime(String name, String type, int episodes, String status){
        this();
        this.name = name;
        this.type = type;
        this.episodes = episodes;
        this.status = status;
    }

    public Anime(String name, String type, int episodes, String status, String studio){
        this(name, type, episodes, status);
        this.studio = studio;
    }

    public Anime(){
        System.out.println("inside no args constructor");
    }

    public void print() {
        System.out.println("type: " + this.type);
        System.out.println("name: " + this.name);
        System.out.println("status: " + this.status);
        System.out.println("episodes: " + this.episodes);
        System.out.println("studio: " + this.studio);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public int getEpisodes() {
        return this.episodes;
    }
}
