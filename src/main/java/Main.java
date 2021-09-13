import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner Option = new Scanner(System.in);
	int Opt = -1;
	while(Opt != 0)
	{
	System.out.println("Welcome to Salar Abbas Islamic Banking Limited.");
	System.out.println("Please select any of the options below to get going.");
	System.out.println("/////////-////////");
	System.out.println("1) -> Open a new Account.");
	System.out.println("2) -> Login to an Already existing account.");
	System.out.println("3) -> Specify the Interest rate for all Savings Accounts");
	System.out.println("4) -> Display the details of all Existing Bank accounts");
	System.out.println("5) -> Display all deductions along with account Details.");
	System.out.println("6) -> Exit");
	Opt = Option.nextInt();
	if(Opt == 1) {
		Scanner Detail = new Scanner(System.in);
		String SName;
		String SAdd;
		String SP;
		int k = 0;
		System.out.println("Enter You Name");
		SName = Detail.nextLine();
		Customer C = new Customer();
		C.setName(SName);
		System.out.println("Enter Your Address");
		SAdd = Detail.nextLine();
		C.setAddress(SAdd);
		System.out.println("Enter Your Phone Number");
		SP = Detail.nextLine();
		C.setAddress(SP);
		System.out.println("Do you want a checkings or savings Account?");
		System.out.println("1) -> Checkings Account");
		System.out.println("2) -> Savings Account");
		k = Detail.nextInt();
		if(k == 1) {
		C.A.setName(SName);
		C.A.setPhoneNumber(SP);
		}
		if(k == 2) {
			C.S.setName(SName);
			C.S.setPhoneNumber(SP);
			
		}
	
	}
	if(Opt == 2) {
	
	}
	if(Opt == 3) {
	
	}
	
	if(Opt == 4) {
	
	}
	if(Opt == 5) {
		
	}
	if(Opt == 6)
	{
		System.out.println("Allah Hafiz, Salar Abbas Islamic Banking thanks you for giving her the pleasure of your service.");
		Opt = 0;
	}
	
	
}
}
}
