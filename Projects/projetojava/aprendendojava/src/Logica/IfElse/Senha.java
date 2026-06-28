package Logica.IfElse;
import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner tecladoScanner = new Scanner(System.in);
        System.out.println("Qual seu sexo? (M/F)");
        String sexo = tecladoScanner.nextLine();
        if (sexo.equalsIgnoreCase("m" ) || sexo.equalsIgnoreCase("F") ) {
                
        } else {
            System.out.println("sexo invalido");
            return;
        }
        System.out.println("Qual sua idade?");
        int idade = Integer.parseInt(tecladoScanner.nextLine());
if (idade <1) {
    System.out.println("idade impossivel");
return;    
}
        if (sexo.equalsIgnoreCase("m")) {
            if (idade < 18) {
                System.out.println("alistamento não permitido");
            } else {
                System.out.println("alistamento obrigatório");
            }
        } else {
            if (idade >= 18) {
                System.out.println("deseja se alistar? (S/N)");
                String resposta = tecladoScanner.nextLine();
                if ((!resposta.equalsIgnoreCase("s") && !resposta.equalsIgnoreCase("n")) || sexo.isBlank()) {
                    System.out.println("resposta invalida");
                    return;
                } else if (resposta.equalsIgnoreCase("s")) {
                    System.out.println("alistamento concluido");
                }else {
                    System.out.println("alistamento cancelado");
                    }
                    
                } else {
                    System.out.println("alistamento não permitido");
                }
                    
                }
            }

        }