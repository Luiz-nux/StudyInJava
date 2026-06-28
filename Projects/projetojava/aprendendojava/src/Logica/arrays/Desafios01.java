package Logica.arrays;

import java.util.Scanner;

public class Desafios01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] v1 = new int[3];
        int[] v2 = new int[3];

        for (int i = 0; i < v1.length; i++) {
            System.out.print("escolha o valor de V1 para o numero "+(i+1)+":");
            v1[i]= Integer.parseInt(scanner.nextLine());
        }
        System.out.println();
        for (int i = 0; i < v2.length; i++) {
            System.out.print("escolha o valor de V2 para o numero "+(i+1)+":");
            v2[i]= Integer.parseInt(scanner.nextLine());
        }
        System.out.println();
        int[] vr= new int[v2.length];
        for (int i = 0; i < vr.length; i++) {
            vr[i] = v1[i]*v2[i];
        }
        System.out.print("V1: ");
        for (int i = 0; i < v1.length; i++) {
            System.out.print(v1[i]+ " ");
        }
        System.out.println();

        System.out.print("V2: ");
        for (int i = 0; i < v2.length; i++) {
            System.out.print(v2[i] + " ");
        }
        System.out.println();

        System.out.print("VR: ");
        for (int i = 0; i < vr.length; i++) {
            System.out.print(vr[i] + " ");
        }
    }
}