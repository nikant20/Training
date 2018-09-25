import java.util.ArrayList;

public class Bank {
	ArrayList<Customer> customerList = new ArrayList();
	
	long createPersonalCustomer(String name, String address, String homePhone, String workPhone) {
		long id;
		
		PersonalCustomer personalCustomer = new PersonalCustomer(name);
		personalCustomer.setAddress(address);
		personalCustomer.setHomePhone(homePhone);
		personalCustomer.setWorkPhone(workPhone);
		id = personalCustomer.getId();
		customerList.add(personalCustomer);
		
		return id;
	}
	
	long createCommercialCustomer(String name, String address, String contactPersonName, String contactPersonPhone) {
		long id;
		
		CommercialCustomer commercialCustomer = new CommercialCustomer(name);
		commercialCustomer.setAddress(address);
		commercialCustomer.setContactPerson(contactPersonName);
		commercialCustomer.setContactPersonPhone(contactPersonPhone);
		id = commercialCustomer.getId();
		customerList.add(commercialCustomer);
		
		return id;
	}
	
	boolean deposit(long cutomerId, double amount) {
		if(cutomerId>customerList.size()-1) {
			//System.out.println("Customer Not Found with id: "+cutomerId);
			return false;
		}
		else {
			customerList.get((int)cutomerId).account.balance += amount;
			customerList.get((int)cutomerId).account.transactions += "\nDeposit: "+amount;
			//System.out.println("Balance of Customer "+ cutomerId+" is: " + customerList.get((int)cutomerId).account.balance);
			return true;
		}
	}
	
	int withdraw(long cutomerId, double amount) {
		if(cutomerId>customerList.size()-1) {
			//System.out.println("Customer Not Found with id: "+cutomerId);
			return 0;
		}
		else {
			if(customerList.get((int)cutomerId).account.balance<amount) {
				//Not enough balance;
				return 1;
			}
			else {
				customerList.get((int)cutomerId).account.balance -= amount;
				customerList.get((int)cutomerId).account.transactions += "\nWithdraw: "+amount;
				//System.out.println("Balance : "+customerList.get((int)cutomerId).account.balance);
				return 2;
			}
		}
	}
	

	Customer getCustomer(long customerId) {
		if(customerId>customerList.size()-1) {
			//System.out.println("Customer Not Found with id: "+cutomerId);
			return null;
		}
		else return customerList.get((int)customerId);
	}
	
	double totalValues() {
		double val = 0.0;
		
		for(Customer cust: customerList) {
			val += cust.account.getBalance();
		}
		
		return val;
	}
}
