package maratonajava.javacore.Einicializationblock.domain;

public class Anime {
    private String name;
    private int[] episodes;

    {
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    public Anime(String name){
        this.name = name;
    }

    public Anime(){
        for (int episode: episodes){
            System.out.print(episode);
        }
    }

    public void setEpisodes(int episode){
        this.episodes = new int[episode];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    public void print(){
        System.out.println(name);
        for (int episode: episodes){
            System.out.print(episode + " ");
        }
    }

    public int[] getEpisodes(){
        return this.episodes;
    }

}