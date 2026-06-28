package maratonajava.javacore.Einicializationblock.aPaVeSePego.test;

import maratonajava.javacore.Einicializationblock.aPaVeSePego.domain.PaVeSePego;

import java.util.Scanner;

public class PaVeSePEgoTest {
    public static void main(String[] args) {
        PaVeSePego pego = new PaVeSePego("louis", 20);
        Scanner scanner = new Scanner(System.in);

        System.out.println("you approved?");
        System.out.println("1- yes");
        System.out.println("2- no");
        boolean choose = pego.choose(scanner.nextInt());
        if (choose){
            System.out.println("you enter in bill");
        } else {
            System.out.println("you not approved");
        }
    }
}
