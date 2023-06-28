package problems2;

public class BankDatabaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BankDatabase bankDatabase = new BankDatabase();

	        SavingsAccount account1 = new SavingsAccount("A1001", 5.0);
	        SavingsAccount account2 = new SavingsAccount("A1002", 3.0);

	        bankDatabase.addAccount(account1);
	        bankDatabase.addAccount(account2);

	        bankDatabase.deposit("A1001", 5000);
	        bankDatabase.deposit("A1002", 10000);

	        bankDatabase.withdraw("A1001", 2000);
	        bankDatabase.withdraw("A1002", 15000);

	        double balance1 = bankDatabase.getBalance("A1001");
	        double balance2 = bankDatabase.getBalance("A1002");

	        System.out.println("Account A1001 balance: " + balance1);
	        System.out.println("Account A1002 balance: " + balance2);

	        double interest = account1.calculateInterest();
	        System.out.println("Interest earned on Account A1001: " + interest);
	}

}
