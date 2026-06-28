package Logica.whiles;

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner tecladoScanner = new Scanner(System.in);
        System.out.print("digite um numero: ");
        long numero = Integer.parseInt(tecladoScanner.nextLine());
        long valor = 1;
        while (valor <= numero) {
            if (valor % 9 != 0) {
                System.out.println(valor);
            } valor = valor +1;
           
        } 
    }
}
