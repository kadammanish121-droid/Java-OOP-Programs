import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextInt();

        System.out.print("Enter Account Holder Name: ");
        accountHolderName = sc.next();

        System.out.print("Enter Balance: ");
        balance = sc.nextDouble();
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount();

        System.out.println("Enter details of Account 1:");
        b1.accept();

        System.out.println("\nEnter details of Account 2:");
        b2.accept();

        System.out.println("\nAccount 1 Details:");
        b1.display();

        System.out.println("\nAccount 2 Details:");
        b2.display();
    }
}