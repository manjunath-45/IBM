package problems2;

import java.util.Vector;

public class BankDatabase {

	private Vector<Account> accounts;

    public BankDatabase() {
        accounts = new Vector<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void deposit(String accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdraw(String accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            if (account.withdraw(amount)) {
                System.out.println("Amount withdrawn successfully.");
            } else {
                System.out.println("Insufficient balance. Cannot withdraw the specified amount.");
            }
        } else {
            System.out.println("Account not found.");
        }
    }

    public double getBalance(String accountNumber) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            return account.getBalance();
        } else {
            System.out.println("Account not found.");
            return 0.0;
        }
    }

    private Account findAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.accountNumber.equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
	
}
