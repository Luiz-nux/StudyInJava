package Logica.arrays;

import java.util.Scanner;

public class Aula02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double media = 0;
          double[] notas= new double[4];
         for (int i = 0; i < notas.length; i++) {     
        System.out.println("adicione o valor da nota " +(i+1)+":");
        notas[i] = Double.parseDouble(scanner.nextLine());
        media = media + notas[i];
    } media = media / notas.length;

    for (int i = 0; i < notas.length; i++) {
        System.out.println("valor da nota " +(i+1)+ ": " + notas[i]);
    }
    System.out.println("média = " +media);
}
}
