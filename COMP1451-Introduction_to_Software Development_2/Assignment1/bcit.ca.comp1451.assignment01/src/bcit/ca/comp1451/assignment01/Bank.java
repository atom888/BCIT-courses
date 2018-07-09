/**
 * 
 */
package bcit.ca.comp1451.assignment01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;


/**
 * @author adamdipinto
 *
 */
public class Bank {
	private static Scanner input;
	private String bankName;
	private static HashMap<String, Account> accountObject;
	
	private static final int DEFAULT_DAY = 1;
	private static final int DEFAULT_MONTH = 1;
	private static final int DEFAULT_YEAR = 1900;
	
	public Bank(String bankName, HashMap<String, Account> accountObject) {
		setBankName(bankName);
		accountObject = new HashMap<String, Account>(); 
		setAccountObject(accountObject);
		input = new Scanner(System.in);
	}

	/**
	 * @return the bankName
	 */
	public String getBankName() {
		return bankName;
	}

	/**
	 * @param bankName the bankName to set
	 */
	public void setBankName(String bankName) {
		if (bankName != null && !bankName.trim().isEmpty()) {
			this.bankName = bankName;
		} else {
			throw new IllegalArgumentException("Bank Name can not be null");
		}
		
	}

	/**
	 * @return the accountObject
	 */
	public HashMap<String, Account> getAccountObject() {
		return accountObject;
	}

	/**
	 * @param accountObject the accountObject to set
	 */
	public void setAccountObject(HashMap<String, Account> accountObject) {
		if (accountObject != null) {
			Bank.accountObject = accountObject;
		} else {
			throw new IllegalArgumentException("Account Object can not be null");
		}
		
	}
	
	public void addAccount(Account toadd) {
		if (toadd != null) {
			accountObject.put(toadd.getAccountNumber(), toadd);
		}
	}
	
	public Account getAccount(String accountNumber) {
		Account account = null;
		Set<Map.Entry<String, Account>> accountSet = accountObject.entrySet();
		for (Entry<String, Account> a : accountSet) {
			if (a.getKey().equals(accountNumber)) {
				account = a.getValue();
			}
		}
		return account;
	}
	
	public void showTransactions(String name) {
		ArrayList<Account> list = new ArrayList<Account>();
		Set<Map.Entry<String, Account>> accountSet = accountObject.entrySet();
		for (Entry<String, Account> a : accountSet) {
			if (a.getValue().getCustomer().equals((name))) {
				list.add(a.getValue());
			} else {
				throw new IllegalArgumentException("The customer with that name was not found");
			}
		}
		System.out.println("All transactions for "+name);
		System.out.println(list);
		System.out.println("===========================");
	}
	
	public void displayAccountNumbers() {
		ArrayList<String> list = new ArrayList<String>();
		Set<Map.Entry<String, Account>> accountSet = accountObject.entrySet();
		for(Entry<String, Account> a : accountSet) {
			list.add(a.getKey());
		}
		System.out.println("All Account Numbers available:");
		System.out.println(list);
		System.out.println("=============================");
	} 
	
	public void displayCustomerInfo(Customer name) {
		ArrayList<Account> list = new ArrayList<Account>();
		Set<Map.Entry<String, Account>> accountSet = accountObject.entrySet();
		for (Entry<String, Account> a : accountSet) {
			if (a.getValue().getCustomer().equals((name))) {
				list.add(a.getValue());
			} else {
				throw new IllegalArgumentException("The customer with that name was not found");
			}
		}
		System.out.println("All transactions for "+name);
		System.out.println(list);
		System.out.println("===========================");
	} 
	
