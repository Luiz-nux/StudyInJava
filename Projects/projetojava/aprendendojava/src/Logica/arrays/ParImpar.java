package Logica.arrays;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("escreva o numero " +(i+1)+ ":");
            numeros[i] = scanner.nextInt();
        }
        int quantosImpar = 0;
        int quantosPares = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                quantosPares = quantosPares +1;
            } else {
                quantosImpar = quantosImpar +1;
            }
        }
        int[] impar = new int[quantosImpar];
        int[] par = new int[quantosPares];
        int qualPar = 0;
        int qualImpar = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                par[qualPar] = numeros[i];
                qualPar++;
            }else {
                impar[qualImpar] = numeros[i];
                qualImpar++;
            }
        }
        System.out.print(" numeros par: " );
        for (int i = 0; i < par.length; i++) {
            System.out.print(par[i] + ", ");
        }
        System.out.println();
        System.out.print(" numeros impar: ");
        for (int i = 0; i < impar.length; i++) {
            System.out.print(impar[i]+ ", ");
        }
    }
}
