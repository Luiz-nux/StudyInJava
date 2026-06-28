package desafios.javacore.oo.AiDesafios.tthis.domain;

public class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }
    public BankAccount (double balance){
        this.balance = balance;
    }

    public void withdraw(double amount) {
        boolean inside = true;
            if (amount < 0) {
                System.out.println("invalid value");
            } else if (amount <= balance) {
                this.balance -= amount;
                System.out.println("your balance is " + balance);
                inside = false;
            } else {
                System.out.println("your withdraw is bigger the balance");
            }
    }

    public void deposit (double amount) {
        if (amount < 0){
            System.out.println("invalid value");
        } else {
            this.balance += amount;
            System.out.println("your balance is " + balance);
        }
    }

    public void transfer (BankAccount receive, double amount) {
        if (amount < 0) {
            System.out.println("invalid value");
        } else if (this.balance < amount){
            System.out.println("invalid number");
        } else {
            this.balance -= amount;
            receive.balance += amount;
            System.out.println("your balance " +this.balance);
            System.out.println("other account " + receive.balance);
        }
    }
}
