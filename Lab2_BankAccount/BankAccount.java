/* Project:	Lab2
 * Class:	BankAccount.java
 * Author:	Zachary Zuch
 * Date:	February 11, 2015
 * This class allows the transactions to work and save the name
 * of the user and the balance in the user's account.
 */

public class BankAccount implements Cloneable {

    private double balance;
    private String name;

    /**
     * Initializes the data fields for the account.
     *
     * @param name Name creating the account
     * @param balance Balance starting the account
     */
    public BankAccount(String name, double balance) {
        this.balance = balance;
        this.name = name;
    }

    /**
     * Deposits money from the account.
     *
     * @param amount amount of money to be deposited
     */
    public void deposit(double amount) {
        balance += amount;
        System.out.println();
        System.out.println("$" + amount + " was deposited");
    }

    /**
     * Withdraws money from the account.
     *
     * @param amount amount of money to be withdrawn
     * @precondition Must not overdraw the account balance >= amount
     */
    public void withdraw(double amount) {
        if (balance < amount) {
            System.out
                    .println("Unable to Withdraw that Amount Since It Will Overdraw the Account");
        } else {
            balance -= amount;
            System.out.println();
            System.out.println("$" + amount + " was withdrawn");
        }
    }

    public BankAccount clone() {
        BankAccount answer;
        try {
            answer = (BankAccount) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("This class doesn't implement cloneable.");
        }
        return answer;
    }

    /**
     * Prints the balance of the account and the name.
     */
    public void printReceipt() {
        System.out.println("Customer: " + name);
        System.out.println("Balance: $" + balance);
    }
}
