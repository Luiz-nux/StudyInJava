package maratonajava.javacore.Einicializationblock.test;

import maratonajava.javacore.Einicializationblock.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        System.out.println();
        for (int i = 0; i < anime.getEpisodes().length; i++) {
            System.out.println(anime.getEpisodes()[i]);
        }
    }
}
