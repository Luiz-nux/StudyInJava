package Logica.arrays;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        double[] notas = new double[10];
        Scanner scanner = new Scanner(System.in);
        double media = 0;
        double soma = 0;
        double maior = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Qual o valor da nota " +(i+1)+ ":");
            notas[i] = scanner.nextDouble();
           soma = soma +notas[i];
        }
        media = soma/notas.length;
        double menor = notas[0];
        int quantidadeMaior = 0;
        int quantidadeMenor = 0;
        for (int i = 0; i < notas.length; i++) {
             if (maior < notas[i]) {
            maior = notas[i];
           }
            if (menor > notas[i]) {
                menor = notas [i];
            }
            if (media < notas[i]) {
                quantidadeMaior = quantidadeMaior + 1;
            } else {
                quantidadeMenor = quantidadeMenor +1;
            }
        }
        System.out.println("A média desta turma foi de:" +media);
        System.out.println("A maior nota da turma foi: " +maior);
        System.out.println("A menor nota da turma foi:" +menor);
        System.out.println("Essa foi a quantidade de alunos q ficaram na media ou acima dela: " +quantidadeMaior);
        System.out.println("E está foi a quantidade q ficaram abaixo da media: " +quantidadeMenor);
       
    }
}
