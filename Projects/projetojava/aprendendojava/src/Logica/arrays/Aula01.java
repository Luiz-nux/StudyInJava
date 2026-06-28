package Logica.arrays;

import java.util.Scanner;

public class Aula01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas= new double[4];
        boolean firstN= false;
        for (int i = 0; i < notas.length; i++) {     
        notas [0] = Double.parseDouble(scanner.nextLine());
        if (!firstN) {
            notas[1] = notas[0];
            firstN = true;
        } else if (notas [0] > notas[1]) {
            notas[1] = notas[0];
        }
        System.out.println(notas[1]);
    }

    }
}
