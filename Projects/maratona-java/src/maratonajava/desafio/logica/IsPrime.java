package maratonajava.desafio.logica;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int choice = 1;
        boolean result;
        boolean inside = true;
        while (inside){
            System.out.println("press 1 Choose a number");
            System.out.println("press 0 to exit");
            choice = scanner.nextInt();
             switch (choice){
                 case 1 :
                     System.out.println("Choose a number");
                     number = scanner.nextInt();
                     result = true;
                     if (number < 2){
                         result = false;
                     }
                     if (result) {
                         for (int i = 2; i <= number - 1; i++) {
                             if (number % i == 0) {
                                 result = false;
                                 break;
                             }
                         }
                     }
                     if (result) {
                         System.out.println("prime");
                         break;
                     } else {
                         System.out.println("not prime");
                         break;
                     }
                 case 0:
                     System.out.println("Exit...");
                     inside = false;
                     break;
                 default:
                     System.out.println("not valid");
                     break;
             }
        }
    }
}
