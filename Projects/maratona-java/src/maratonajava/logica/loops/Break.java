package maratonajava.logica.loops;

public class Break {
    public static void main(String[] args) {
        int maxNumber = 50;
        for (int i = 0; i < maxNumber; i++) {
            if (i > 25){
                break;
            }
                System.out.println(i);
        }
        System.out.println("outside for");
    }
}
