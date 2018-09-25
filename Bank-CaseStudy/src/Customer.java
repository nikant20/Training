import java.util.Date;

public class Customer {
	String name;
	long id;
	String address;
	Account account;
	static long idCounter = 0;
	
	public Customer(String name) {
		this.name = name;
		id = idCounter;
		idCounter++;
		account = new Account();
		account.accountNumber = Account.idCounter;
		account.balance = 0;
		account.accountOpened = new Date();
		Account.idCounter++;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}