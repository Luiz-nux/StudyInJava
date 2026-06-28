package Logica.arraysMulti;

import java.util.Scanner;

public class Desafio02 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("valor para a posição " +i+j +":");
                matriz[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("A multiplicação da diagonal secundaria da matriz é: ");
        int valor = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i+j == matriz.length - 1) {
                    valor = matriz[i][j] * valor;
                }
            }
        }
        System.out.println(valor);
    }
}

