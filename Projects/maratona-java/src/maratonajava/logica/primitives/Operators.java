package maratonajava.logica.primitives;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Whats your age?");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("whats your salary?");
        double salary = Double.parseDouble(scanner.nextLine());
        if (age > 30 && salary >= 4612) {
            System.out.println("your are within law");
        }else if (age < 30 && salary >= 3381){
            System.out.println("your are within law");
        } else {
            System.out.println("your are not within law");
        }
        // = += -= /= *= %=
        double bonus = 1800;
        bonus -= 500;
        bonus *= 2;
        bonus += 1000;

        System.out.println(bonus);
    }
}