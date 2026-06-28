package Logica.IfElse;
import java.util.Scanner;

public class Primeiro {
    public static void main(String[] args) {
       Scanner tecladoScanner= new Scanner(System.in);
       System.out.println("digite um numero de 1 a 7");
       int numero = Integer.parseInt(tecladoScanner.nextLine());
        if (numero == 1) {
        System.out.println("domingo");
       }else if (numero == 2) {
        System.out.println("Segunda");
       }else if (numero == 3) {
        System.out.println("Terça");
       }else if (numero == 4) {
        System.out.println("Quarta");
       }else if (numero == 5) {
        System.out.println("Quinta");
       }else if (numero == 6) {
        System.out.println("Sexta");
       }else if (numero == 7) {
        System.out.println("Sabado");
       } else{
        System.out.println("dia invalido ");
       }

    }
    
}