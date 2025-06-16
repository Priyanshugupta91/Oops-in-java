import java.util.ArrayList;

class Account {
    String accountNumber;
    double balance;

    Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    void display() {
        System.out.println("Account: " + accountNumber + ", Balance: " + balance);
    }
}

public class Bank {
    ArrayList<Account> accounts = new ArrayList<>();

    void addAccount(Account acc) {
        accounts.add(acc);
    }


    public static void main(String[] args) {
        Bank bank = new Bank();
        Account a1 = new Account("A101");
        a1.deposit(1000);
        a1.withdraw(200);
        bank.addAccount(a1);

        for (Account a : bank.accounts) {
            a.display();
        }
    }
}