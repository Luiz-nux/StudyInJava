package Logica.whiles;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner tecladoScanner = new Scanner(System.in);
        final String login = "1";
        final String senha = "2";
        int tentativas = 0;
        while (tentativas <3) {
            
         System.out.println("insira seu login: ");
         String loginInserir = tecladoScanner.nextLine();
        System.out.println("insira sau senha: ");
         String senhaInserir = tecladoScanner.nextLine();

         if (login.equals(loginInserir) && senha.equals(senhaInserir)) {
            System.out.println("ACESSO CONCEDIDO");
            break;
         }
            System.out.println("ACESSO NEGADO");
            tentativas = tentativas+1;
            
         
    }
    if (tentativas == 3) {
        System.out.println("tentativas bloqueada");
    }
    System.out.println("PROGRAMA TERMINADO");

}
}
