
public class Customer {
private String Name;
private String PhoneNumber;
private String Address;
private int AccountNumber;
SavingsAccount S;
CheckingsAccount A;

	public Customer() {
		Name  = "";
		PhoneNumber= "";
		Address = "";
		AccountNumber = -1;
		S = new SavingsAccount();
		A = new CheckingsAccount();
	
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}

}
