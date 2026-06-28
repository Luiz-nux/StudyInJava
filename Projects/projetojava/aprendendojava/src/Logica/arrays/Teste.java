package Logica.arrays;

public class Teste {
    public static void main(String[] args) {
        double[] numbers = new double[6];
        numbers[0]= 30; 
        numbers[1] = 20; 
        numbers[2]= 40; 
        numbers[3]= 68; 
        numbers[4] = 15;
        numbers[5]= 97;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] != numbers[0] &&numbers[i] < numbers [i -1]) {
                    if (numbers[i - 1] > numbers[j]){
                        double temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers [j] = temp;
                    }
                } 
                else if (numbers[i] == numbers[0] && numbers[i] < numbers[j]) {
                    double temp = numbers[i];
                    numbers [i] = numbers[j];
                    numbers [j] = temp;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
