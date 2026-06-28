package Logica.whiles;

import java.util.Scanner;

public class MenuMediaMaior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean condicao = true;
        double maior = 0;
        boolean temNumero = false;
        double total = 0;
        int quantidade = 0;
        while (condicao) {
            System.out.println("1. Adiciona numero");
            System.out.println("2. Mostrar maior");
            System.out.println("3. Mostrar media");
            System.out.println("4. Sair");
            int opcao = Integer.parseInt(scanner.nextLine());
            switch (opcao) {
                case 1:
                    System.out.print("Escreva um numero: ");
                    double numero = Double.parseDouble(scanner.nextLine());
                    total = total +numero;
                    quantidade = quantidade +1;
                    if (!temNumero) {
                        maior = numero;
                        temNumero = true;
                    }else if (maior < numero) {
                        maior = numero;
                    }

                    break;
                    case 2:
                        System.out.println("o maior numero é: "+ maior);
                        break;
                        case 3:
                            System.out.println("a media dos numeros é: " +total/quantidade);
                            break;
                            case 4:
                                System.out.println("fechando programa");
                                condicao = false;
                                break;
            
                default:
                    System.out.println("opção invalida");
                    break;
            }
        }
    }
}
