/**
 * 
 */
package ca.bcit.comp1451.Session10LabB;

import java.util.Scanner;

/**
 * @author adamdipinto
 *
 */
public class Bank {
	Scanner scanner;
	BankAccount account;
	/**
	 * @param scanner
	 * @param account
	 */
	public Bank(BankAccount account) {
		scanner = new Scanner(System.in);
		setAccount(account);
	}
	/**
	 * @return the account
	 */
	public BankAccount getAccount() {
		return account;
	}
	/**
	 * @param account the account to set
	 */
	public void setAccount(BankAccount account) {
		if (account != null) {
			this.account = account;
		}
		
	}
	
	public void processTransaction() {
		String newLine = System.getProperty("line.separator");
		boolean result = true;
		String quitValue = "";
		
		while (result) {
			System.out.println("Choose the transaction type:" + newLine + "1. deposit" + newLine + "2. withdraw" + newLine + "3. display information");
			if (scanner.hasNextInt()) {
				int numberSelection = scanner.nextInt();
				if (numberSelection == 1) {
					System.out.println("How much would you like to deposit?");
					if (scanner.hasNextDouble()) {
						double depositValue = scanner.nextInt();
						try {
							account.deposit(depositValue);
						} catch (NegativeAmountException e) {
							e.getMessage();
							e.printStackTrace();
						}
					} else if (scanner.hasNextInt()) { 
						double depositValue = scanner.nextInt();
						try {
							account.deposit(depositValue);
						} catch (NegativeAmountException e) {
							e.getMessage();
							e.printStackTrace();
						}
					} else {
						System.out.println("Please provide a valid response");
					}
				} else if (numberSelection == 2) {
					System.out.println("How much would you like to withdrawal?");
					if (scanner.hasNextDouble()) {
						double  withdrawValue = scanner.nextInt();
						try {
							account.withdraw(withdrawValue);
						} catch (InsufficientFundsException e) {
							e.getMessage();
							e.printStackTrace();
						}
					}  else if (scanner.hasNextInt()) { 
						double  withdrawValue = scanner.nextInt();
						try {
							account.withdraw(withdrawValue);
						} catch (InsufficientFundsException e) {
							e.getMessage();
							e.printStackTrace();
						}
					}  else {
						System.out.println("Please provide a valid response");
					}
				} else if (numberSelection == 3) {
					System.out.println("Account Holder: " + account.getName() + newLine + "Account Balance: " + account.getBalance());
					
				} else {
					System.out.println("Please provide a valid response");
				}
			} else {
				System.out.println("Please provide a valid response");
			}
			
			System.out.println("Would you like to make another transaction? (Y/N)");
			quitValue = scanner.next();
			quitValue.toUpperCase();
			if (quitValue.equals("y")) {
				result = false;
				System.out.print("Thank you!");
				System.exit(0);
			}
		}
	}
	
	
}
