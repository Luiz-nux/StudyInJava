package Logica.whiles;

import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String loginCadastrado ="";
        String senhaCadastrada = "";
        String senha = "";
        
        do {
            System.out.print("crie seu login: ");
         loginCadastrado = scanner.nextLine();
        System.out.print("digite sua senha: ");
         senhaCadastrada = scanner.nextLine();
        System.out.print("confirme sua senha: ");
         senha = scanner.nextLine();
         if (!senhaCadastrada.equals(senha) || loginCadastrado.isBlank() || senhaCadastrada.isBlank()) {
            System.out.println("senhas precisam ser iguais e login e senha precisa ter algum caractere");
         }
        
         } while(!senhaCadastrada.equals(senha) || loginCadastrado.isBlank() || senhaCadastrada.isBlank());
         boolean senhaCerta = false;
         boolean sair = false;
         int opção = 1;
         String login = "";
         while (opção != 2 && !senhaCerta) {
         System.out.println("1. login");
        System.out.println("2. sair");
        opção = Integer.parseInt(scanner.nextLine());
        switch (opção) {
            case 1:
                System.out.println("insira seu login: ");
                login = scanner.nextLine();
                System.out.println("insira sua senha: ");
                senha = scanner.nextLine();
                if (!login.equals(loginCadastrado) || !senha.equals(senhaCadastrada)) {
                    System.out.println("Senha ou login incorretos");
                    break;
                }else {
                    System.out.println("acessando conta");
                    senhaCerta = true;
                }
                break;
                case 2:
                    System.out.println("saindo");
        break;
            default:
                System.out.println("opção invalida");
                break;
        }

         }
        
        
}
}