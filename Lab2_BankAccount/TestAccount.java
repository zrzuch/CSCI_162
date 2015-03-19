/* Project:	Lab2
 * Class:	TestAccount.java
 * Author:	Zachary Zuch
 * Date:	February 11, 2015
 * This program is used to create an account and allows the user
 * to choose a type of transaction.
 */
import java.util.Scanner;

public class TestAccount {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double balance = 0;
		String a = "";
		String name = "";
		while (!(a.equals("Y") || a.equals("YES"))) {
			System.out.println("Enter Your Name:");
			name = input.nextLine();
			System.out.println("Enter A Balance (To Create the Account):");
			balance = input.nextDouble();
			System.out.println();
			System.out.println("Balance: $" + balance);
			System.out.println("Name: " + name);
			System.out.println();
			System.out.println("Is This Correct?(Yes or No)");
			a = input.next();
			a = a.toUpperCase();
		}
		BankAccount bank = new BankAccount(name, balance);
		transaction(input, bank);
		bank.printReceipt();
		input.close();
	}

	/**
	 * Allows the user to choose the desire type of transaction.
	 * 
	 * @param input
	 * @param bank
	 */
	public static void transaction(Scanner input, BankAccount bank) {
		double amount;
		int option = 0;
		while (!(option == 1 || option == 2)) {
			System.out.println("Enter 1 for Deposit or Enter 2 for Withdraw");
			option = input.nextInt();
			if (option == 1) {
				System.out.println("How Much Do You Wish to Deposit?");
				amount = input.nextDouble();
				bank.deposit(amount);
			} else if (option == 2) {
				System.out.println("How Much Do You Wish to Withdraw?");
				amount = input.nextDouble();
				bank.withdraw(amount);
			} else {
				System.out.println("Try Again");
			}
		}
		input.close();
	}
}