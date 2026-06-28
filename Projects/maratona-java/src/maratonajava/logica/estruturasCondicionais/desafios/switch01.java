package maratonajava.logica.estruturasCondicionais.desafios;

import java.util.Scanner;

public class switch01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte day = 0;
        while (day <1 || day > 7) {
            System.out.println("choose a day week");
            day = scanner.nextByte();
            switch (day) {
                case 1:
                case 7:
                    System.out.println("weekend");
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    System.out.println("business day");
                    break;
                default:
                    System.out.println("invalid option");
                    break;
            }
            }
        }
    }

