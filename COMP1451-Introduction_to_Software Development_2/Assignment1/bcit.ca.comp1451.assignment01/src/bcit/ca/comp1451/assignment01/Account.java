/**
 * 
 */
package bcit.ca.comp1451.assignment01;

import java.util.ArrayList;

/**
 * @author adamdipinto
 *
 */
public class Account {
	public static int uniqueNumber = 1000;
	public static String DEPOSIT = "deposit";
	public static String WITHDRAW = "withdraw";
	
	private Customer customer;
	private String accountNumber;
	private Date date;
	private double balance;
	private ArrayList<TransactionRecord> transactionRecords;
	
	
	public Account(Customer customer, Date date, double balance) {
		setCustomer(customer);
		accountNumber = Integer.toString(setUniqueNumber());
		setAccountNumber(accountNumber);
		setDate(date);
		setBalance(balance);
		transactionRecords = new ArrayList<TransactionRecord>();

		
	}

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
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
		this.balance = balance;
	}

	/**
	 * @return the transactionRecords
	 */
	public ArrayList<TransactionRecord> getTransactionRecords() {
		return transactionRecords;
	}

	/**
	 * @param transactionRecords the transactionRecords to set
	 */
	public void setTransactionRecords(ArrayList<TransactionRecord> transactionRecords) {
		this.transactionRecords = transactionRecords;
	}
	
	private int setUniqueNumber() {
		uniqueNumber++;
		return uniqueNumber;
	}
	
	public boolean deposit (double amount)  {
		boolean result = false;
		if (amount > 0) {
			balance += amount;
			TransactionRecord transactionRecord = new TransactionRecord(amount, getDate(), getAccountNumber(), DEPOSIT);
			addTransaction(transactionRecord);
			result = true;
		} else {
			System.out.println("Account was negative and not valid");
		}
		return result;
	}
	
	public boolean withdraw (double amount) {
		boolean result = false;
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			TransactionRecord transactionRecord = new TransactionRecord(amount, getDate(), getAccountNumber(), WITHDRAW);
			addTransaction(transactionRecord);
			result = true;
		} else if (amount < 0 || amount > balance){
			System.out.println("Amount was negative and not valid");
		}
		return result;
	}
	
	public void addTransaction(TransactionRecord theTransactionRecord) {
		if (theTransactionRecord != null) {
			transactionRecords.add(theTransactionRecord);
		} else {
			System.out.println("The Transaction record can not be null");
		}
	}
	
	public void displayAccountInfo() {
		int day = getDate().getDay();
		int month = getDate().getMonth();
		int year = getDate().getYear();
		
		System.out.println("Name: " + getCustomer().getName());
		System.out.println("Bank Account: " + getAccountNumber());
		System.out.println("Current Balance: " + getBalance());
		System.out.println("Date of Transaction: " + getDate().displayStructuredDate(day, month, year));		
	}
	
}
