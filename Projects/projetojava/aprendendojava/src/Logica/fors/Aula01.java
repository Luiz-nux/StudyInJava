package Logica.fors;

import java.util.Scanner;

public class Aula01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean dentro = true;
            while (dentro) {
                
            
                System.out.println("escolha um numero inteiro para ver a tabuada, ou escolha 0 para sair: ");
                int opção =Integer.parseInt(scanner.nextLine());
                switch (opção) {
                    case 0:
                        System.out.println("saindo");
                        dentro = false;
                        break;
                
                    default:
                        for (int vezes = 1; vezes <= 50; vezes++) {
                            System.out.println(opção+ " x " +vezes+ "= " +opção*vezes);
                        }
                        break;
                }
            
            }
            }
        
    }

