package Logica.arrays;

import java.util.Scanner;

public class Desafios01Melhorado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] v1 = new int[3];
        int[] v2 = new int[3];
        int[] vr= new int[v2.length];
        String vrFinal = "";

        for (int i = 0; i < v1.length; i++) {
            System.out.println("escolha o valor de V1 para o numero "+(i+1)+":");
            v1[i]= Integer.parseInt(scanner.nextLine());
             System.out.println("escolha o valor de V2 para o numero "+(i+1)+":");
            v2[i]= Integer.parseInt(scanner.nextLine());
            vr[i] = v1[i]*v2[i];
            vrFinal = vrFinal + vr[i] + " ";
        }
        System.out.println("VR: ");
        System.out.println(vrFinal);
        
    }
}