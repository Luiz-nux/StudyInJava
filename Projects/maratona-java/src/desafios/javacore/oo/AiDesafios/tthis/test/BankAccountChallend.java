package desafios.javacore.oo.AiDesafios.tthis.test;

import desafios.javacore.oo.AiDesafios.tthis.domain.BankAccount;

import java.util.Scanner;

public class BankAccountChallend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account01 = new BankAccount(1800);
        BankAccount account02 = new BankAccount(5000);

        boolean inside = true;
        while (inside){
            System.out.println("1. balance");
            System.out.println("2. withdraw");
            System.out.println("3. deposit");
            System.out.println("4. deposit to other account");
            System.out.println("5. exit");
            int choose = scanner.nextInt();
            switch (choose){
                case 1:
                    System.out.println("your balance " + account01.getBalance());
                    break;
                case 2:
                    System.out.println("whats your withdraw?");
                    double whatWithdraw = scanner.nextDouble();
                    account01.withdraw(whatWithdraw);
                    break;
                case 3:
                    System.out.println("whats your deposit?");
                    double whatDeposit = scanner.nextDouble();
                    account01.deposit(whatDeposit);
                    break;
                case 4:
                    System.out.println("whats your deposit?");
                    double whatToDeposit = scanner.nextDouble();
                    account01.transfer(account02, whatToDeposit);
                    break;
                case 5:
                    inside = false;
                    System.out.println("bye...");
                    break;
                default:
                    System.out.println("invalid option");
                    break;
            }
        }
    }
}
