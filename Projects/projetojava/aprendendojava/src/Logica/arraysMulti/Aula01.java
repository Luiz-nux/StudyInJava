package Logica.arraysMulti;

import java.util.Scanner;

public class Aula01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] numbers = new int[2][3];
       for (int i = 0; i < numbers.length; i++) {
        for (int j = 0; j < numbers[i].length; j++) {
            System.out.println("escreva um numero para colocar na coluna " +(i+1)+ " na posição " +(j+1)+":");
            numbers[i][j] = Integer.parseInt(scanner.nextLine());
        }
       }
       System.out.println("----------------------------------------------------");
         for (int i = 0; i < numbers.length; i++) {
        for (int j = 0; j < numbers[i].length; j++) {
            System.out.println("o numero da coluna "+(i+1)+ " na posição "+ (j+1)+ " é de: "+ numbers[i][j]);
        }
       }
    }
}
