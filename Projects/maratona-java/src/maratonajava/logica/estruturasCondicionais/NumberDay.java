package maratonajava.logica.estruturasCondicionais;

import java.util.Scanner;

public class NumberDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte number = 0;
        while (number < 1 || number > 7) {
        System.out.println("Enter number to day week (1 to 7)");
        number = scanner.nextByte();
        switch (number) {
            // char, int, byte, short, enum, String
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tue");
                break;
            case 4:
                System.out.println("Wed");
                break;
            case 5:
                System.out.println("Thu");
                break;
            case 6:
                System.out.println("Fri");
                break;
            case 7:
                System.out.println("Sat");
                break;
            default:
                System.out.println("invalid");
                break;
        }
        }
    }
}
