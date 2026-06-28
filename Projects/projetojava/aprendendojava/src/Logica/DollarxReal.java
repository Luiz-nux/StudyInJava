package Logica;
import java.util.Scanner;

public class DollarxReal{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("digite o valor do produto: ");
        double produto = Double.parseDouble(teclado.nextLine());
        double taxagoverno = produto*0.6;
        double precoReal = (produto + taxagoverno) *5;
        
        
        System.out.print("A taxa do governo a mais $"+taxagoverno+" e o preço em real ficara no final R$"+precoReal);
       
    }
}