	public static void makeTransaction() {
		String quit = "";
		TransactionRecord tr;
		
		do {
			System.out.println("Please provide an account number");
			if (input.hasNextInt()) {
				Integer accountNumber = input.nextInt();
				input.nextLine();
				String accountNumberString = Integer.toString(accountNumber);

					if (accountObject.containsKey(accountNumberString)) {
						System.out.println("===========================");
						System.out.println("1. Deposit");
						System.out.println("2. Withdraw");
						System.out.println("3. Show Transactions");
						System.out.println("===========================");
					} else {
						System.out.println("It appears that account number was not found.");
						System.out.println("===========================");
						break;
					}
					
					if (input.hasNextInt()) {
						Integer number = input.nextInt();
						if (number == 1) {
							input.nextLine();
							double depositValue = 0.0;
							System.out.println("How much would you like to deposit?");
							if (input.hasNextInt()) {
								depositValue = input.nextInt();
							} else {
								System.out.println("That was not a valid response");
							}
							accountObject.get(accountNumberString).deposit(depositValue);
							System.out.println("Your current balance is now: " + accountObject.get(accountNumberString).getBalance());
							
							input.nextLine();
							int day = DEFAULT_DAY;
							int month = DEFAULT_MONTH;
							int year = DEFAULT_YEAR;
							System.out.println("Please provide a day");
							if (input.hasNextInt()) {
								day = input.nextInt();
							} else if (input.hasNextDouble()) {
								System.out.println("That was not a valid response");
							} else {
								System.out.println("That was not a valid response");
							}
							input.nextLine();
							System.out.println("Please provide a month");
							if (input.hasNextInt()) {
								month = input.nextInt();
							} else if (input.hasNextDouble()) {
								System.out.println("That was not a valid response");
							} else {
								System.out.println("That was not a valid response");
							}
							input.nextLine();
							System.out.println("Please provide a year");
							if (input.hasNextInt()) {
								year = input.nextInt();
							} else if (input.hasNextDouble()) {
								System.out.println("That was not a valid response");
							} else {
								System.out.println("That was not a valid response");
							}
							Date date = new Date(day, month, year);
							accountObject.get(accountNumberString).setDate(date);
							double balance = accountObject.get(accountNumberString).getBalance();

							tr = new TransactionRecord(balance, date, accountNumberString, "Deposit");
							
							accountObject.get(accountNumberString).addTransaction(tr);
							
						} else if (number == 2) {
							input.nextLine();
							double withdrawValue = 0.0;
							System.out.println("How much would you like to withdraw?");
							if (input.hasNextInt()) {
								withdrawValue = (double)input.nextInt();
							} else if (input.hasNextDouble()) {
								withdrawValue = input.nextInt();
							} else {
								System.out.println("That was not a valid response");
							}
							accountObject.get(accountNumberString).withdraw(withdrawValue);
							System.out.println("Your current balance is now: " + accountObject.get(accountNumberString).getBalance());
							
							input.nextLine();
							int day = DEFAULT_DAY;
							int month = DEFAULT_MONTH;
							int year = DEFAULT_YEAR;
							System.out.println("Please provide a day");
							if (input.hasNextInt()) {
								day = input.nextInt();
							} else if (input.hasNextDouble()) {
								System.out.println("That was not a valid response");
							} else {
								System.out.println("That was not a valid response");
							}
							input.nextLine();
							System.out.println("Please provide a month");
							if (input.hasNextInt()) {
								month = input.nextInt();
							} else if (input.hasNextDouble()) {
								System.out.println("That was not a valid response");
							} else {
								System.out.println("That was not a valid response");
							}
							input.nextLine();
							System.out.println("Please provide a year");
							if (input.hasNextInt()) {
								year = input.nextInt();
							} else if (input.hasNextDouble()) {
								System.out.println("That was not a valid response");
							} else {
								System.out.println("That was not a valid response");
							}
							Date date = new Date(day, month, year);
							
							accountObject.get(accountNumberString).setDate(date);
							double balance = accountObject.get(accountNumberString).getBalance();

							tr = new TransactionRecord(balance, date, accountNumberString, "Withdraw");
							
							accountObject.get(accountNumberString).addTransaction(tr);


						} else if (number == 3) {
							String nameFormatted = "";
							
							System.out.println("What is your name?");
							if (input.hasNextInt()) {
								System.out.println("That was not a valid response");
							} else if (input.hasNextDouble()) {
								System.out.println("That was not a valid response");
							} else {
								if (input.hasNext()) {
									String name = input.next();
									nameFormatted = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
									
									if (accountObject.get(accountNumberString).getCustomer().getName().equals(nameFormatted)) {
										Set<Map.Entry<String, Account>> list = accountObject.entrySet();
										for (Entry<String, Account> l : list) {
											for (int index = 0; index < l.getValue().getTransactionRecords().size(); index++) {
												System.out.println("===========================");
												System.out.println("Transaction: ");
												System.out.println("Amount: " + l.getValue().getTransactionRecords().get(index).getAmount());
												System.out.println("Date: " + l.getValue().getTransactionRecords().get(index).getDate().getDay() + "/" + l.getValue().getTransactionRecords().get(index).getDate().getMonth() + "/" + l.getValue().getTransactionRecords().get(index).getDate().getYear());
												System.out.println("===========================");
											}
										}
									} else {
										System.out.println("That user can not be found");
									}
								}
							}		
						}
					} else {
						System.out.println("Please provide a valid response");
					}
				
			} else {
				System.out.println("Please provide a valid account number");
			}
			
			System.out.println("Would like to like to create another transaction? yes or no");
			quit = input.next();
			quit.toLowerCase();
		} while (quit.equals("yes")); 
		System.out.println("Thank you!");
		System.exit(0);
	}

	
}
