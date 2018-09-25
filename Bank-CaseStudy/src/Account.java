import java.util.Date;

public class Account {
	long accountNumber;
	double balance;
	Date accountOpened;
	String transactions = "";
	static long idCounter = 100;
	
	void deposit(double bal) {
		balance += bal;
	}
	
	void withdraw(double bal) {
		balance -= bal;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public Date getAccountOpened() {
		return accountOpened;
	}

	public String getTransactions() {
		return transactions;
	}
}
