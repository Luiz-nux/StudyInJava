package Logica.IfElse;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("digite o primeiro numero: ");
        double number = Double.parseDouble(teclado.nextLine());
        System.out.print("digite a operação: ");
        String operation= teclado.nextLine();
        System.out.print("digite o segundo numero: ");
        double number2 = Double.parseDouble(teclado.nextLine());
        double result = 0;
        if (operation.equals("+")) {
            result = number + number2;
        } else if (operation.equals("-")) {
            result = number - number2;
        } else if (operation.equals("*")) {
            result = number * number2;
        } else {
            result = number / number2;
        }
        System.out.println("result: " +result);
            
        }
    }

