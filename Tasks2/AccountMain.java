import java.util.Scanner;

class Account {
    // account class with private data member

    private double balance; // private: keeps the balance hidden from the outside of the class

    // No-Argument constructor
    public Account() {
        this.balance = 0;
    }

    // constructor with initial balance
    public Account(double balance) {
        this.balance = balance;
    }

    // method to deposit money
    public void depositMoney(double amount) {
        if (amount > 0) {
            balance = balance + amount; // Add deposit amount to balance
            System.out.println("Deposited Amount: " + amount);
        } else {
            System.out.println("Deposit amount should be greater than zero"); // we cannot able to deposit lesser than zero                                                                          
        }
    }

    // method to withdraw money
    public void withdrawMoney(double amount) {
        if (amount <= balance) {
            balance = balance - amount; // subtracting withdraw amount from the balance
            System.out.println("Withdrawn amount: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            System.out.println("Withdraw amount should be greater than zero"); // we cannot able to withdraw lesser than zero
                                                                               
        }
    }

    // method to display current balance
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

// Main class to run the program
public class AccountMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // initial balance
        System.out.println("Enter the initial balance: ");
        double initialBalance = sc.nextDouble();

        // create account with initial balance
        Account acc = new Account(initialBalance); // though we have passed the argument in constructor class

        // Ask for deposit amount
        System.out.println("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        acc.depositMoney(depositAmount); // to perform deposit

        // Ask for withdrawal amount
        System.out.println("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        acc.withdrawMoney(withdrawAmount); // to perform withdraw

        // Display final balance
        acc.displayBalance();

        sc.close();
    }
}
