package maratonajava.javacore.Cmethodoverloanding.test;

import maratonajava.javacore.Cmethodoverloanding.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Aot", "Anime" , new int[]{25, 20, 15}, "finished");
        anime.setName("Naruto");
        anime.setType("TV");
        anime.setSeasonEpisodes(new int[] {12, 15, 13, 20});
        anime.print();
    }
}
