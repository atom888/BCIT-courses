/**
 * 
 */
package bcit.ca.comp1451.assignment01;



/**
 * @author adamdipinto
 *
 */
public class TransactionRecord {
	
	public static final int ZERO = 0;
	public static final String WITHDRAW = "withdraw";
	public static final String DEPOSIT = "deposit";
	
	private double amount;
	private Date date;
	private String accountNumber;
	private String transactionType;

	public TransactionRecord(double amount, Date date, String accountNumber, String transactionType) {
		setAmount(amount);
		setDate(date);
		setAccountNumber(accountNumber);
		
	}
	
	public String formatTransaction(String transactionType) {
		String result = "";
		if(transactionType != null && !transactionType.trim().isEmpty()) {
			result = transactionType.toLowerCase();
		} else {
			throw new IllegalArgumentException("Transaction Type can not be null");
		}
		return result;
	}

	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		if (amount > ZERO) {
			this.amount = amount;
		} else {
			throw new IllegalArgumentException("Amount must be positive");
		}
		
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
		if (date != null) {
			this.date = date;
		} else {
			throw new IllegalArgumentException("Date can not be null");
		}
		
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
		if (accountNumber != null && !accountNumber.trim().isEmpty()) {
			this.accountNumber = accountNumber;
		} else {
			throw new IllegalArgumentException("Account Number can not be null");
		}
		
	}

	/**
	 * @return the transactionType
	 */
	public String getTransactionType() {
		return transactionType;
	}

	/**
	 * @param transactionType the transactionType to set
	 */
	public void setTransactionType(String transactionType) {
		if (transactionType != null && !transactionType.trim().isEmpty()) {
			if (formatTransaction(transactionType).equals("WITHDRAW")) {
				this.transactionType = transactionType;
			} else if (formatTransaction(transactionType).equals("DEPOSIT")) {
				this.transactionType = transactionType;
			} else {
				throw new IllegalArgumentException("Transaction type must be withdraw or deposit");
			}
		} else {
			throw new IllegalArgumentException("Transaction type can not be null");
		}
	}
	
	public String displayTransaction(String accountNumber, String transactionType, Date date) {
		
		String transaction = "Account Number: " + accountNumber + ", Transaction Type: " + transactionType + ", Date: " + date;
		
		return transaction;
	}
	
	

}
