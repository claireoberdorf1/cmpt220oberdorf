package lab8;

public class CheckingAccount extends Account {
	
	//Data fields
	private double overdraftLimit;

	//Default checking account object with overdraft limit
	public CheckingAccount() {
		overdraftLimit = 100;
	}

	//Creates a checking account with information
	public CheckingAccount(int id, double balance, double overdraftLimit) {
		super(id, balance);
		this.overdraftLimit = overdraftLimit;
	}

	//Overdraft limit
	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	//Withdraw from checking
	public void withdraw(double amount) {
		if (getBalance() - amount > overdraftLimit) {
			setBalance(getBalance() - amount);
		}
		else
			System.out.println("Exceeded overdraft limit.");
	}

	//String of checking account
	public String toString() {
		return super.toString() + "\nOverdraft limit: $" + String.format("%.2f", overdraftLimit);
	}
}
