package maratonajava.javacore.Dconstructor.test;

import maratonajava.javacore.Dconstructor.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("Ato", "mangá", 20, "finished");
        anime.print();
    }
}
