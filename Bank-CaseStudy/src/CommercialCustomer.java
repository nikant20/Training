
public class CommercialCustomer extends Customer{
	String contactPersonName;
	String contactPersonPhone;

	public CommercialCustomer(String name) {
		super(name);
	}

	public String getContactPerson() {
		return contactPersonName;
	}

	public void setContactPerson(String contactPersonName) {
		this.contactPersonName = contactPersonName;
	}

	public String getContactPersonPhone() {
		return contactPersonPhone;
	}

	public void setContactPersonPhone(String contactPersonPhone) {
		this.contactPersonPhone = contactPersonPhone;
	}
}
