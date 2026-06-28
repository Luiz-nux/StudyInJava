package maratonajava.logica.loops;

public class Aula01 {
    public static void main(String[] args) {
        int counter = 12;
        while (counter < 10) {
            System.out.println(++counter);
        }
        do {
            counter = 10;
            System.out.println(counter);
        } while (counter < 10);
        for (int i = 0; i < 10; i++) {
            System.out.println("inside for "+i);
        }
    }
}
