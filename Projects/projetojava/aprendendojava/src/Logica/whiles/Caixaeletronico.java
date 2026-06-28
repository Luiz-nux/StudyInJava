package Logica.whiles;

import java.util.Scanner;

public class Caixaeletronico {
    public static void main(String[] args) {
        Scanner tecladoScanner = new Scanner(System.in);
        double saldo = 1000;
        int opcao = 0;
        while (opcao != 4) {
        System.out.println("1 - Ver saldo");
        System.out.println("2 - Depositar");
        System.out.println("3 - Sacar");
        System.out.println("4 - Sair");
        opcao = Integer.parseInt(tecladoScanner.nextLine());
            
         switch (opcao) {
            case 1:
                System.out.println("valor do saldo: " +saldo);
                
                break;
        case 2:
            System.out.print("valor a depositar no eu saldo: ");
            double DepositarSaldo = Double.parseDouble(tecladoScanner.nextLine());
            while (DepositarSaldo <= 0) {
                System.out.println("deposite um saldo maior q 0");
                DepositarSaldo = Double.parseDouble(tecladoScanner.nextLine());
            }
            saldo = saldo + DepositarSaldo;
            break;
            case 3:
                System.out.println("saldo atual: " +saldo);
                System.out.print("valor para sacar: ");
             double SacarSaldo = Double.parseDouble(tecladoScanner.nextLine());
             while (SacarSaldo > saldo || SacarSaldo < 0) {
                System.out.println("o valor tem q ser positivo e menor q seu saldo atual");
                SacarSaldo = Double.parseDouble(tecladoScanner.nextLine());
             }
             saldo = saldo - SacarSaldo;

                break;
            case 4:
                System.out.println("vc esta saindo do programa");
                break;
                default:
                    System.out.println("esta opção n esta valida");
                    break;
        }
    }
}
}
