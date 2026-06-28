package Logica.fors;

import java.util.Scanner;

public class desafios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        int x = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <= x; i++) {
            numero = numero +i;
            
        }
        System.out.println(numero);
    }
}
