/**
 * 
 */
package ca.bcit.comp1451.session04LabBSolution;

/**
 * @author Rana
 *
 */
public class BankAccount {
	 public static final double INTEREST_RATE = 0.05;
	 private String name;
	 private double balance;
	 
	 /**
	 * @param name
	 * @param balance
	 */
	public BankAccount(String name, double balance){
		 setName(name);
		 setBalance(balance);
	 }

	/**
	 * @param name
	 */
	public BankAccount(String name){
		setName(name);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	 
	/**
	 * @param name
	 */
	public void setName(String name) {
		if(name != null && name.length() > 1){
		this.name = name;
		}
		else{
			name = "unknown";
		}
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
		if(balance >0){
		this.balance = balance;
		}
	}
		
	/**
	 * apply Interest method()
	 */
	public void applyInterest(){
			balance += (balance * INTEREST_RATE);
		}
		


	public void deposit(double amount){
		if(amount >  0){
			balance += amount;
		}
	}

	public void withdraw(double amount){
		if(amount > 0 && amount <= balance){
			balance -= amount;
		}
	}
	}
	 
	 


