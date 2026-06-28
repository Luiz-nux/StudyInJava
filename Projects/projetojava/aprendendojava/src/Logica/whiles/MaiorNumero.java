package Logica.whiles;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double maior = 0;
        boolean i = true;
        boolean temnumero = false;
        while (i) {
            System.out.println("1. Digite numero");
            System.out.println("2. Mostrar maior numero ate agora");
            System.out.println("3. Sair");
            String escolha = scanner.nextLine();
            switch (escolha) {
                case "1":
                    System.out.println("Digite um numero");
                    double numero = Double.parseDouble(scanner.nextLine());
                    if (!temnumero) {
                        maior = numero;
                        temnumero = true;
                    }
                    if (numero > maior) {
                        maior = numero;
                    }
                    break;
                    case "2":
                        System.out.println("Maior numero: "+maior);
                        System.out.println("------------------------------");

                        break;
                        case "3":
                            System.out.println("saindo do programa");
                            i = false;
                            break;
            
                default:
                    System.out.println("escolha invalida");
                    break;
            }
        }
    }
}
