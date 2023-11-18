import java.util.Scanner;

public class BankingApplication {
	public static void main(String[] args) {
		BankAccount obj = new BankAccount("Daria", "101010");
		obj.ShowMenu();
	}
}
class BankAccount{
	int balance;
	int previousTransaction;
	String custumerName;
	String custumerId;
	
	 BankAccount(String tName, String tId) {
		 custumerName = tName;
		 custumerId = tId;
	}
	
	void deposit(int ammount) {
		if (ammount != 0) {
			balance = balance + ammount;
			previousTransaction = ammount;
		}
	}
	void withdraw(int ammount) {
		if (ammount != 0) {
			balance = balance - ammount;
			previousTransaction = -ammount;
		}
	}
	void getPreviousTransaction() {
		if(previousTransaction > 0) {
			System.out.println("Deposited: " + previousTransaction); 
		}
		else if(previousTransaction < 0) {
			System.out.println("Withdraw: " + Math.abs(previousTransaction));
		}
		else {
			System.out.println("No Transaction Occured.");
		}
	}
	void ShowMenu() {
		char option = '\0';
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome " + custumerName);
		System.out.println("Your ID is " + custumerId);
		System.out.println("\n");
		
		System.out.println("A : Check Your Balance");
		System.out.println("B : Deposit");
		System.out.println("C : Withdraw");
		System.out.println("D : Previous Transaction");
		System.out.println("E : Exit");
		
		do {
			System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
			System.out.println("Enter Your Option");
			System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
			option = scanner.next().charAt(0);
			
			System.out.println("\n");
			
			switch(option) {
			case 'A':
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("Balance = " + balance);
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("\n");
				break;
				
			case 'B':
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("Enter an ammount to deposit " + balance);
				System.out.println("--------------------------------------------------------------------------------");
				
				int ammount = scanner.nextInt();
				deposit(ammount);
				System.out.println("\n");
				break;
				
			case 'C':
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("Enter an ammount to withdraw " + balance);
				System.out.println("--------------------------------------------------------------------------------");
				
				int ammount2 = scanner.nextInt();
				withdraw(ammount2);
				System.out.println("\n");
				break;
				
			case 'D':
				System.out.println("--------------------------------------------------------------------------------");
				getPreviousTransaction();
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("\n");
				break;
				
			case 'E':
				System.out.println("================================================================================================================================================================================================================================================================================================================================================================");
				break;
				
			default:
				System.out.println("Invalid Option! Try again");
				break;
			}
		}
		while (option != 'E');
		System.out.println("Thank you for using our services :)"); 
	}
}