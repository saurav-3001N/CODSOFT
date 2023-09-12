package codSoft;
import java.util.Scanner;
// crate a bankAccount to represent user's bank account
class bankAccount {
	private double balance;
	//Constructor to initialize the balance
	public bankAccount (double initialBalance) {
		this.balance= initialBalance;
		
	}
	public void withdraw(double amount) {
		if (amount <= 0) {
			System.out.println("Invalid withdrawl amount.");
			return;
		}
		if (balance >= amount) {
			balance -= amount;
			System.out.println("Withdrawl successful1 collect your money.");
			
		}
		else {
			System.out.println("Insufficient balance.");
			
		}
	}
	public void deposit (double amount) {
		if (amount <= 0) {
			System.out.println("Invalid deposit amount.");
			return;
		}
		balance += amount;
		System.out.println("Your money has been successfully deposited.");
		
	}
	public double checkBalnace() {
		return balance;
	}
}

public class ATM {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		bankAccount atm = new bankAccount(10000);
		
		while(true) {
			System.out.println("Welcome to our ATM Machine");
			System.out.println("1.  Withdraw");
			System.out.println("2.  Deposit");
			System.out.println("3.  Check Balance");
			System.out.println("4.  Exit");
			System.out.println("choose an option (1/2/3/4):");
			 int choice = scanner.nextInt()
;
			 switch (choice) {
			 case 1:
				 System.out.print("Enter withdraw amount:");
				 double withdrawAmount = scanner.nextDouble();
				 atm.withdraw(withdrawAmount);
				 break;
				 
			 case 2:
				 System.out.print("Enter deposite amount:");
				 double depositAmount = scanner.nextDouble();
				 atm.deposit(depositAmount);
				
				 break;
			 
			 case 3:
				 double accountBalance = atm.checkBalnace();
				 System.out.println("Your current Balance:"+ accountBalance);
				 break;
				 
			 case 4:
				 System.out.println("Thank you for using our ATM Machine. Have a good day!");
				 scanner.close();
				 System.exit(0);
				 
				 default:
					 System.out.println("Invalid option. Please select a valid option (1/2/3/4).");
				 
			 }
			 
		
		}

	}

}
