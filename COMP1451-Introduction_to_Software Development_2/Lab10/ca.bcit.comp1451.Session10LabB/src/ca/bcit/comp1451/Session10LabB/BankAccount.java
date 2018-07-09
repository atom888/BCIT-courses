/**
 * 
 */
package ca.bcit.comp1451.Session10LabB;

/**
 * @author adamdipinto
 *
 */
public class BankAccount {
	private String name;
	private double balance;
	/**
	 * @param name
	 * @param balance
	 */
	public BankAccount(String name, double balance) {
		setName(name);
		setBalance(balance);
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
			this.name = "unknown name";
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
		if (balance > 0) {
			this.balance = balance;
		}
	}
	
	public void deposit(double amount) throws NegativeAmountException {
		if (amount >= 0) {
			double newBalance = balance + amount;
			setBalance(newBalance);
		} else {
			throw new NegativeAmountException("Invalid value for deposit");
		}
	}
	
	public void withdraw(double amount) throws InsufficientFundsException {
		double currentBalance = getBalance();
		if (amount <= 0 && (amount <= currentBalance)) {
			double withdrawalAmount = currentBalance + amount;
			setBalance(withdrawalAmount);
		} else {
			throw new InsufficientFundsException("Invalid value for withdrawal");
		}
	}
	
	@Override
	public String toString() {
		String result = "";
		return result;
		
	}
	
	

}
