package Logica.whiles;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner tecladoScanner = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        String name = tecladoScanner.nextLine();
        int number = 1;
        while (number != 0) {
            System.out.println("1 - Mostrar mensagem");
            System.out.println("2 - par ou impar");
            System.out.println("3 - qual o maior?");
            System.out.println("0 - sair");
            number = Integer.parseInt(tecladoScanner.nextLine());
            switch (number) {
                case 1: 
                System.out.println("olá " + name + " seja bem vindo");
                tecladoScanner.nextLine();
                    break;
                   
                    case 2:
                        System.out.print("escolha o numero: ");
                        int number1 = Integer.parseInt(tecladoScanner.nextLine());
                        int rest = number1 % 2;
                       if (rest == 0) {
                        System.out.println("numero é par");
                       } else {
                        System.out.println("numero é impar");
                       } tecladoScanner.nextLine();
                        break;
                      
                        case 3:
                        System.out.print("escolha o primeiro numero: ");
                        double number3 = Double.parseDouble(tecladoScanner.nextLine());
                        System.out.print("escolha o segundo numero:");
                        double number2 = Double.parseDouble(tecladoScanner.nextLine());
                        if (number3 > number2) {
                            System.out.println(number3+ " é maior");
                            
                        } else {
                            System.out.println(number2 + " é maior");
                            
                        } tecladoScanner.nextLine();
                        break;

                        case 0:
                            System.out.println("fechando programa...");
                            break;
                            default:
                                System.out.println("opção n valida");
                                tecladoScanner.nextLine();
                                break;
                        }
            
                
            }
        }
    }

