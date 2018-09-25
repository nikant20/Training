import java.util.Scanner;

public class TestBank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank bank  = new Bank();
		
		System.out.println("Please Select an item");
		System.out.println("1. Personal Customer");
		System.out.println("2. Commercial Customer");
		System.out.println("3. Deposit");
		System.out.println("4. Withdraw");
		System.out.println("5. Display Customer");
		System.out.println("6. Display Total Value");
		System.out.println("7. Exit");
		System.out.print("\nYour Choice: ");
		
		int item = sc.nextInt();
		
		while(item!=7) {
			switch (item) {
			case 1:
				System.out.print("Enter Customer Name: ");
				String name = sc.next();
				
				System.out.print("Enter Customer address: ");
				String address = sc.next();
				
				System.out.print("Enter Customer homePhone: ");
				String homePhone = sc.next();
				
				System.out.print("Enter Customer workPhone: ");
				String workPhone = sc.next();
				
				long id = bank.createPersonalCustomer(name, address, homePhone, workPhone);
				System.out.println("Personal Customer Created with ID: "+id);
				break;
				
			case 2:
				System.out.print("Enter Customer Name: ");
				name = sc.next();
				
				System.out.print("Enter Customer address: ");
				address = sc.next();
				
				System.out.print("Enter Customer homePhone: ");
				String contactPersonName = sc.next();
				
				System.out.print("Enter Customer homePhone: ");
				String contactPersonPhone = sc.next();
				
				id = bank.createCommercialCustomer(name, address, contactPersonName, contactPersonPhone);
				System.out.println("Commercial Customer Created with ID: "+id);
				
				break;
			
			case 3:
				System.out.print("Enter Customer ID: ");
				id = sc.nextLong();
				System.out.print("Enter Amount to be deposited: ");
				Double amount = sc.nextDouble();
				
				Boolean bool = bank.deposit(id, amount);
				if(bool)		System.out.println("Deposit Success.");
					else		System.out.println("Customer not found with ID: "+id);
				
				break;
			
			case 4:
				System.out.print("Enter Customer ID: ");
				id = sc.nextLong();
				System.out.print("Enter Amount to be withdrawn: ");
				amount = sc.nextDouble();
				
				int res = bank.withdraw(id, amount);
				
				if(res==0) {
					System.out.println("Customer not found with ID: "+id);
				}else if(res == 1) {
					System.out.println("Error in withdraw: Not Enough balance");
				}else if(res == 2) {
					System.out.println("Withdraw Success.");
				}
				
				break;
			
			case 5:
				System.out.print("Enter Customer ID: ");
				id = sc.nextLong();
				
				Customer cust = bank.getCustomer(id);
				
				if(cust != null) {
					System.out.println("\nName: "+cust.name);
					System.out.println("ID:   "+cust.id);
					System.out.println("Account Number: "+cust.account.getAccountNumber());
					System.out.println("Account Created on: "+cust.account.accountOpened.toString());
					System.out.println("Account Balance: "+cust.account.getBalance());
					System.out.println("Transaction Details: "+cust.account.getTransactions());
				}
				else {
					System.out.println("Customer not found with ID: "+id);
				}
				
				break;
			
			case 6:
				amount = bank.totalValues();
				System.out.println("Total Value: "+amount);
				
				break;

			default:
				break;
			}
			System.out.print("\nYour Choice: ");
			item = sc.nextInt();
		}
		
		System.out.println("Thank You!");
	}
}
