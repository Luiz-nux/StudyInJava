package maratonajava.logica.desafios;

import java.util.Scanner;

public class MediaMaior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int maior = numbers[0];
        int menor = numbers[0];
        int media = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("escolha o numero "+(i+1));
            numbers[i] = scanner.nextInt();
            if (i == 0) {
                maior = numbers[0];
            }else if (numbers[i] > maior){
                maior = numbers[i];
            }
            if (i ==0) {
                menor = numbers[0];
            }else if (numbers[i] < menor) {
                menor = numbers[i];
            }
            media += numbers[i];
        }
        media /= numbers.length;
        System.out.println("maior numero é: " +maior);
        System.out.println("menor numero é: " +menor);
        System.out.println("media numero é: " +media);
    }
}
