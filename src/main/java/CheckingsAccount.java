
public class CheckingsAccount extends BankAccount {

	public CheckingsAccount() {
		// TODO Auto-generated constructor stub
	}
public void makeWithdrawal(int Amount) {
	int Balance = getAccountBalance();
	if (Amount < Balance + 5001) {
	Balance -= Amount;
	System.out.println("The new Account balance is " + Balance);
	setAccountBalance(Balance);	
	}
	}
}
