package maratonajava.logica.arraysmultidi;

public class class01 {
    public static void main(String[] args) {
        int [][] number = new int[2][3];
        number[0][0] = 43;
        number[0][1] = 53;
        number[0][2] = 47;
        number[1][0] = 76;
        number[1][1] = 74;
        number[1][2] = 86;
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                System.out.println(number[i][j]);
            }
        }
            System.out.println("------------------------------------------------");

            for (int[] array : number){
                for (int inside : array){
                    System.out.println(inside);
                }
            }

    }
}
