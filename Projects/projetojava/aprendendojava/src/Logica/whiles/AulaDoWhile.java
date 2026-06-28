package Logica.whiles;

import java.util.Scanner;

public class AulaDoWhile {
    public static void main(String[] args) {
        int desejaContinuar = 0;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("escolha um numero: ");
            int number1 = Integer.parseInt(scanner.nextLine());
            System.out.print("escolha o segundo numero: ");
            int number2 = Integer.parseInt(scanner.nextLine());
            if (number1 == number2) {
                System.out.println("são iguais");
            } else {
                System.out.println("são diferentes");
            }
            System.out.println("------------------------------------------");
            System.out.println("deseja continuar jogando?");
            System.out.println("1. sim");
            System.out.println("2. não");
            desejaContinuar = Integer.parseInt(scanner.nextLine());
        } while(desejaContinuar == 1);
    }
}
