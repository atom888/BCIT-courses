/**
 * 
 */
package ca.bcit.comp1451.session4LabB;

import java.util.HashMap;



/**
 * @author adamdipinto
 *
 */
public class BankAccount {
	
	private double balance;
	private final static double INTEREST = 1.05; 
	private final static double DEFAULT_BALANCE = 0.0;
	private String name;
	private static HashMap<String, Double> userAccount;
	
	public BankAccount(String name, double balance) {
		setName(name);
		setBalance(balance);
		setUserAccount(new HashMap<String, Double>());
		
	}
	
	public BankAccount(String name) {
		setName(name);
		balance = DEFAULT_BALANCE;
		setUserAccount(new HashMap<String, Double>());
	}
	
	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		if (balance >= 0) {
			this.balance = balance;
		} else {
			this.balance = DEFAULT_BALANCE;
		}
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
		} else {
			System.out.println("The name provided was not valid");
		}
		
	}
	
	public void deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
			setBalance(balance);
		} else {
			System.out.println("The amount provided was not valid");
		}
	}
	
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance = balance - amount;
			setBalance(balance);
		} else {
			System.out.println("The amount provided was not valid");
		}
	}
	
	public void applyInterest() {
		balance = (balance * INTEREST); 
	}

	public static HashMap<String, Double> getUserAccount() {
		
		return userAccount;
	}

	public static void setUserAccount(HashMap<String, Double> userAccount) {
		if (userAccount != null) {
			BankAccount.userAccount = userAccount;
		}
		
	}
	

}
