package Logica.Switch;

import java.util.Scanner;

public class ContaSwitch {
    public static void main(String[] args) {
        String conta = "CONTA_POUPANCA";
        double juros = 0;
        switch (conta) {
            case "CONTA_POUPANCA":
                System.out.println("0.05%");
                break;
                case "CONTA_CORRENTE":
                System.out.println("0.02%");
                break;
                case "CONTA_INVESTIMENTO":
                System.out.println("0.1%");
                break;
        
            default:
                System.out.println("Conta inexistente");
                return;
        } 
        
    }
}
