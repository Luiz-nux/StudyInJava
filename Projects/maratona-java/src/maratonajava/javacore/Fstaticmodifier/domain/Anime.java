package maratonajava.javacore.Fstaticmodifier.domain;

public class Anime {
    private String name;
    private static int[] episodes;

    static {
        System.out.println("inside static init block 1");
        episodes = new int[100];
        for (int i = 0; i < Anime.episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    static {
        System.out.println("inside static init block 2");
    }

    static {
        System.out.println("inside static init block 3");
    }

    {
        System.out.println("inside non-static init block");
    }

    public Anime(String name){
        this.name = name;
    }

    public Anime(){
        for (int episode: Anime.episodes){
            System.out.print(episode + " ");
        }
        System.out.println();
    }

    public static void setEpisodes(int episode){
        Anime.episodes = new int[episode];
        for (int i = 0; i < episodes.length; i++) {
            Anime.episodes[i] = i + 1;
        }
    }

    public void print(){
        System.out.println(name);
        for (int episode: Anime.episodes){
            System.out.print(episode + " ");
        }
    }

    public int[] getEpisodes(){
        return Anime.episodes;
    }

}