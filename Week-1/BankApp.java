import java.util.Scanner;

class Account {
    private String accountHolder;
    private int balance;

    Account(String name, int bal) {
        accountHolder = name;
        balance = bal;
    }

    void deposit(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid deposit amount");
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(int amount) {
        if (amount > balance) {
            throw new ArithmeticException("Insufficient balance");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    void showBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account acc = new Account("Ayush", 2000);

        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");

        int choice = sc.nextInt();

        try {
            if (choice == 1) {
                System.out.print("Enter amount: ");
                acc.deposit(sc.nextInt());
            }
            else if (choice == 2) {
                System.out.print("Enter amount: ");
                acc.withdraw(sc.nextInt());
            }
            else {
                System.out.println("Invalid choice");
            }

            acc.showBalance();
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
