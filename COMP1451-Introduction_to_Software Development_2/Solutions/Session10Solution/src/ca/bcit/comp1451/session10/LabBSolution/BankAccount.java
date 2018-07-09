/**
 * 
 */
package ca.bcit.comp1451.session10.LabBSolution;

/**
 * @author Rana
 *
 */
public class BankAccount {
	private String name;
	private double balance;

	public BankAccount(String name, double balance){
		setName(name);
		setBalance(balance);
	}
	
	public BankAccount() {
		
	 name = "unknown name";
	 balance = 0.0;
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
		if(name != null && name.length() > 1){
			this.name = name;
		}
		else{
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
		if(balance >0){
			this.balance = balance;
		}

	}
	/**
	 * 
	 * @param amount
	 * @throws NegativeAmountException if parameter was negative
	 */
	public void deposit(double amount) throws NegativeAmountException
	{
		if(amount >0 ){
			balance += amount;
		}
		else{
			throw new NegativeAmountException("the passed amount was negative");
		}
	}
	/**
	 * 
	 * @param amount
	 * @throws InsufficientFundException if parameter was  greater than balance
	 * @throws NegativeAmountException if  parameter was negative
	 */
	public void withdraw (double amount) throws InsufficientFundException,
												NegativeAmountException{
		if(amount < 0 ) {
			throw new NegativeAmountException("amount cannot be negative");
		}
		else if(amount < balance) {
			throw new InsufficientFundException(" Insuffecient fund");
		}
		else{
			balance -= amount;
		}	
	}

	@Override 
	public String toString(){
		return "the name is " + name + " the balance is " + balance;
	}
}




