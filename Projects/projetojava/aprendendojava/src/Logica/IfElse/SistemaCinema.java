package Logica.IfElse;
import java.util.Scanner;

public class SistemaCinema {
    public static void main(String[] args) {
        Scanner tecladoScanner = new Scanner(System.in);
        System.out.print("Qual sua idade?");
        int idade = Integer.parseInt(tecladoScanner.nextLine());
        System.out.println("Você é estudante? (S/N)");
        String estuda = tecladoScanner.nextLine();

        double ingresso = 30;

          if ((!estuda.equalsIgnoreCase("s") && !estuda.equalsIgnoreCase("n")) ) {
            System.out.println("resposta invalida");
            return;
        }
        System.out.println("Qual dia da semana, SEG/TER/QUA/QUI/SEX/SAB/DOM?");
        String dia = tecladoScanner.nextLine();
        if (!dia.equalsIgnoreCase("seg") && !dia.equalsIgnoreCase("ter") && !dia.equalsIgnoreCase("qua") && !dia.equalsIgnoreCase("qui") && !dia.equalsIgnoreCase("sex") && !dia.equalsIgnoreCase("sab") && !dia.equalsIgnoreCase("dom")) {
            System.out.println("dia da semana invalido");
            return;
        }
        
        if (idade < 12) {
            ingresso = 15;
        }
        else if (idade >= 60) {
            ingresso = 10;
        } 
        

         if (estuda.equalsIgnoreCase("S")) {
            ingresso = ingresso/2; }

         if (dia.equalsIgnoreCase("qua")) {
            ingresso = ingresso/2;
        }



        System.out.print("Valot do ingresso: " +ingresso);
}
}
