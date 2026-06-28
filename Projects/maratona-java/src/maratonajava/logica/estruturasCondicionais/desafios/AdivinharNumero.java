package maratonajava.logica.estruturasCondicionais.desafios;

import java.util.Scanner;

public class AdivinharNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 78;
        int tentativa;
        boolean jogando = true;
        int quantidade = 7;
        while (jogando && quantidade > 0) {
            System.out.println("tente adivinha um numero de 0 a 100");
            tentativa = scanner.nextInt();
            quantidade--;
            if (number == tentativa){
                System.out.println("Acertou!!!");
                jogando = false;
            } else if (tentativa > number){
                System.out.println("muito alto");
                System.out.println("quantidades restantes: "+quantidade);
            } else {
                System.out.println("muito baixo");
                System.out.println("quantidades restantes: "+quantidade);
            }
        }
        if (quantidade == 0){
            System.out.println("vc perdeu o numero era "+number);
        }
    }
}
