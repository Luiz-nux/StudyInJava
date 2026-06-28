package Logica.whiles;

import java.util.Scanner;

public class MenuImposto {
    public static void main(String[] args) {
        Scanner tecladoScanner = new Scanner(System.in);
        double salario = 0;
        int opção = 0;
        while (opção != 3) {
            System.out.println("1. Calcular imposto");
            System.out.println("2. Depositar salarário");
            System.out.println("3. Sair");
            System.out.println("digite sua opção");
            opção = Integer.parseInt(tecladoScanner.nextLine());
            switch (opção) {
                case 1:
                    System.out.println("quanto de imposto? (exp: 10/5/35)");
                    double imposto = Double.parseDouble(tecladoScanner.nextLine());
                    imposto = salario * imposto/100;
                    System.out.println(imposto+ " de imposto do seu salario de " +salario);
                    break;
                    case 2:
                        System.out.println("quanto de salario: ");
                        salario = Double.parseDouble(tecladoScanner.nextLine());
                        break;
                        case 3:
                            System.out.println("programa finalizado");
                            break;
                default:
                    System.out.println("opção invalida");
                    break;
            }
        }
        
    }
}
