
public class SavingsAccount extends BankAccount {
	private double InterestRate;
	public SavingsAccount() {
		// TODO Auto-generated constructor stub
	}
	public double getInterestRate() {
		return InterestRate;
	}
	public void setInterestRate(double interestRate) {
		InterestRate = interestRate;
	}
	public double calculateInterest() {
		int Amount = getAccountBalance();
		return Amount*InterestRate;
	}
	public void makeWithdrawal(int Amount) {
		int Balance = getAccountBalance();
		if (Amount <= Balance) {
		Balance -= Amount;
		System.out.println("The new Account balance is " + Balance);
		setAccountBalance(Balance);	
		}
		}

}
