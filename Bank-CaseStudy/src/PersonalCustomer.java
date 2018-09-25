
public class PersonalCustomer extends Customer{
	String homePhone;
	String workPhone;
	
	public PersonalCustomer(String name) {
		super(name);
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getWorkPhone() {
		return workPhone;
	}

	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}
}
