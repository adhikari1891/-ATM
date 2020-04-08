import java.util.Scanner;

public class BankingApplication {
	public static void main(String[] args) {

		BankAccount obj1 = new BankAccount("Pawan", "1234");
		obj1.showMenu();
	}
}

class BankAccount {
	int balance;
	int previousTransaction;
	String costumerName;
	String costumerId;

	BankAccount(String cname, String cid) {
		costumerName = cname;
		costumerId = cid;
	}

	void deposit(int amount) {

		if (amount != 0) {

			balance = balance + amount;
			previousTransaction = amount;
		}
	}

	void withdraw(int amount) {
		if (amount != 0) {
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}

	void getPreviousTransaction() {

		if (previousTransaction > 0) {
			System.out.println("Deposited: " + previousTransaction);
		} else if (previousTransaction < 0) {
			System.out.println("Withdrawn:" + Math.abs(previousTransaction));
		} else
			System.out.println("Error occured");
	}

	void showMenu() {
		char option = '\0';
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello " + costumerName);
		System.out.println("Your ID is " + costumerId);
		System.out.println("\n");
		System.out.println("So, " + costumerName + " how can I help you today?");
		System.out.println("\n");

		System.out.println("Below are the following options:");
		System.out.println("\n");

		System.out.println("A. To Check Balance");
		System.out.println("B. To Deposit");
		System.out.println("C. To Withdraw");
		System.out.println("D. To View Previous Transaction");
		System.out.println("E.Exit");
		System.out.println("F.What would you like to do today?");
		System.out.println("\n");


		do {
			System.out.println(
					"************************************************************************************************");
			System.out.println("Please! " + costumerName+ " enter an option below");
			
			
			System.out.println(
					"*************************************************************************************************");
			option = scanner.next().charAt(0);
			System.out.println("\n");

			switch (option) {

			case 'A':
				System.out.println(
						" #############################################################################################");
				System.out.println("Your balance is : " + balance);
				System.out.println(
						"#############################################################################################");
				System.out.println("\n");
				System.out.println("Would you like to:");
				System.out.println("B: Deposit");
				System.out.println("C: Withdraw");
				System.out.println("D: See Previous Transaction");
				System.out.println("Or Exit");




				break;

			case 'B':
				System.out.println("\n");
				System.out.println(" Enter an amount to deposit");
				System.out.println(
						"$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
				int amount = scanner.nextInt();
				deposit(amount);
				System.out.println("\n");
				System.out.println(" Your deposited amount was " + balance );

				System.out.println("Nice! Now you got other options as well!");
				System.out.println("A.Check Balance");
				System.out.println("C: Withdraw");
				System.out.println("D: See Previous Transaction");
				System.out.println("Or Exit");
				
			
				break;

			case 'C':
				System.out.println("\n");
				System.out.println("Enter an amount to withdraw:");
				System.out.println(
						"*************************************************************************************************");
				int amount2 = scanner.nextInt();
				withdraw(amount2);
				System.out.println("\n");
				System.out.println("You just withdrawed" + previousTransaction);
				System.out.println("Great! We got other options as well!");
				System.out.println("A.Check Balance");
				System.out.println("B:Deposit");
				System.out.println("D:Previous Transaction");
				System.out.println("E.Exit");
				
				break;

			case 'D':
				System.out.println(
						"************************************************************************************************");
				getPreviousTransaction();
				System.out.println(
						"&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
				System.out.println("Your previous transaction was" + previousTransaction);

				System.out.println("\n");
				
				break;

			case 'E':
				System.out.println(
						"*****************************************************************************************************");
				System.out.println("You just pressed Exit. GoodBye!!");

				break;

			default:
				System.out.println("Wrong. Enter again");
				break;
			}
		} while (option != 'E');
		System.out.println("Thank you for your services");
		System.out.println("Adios!");


	}
}
