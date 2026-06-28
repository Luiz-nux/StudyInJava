package maratonajava.logica.arraysmultidi;

public class class02 {
    public static void main(String[] args) {
        int[][] arrayy = new int[3][];
        int[] numbers = {1,2,3};
        arrayy[0] = new int[]{1,2};
        arrayy[1] = numbers;
        arrayy[2] = new int[]{1,2,3,4,5,6};

        int[][] array2 = {{1,2},{1,2,3},{1,2,3,4,5,6}};

        for (int[] baseArrey : array2) {
            System.out.println("\n------------------------");
            for (int num : baseArrey) {
                System.out.print(num);
            }
        }
    }
}