package problems2;

public class SavingsAccount extends Account {

	 private double interestRate;

	    public SavingsAccount(String accountNumber, double interestRate) {
	        super(accountNumber);
	        this.interestRate = interestRate;
	    }

	    public double calculateInterest() {
	        return balance * interestRate / 100.0;
	    }
}
