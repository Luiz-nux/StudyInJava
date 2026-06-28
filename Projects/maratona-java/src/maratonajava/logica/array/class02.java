package maratonajava.logica.array;

public class class02 {
    public static void main(String[] args) {
        int[] ages = new int[3];
        int[] ages2 = {1, 2, 3, 4, 5};
        int[] ages3 = new int[] {5, 4, 3, 2, 1};
        //      for (int i = 0; i < ages.length; i++) {
        //           System.out.println(ages[i]);
        //       }
        //       ages = new int[6];
        //       System.out.println(ages[1]);

        for (int num : ages3) {
            System.out.println(num);
        }
    }
}