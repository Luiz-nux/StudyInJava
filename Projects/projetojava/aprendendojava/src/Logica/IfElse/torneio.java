package Logica.IfElse;
import java.util.Scanner;

public class torneio {
    public static void main(String[] args) {
        Scanner tecladoScanner = new Scanner(System.in);
        String nome= "";
        double peso= 0;
        int idade = 0;
        String categoria = "";
        String categoraiIdade = "";
        System.out.print("Insira seu  nome : ");
        nome = tecladoScanner.nextLine();
        System.out.print("Insira sua idade: ");
        idade = Integer.parseInt(tecladoScanner.nextLine());
        System.out.print("Insira seu peso: ");
        peso = Double.parseDouble(tecladoScanner.nextLine());
        if (idade <= 5) {
            categoraiIdade = "Pré Mirim";
            if (peso <= 14.00) {
                categoria = "Pluma";
            } else if (peso <= 18.00) {
                categoria = "Leve";
            } else if (peso <= 22.00) {
                categoria = "Meio-Pesado";
            } else if (peso <= 26.00) {
                categoria = "Super-pesado";
            } else if (peso <= 30.00) {
                categoria = "Pessádissimo";
            }  else {
                categoria = "Acima do peso";
            }
        } else if (idade <= 7) {
            categoraiIdade = "Mirim";
            if (peso <= 22.00) {
                categoria = "Pluma";      
            } else if (peso <= 24.00) {
                categoria = "pena";
            } else if (peso <= 26.00) {
                categoria = "Leve";
            } else if (peso <= 28.50) {
                categoria = "Médio";
            } else if (peso <= 30.00) {
                categoria = "Meio-Pesado";
            } else if (peso <= 32.50) {
                categoria = "Pesado";
            } else if (peso <= 34.00) {
                categoria = "Super-pesado";
            } else if (peso <= 38.00) {
                categoria = "Pessádissimo";
            }  else {
                categoria = "Acima do peso";
            }
        } else if (idade <= 9) {
            categoraiIdade = "Infantil A";
            if (peso <= 28.00) {
                categoria = "Pluma";      
            } else if (peso <= 30.50) {
                categoria = "pena";
            } else if (peso <= 33.00) {
                categoria = "Leve";
            } else if (peso <= 35.50) {
                categoria = "Médio";
            } else if (peso <= 38.00) {
                categoria = "Meio-Pesado";
            } else if (peso <= 41.50) {
                categoria = "Pesado";
            } else if (peso <= 43.00) {
                categoria = "Super-pesado";
            } else if (peso <= 48.00) {
                categoria = "Pessádissimo";
            }  else {
                categoria = "Acima do peso";
            }
        } else if (idade <= 11) {
            categoraiIdade = "Infantil B";
            if (peso <= 34.00) {
                categoria = "Pluma";      
            } else if (peso <= 37.00) {
                categoria = "pena";
            } else if (peso <= 39.00) {
                categoria = "Leve";
            } else if (peso <= 41.50) {
                categoria = "Médio";
            } else if (peso <= 44.00) {
                categoria = "Meio-Pesado";
            } else if (peso <= 46.50) {
                categoria = "Pesado";
            } else if (peso <= 43.00) {
                categoria = "Super-pesado";
            } else if (peso <= 54.00) {
                categoria = "Pessádissimo";
            }  else {
                categoria = "Acima do peso";
            }
        } else if (idade <= 13) {
            categoraiIdade = "Infanto juvenil A";
            if (peso <= 40.00) {
                categoria = "Pluma";      
            } else if (peso <= 42.50) {
                categoria = "pena";
            } else if (peso <= 45.00) {
                categoria = "Leve";
            } else if (peso <= 47.50) {
                categoria = "Médio";
            } else if (peso <= 50.00) {
                categoria = "Meio-Pesado";
            } else if (peso <= 52.50) {
                categoria = "Pesado";
            } else if (peso <= 55.00) {
                categoria = "Super-pesado";
            } else if (peso <= 60.00) {
                categoria = "Pessádissimo";
            }  else {
                categoria = "Acima do peso";
            }
        }  else if (idade <= 15) {
            categoraiIdade = "Infanto juvenil B";
            if (peso <= 44.00) {
                categoria = "Galo";      
            } else if (peso <= 48.00) {
                categoria = "Pluma";      
            } else if (peso <= 52.00) {
                categoria = "pena";
            } else if (peso <= 56.00) {
                categoria = "Leve";
            } else if (peso <= 60.00) {
                categoria = "Médio";
            } else if (peso <= 64.00) {
                categoria = "Meio-Pesado";
            } else if (peso <= 68.50) {
                categoria = "Pesado";
            } else if (peso <= 72.50) {
                categoria = "Super-pesado";
            } else {
                categoria = "Pessádissimo";
            } 
        } else {
            
        } if(idade > 15) {
            System.out.println("Idade minima 15 anos.");
            
        }else {
          System.out.println("olá " +nome+ ", vc esta na " +categoraiIdade+ ", categoria = " +categoria);
        }
        
    }
}