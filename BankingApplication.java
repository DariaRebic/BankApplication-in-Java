//This line imports the Scanner class from the java.util package. The Scanner class is used for taking user input.
import java.util.Scanner;

public class BankingApplication {
	public static void main(String[] args) {
		//an instance of the BankAccount class is created with the name obj and initialized
		BankAccount obj = new BankAccount("Daria", "101010");
		//The ShowMenu method of the BankAccount class is called on the obj instance.
		obj.ShowMenu();
	}
}
class BankAccount{
	//variables 
	int balance;
	int previousTransaction;
	String custumerName;
	String custumerId;

	//constructor, it initializes the customer name and customer ID when an object of this class is created
	 BankAccount(String tName, String tId) {
		 custumerName = tName;
		 custumerId = tId;
	}

	//method 
	void deposit(int ammount) {
		if (ammount != 0) {
			balance = balance + ammount;
			previousTransaction = ammount;
		}
	}
	//method 
	void withdraw(int ammount) {
		if (ammount != 0) {
			balance = balance - ammount;
			previousTransaction = -ammount;
		}
	}
	//method
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
	//method, represents the main menu of the banking application
	void ShowMenu() {
		char option = '\0'; 
		
		//the method initializes a Scanner object for user input
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome " + custumerName);
		System.out.println("Your ID is " + custumerId);
		System.out.println("\n");
		
		System.out.println("A : Check Your Balance");
		System.out.println("B : Deposit");
		System.out.println("C : Withdraw");
		System.out.println("D : Previous Transaction");
		System.out.println("E : Exit");

		//the method uses a do-while loop to repeatedly display the menu until the user chooses to exit
		do {
			System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
			System.out.println("Enter Your Option");
			System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
			// Menu display and input handling
			option = scanner.next().charAt(0);
			
			System.out.println("\n");
			
			switch(option) {
			// Menu options handling
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
		//closes the ShowMenu method and the BankAccount class.
		System.out.println("Thank you for using our services :)"); 
	}
}
