/**
 * 
 */
package bcit.ca.comp1451.assignment01;

import java.util.HashMap;

/**
 * @author adamdipinto
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String firstName = args[0];
		String secondName = args[2];
		String thirdName = args[4];
		String fourthName = args[6];
	
		String firstAddress = args[1];
		String secondAddress = args[3];
		String thirdAddress = args[5];
		String fourthAddress = args[7];
		
		Date firstDateOfBirth = new Date(3,3,2000);
		Date secondDateOfBirth = new Date(11,11,2011);
		Date thirdDateOfBirth = new Date(24,6,1967);
		Date fourthDateOfBirth = new Date(13,8,2001);
		
		Customer firstCustomer = new Customer (firstName, firstAddress, firstDateOfBirth);
		Customer secondCustomer = new Customer (secondName, secondAddress, secondDateOfBirth);
		Customer thirdCustomer = new Customer (thirdName, thirdAddress, thirdDateOfBirth);
		Customer fourthCustomer = new Customer (fourthName, fourthAddress, fourthDateOfBirth);
		
		
		Date firstDate = new Date(11,11,2011);
		Date secondDate = new Date(11,11,2011);
		Date thirdDate = new Date(11,11,2011);
		Date fourthDate = new Date(11,11,2011);
		
		Double firstBalance = 100.00;
		Double secondBalance = 58.00;
		Double thirdBalance = 1001.00;
		Double fourthBalance = 9000.50;
		
		Account firstAccount = new Account(firstCustomer, firstDate, firstBalance);
		Account secondAccount = new Account(secondCustomer, secondDate, secondBalance);
		Account thirdAccount = new Account(thirdCustomer, thirdDate, thirdBalance);
		Account fourthAccount = new Account(fourthCustomer, fourthDate, fourthBalance);
		
		HashMap<String, Account> accountList = new HashMap<String, Account>();
		accountList.put(Integer.toString(Account.uniqueNumber), firstAccount);
		accountList.put(Integer.toString(Account.uniqueNumber), secondAccount);
		accountList.put(Integer.toString(Account.uniqueNumber), thirdAccount);
		accountList.put(Integer.toString(Account.uniqueNumber), fourthAccount);
		
		String bankName = args[8];
		Bank bank = new Bank(bankName, accountList);
		
		bank.addAccount(firstAccount);
		bank.addAccount(secondAccount);
		bank.addAccount(thirdAccount);
		bank.addAccount(fourthAccount);
		
		System.out.println("===========================");
		firstAccount.displayAccountInfo();
		System.out.println("===========================");
		secondAccount.displayAccountInfo();
		System.out.println("===========================");
		thirdAccount.displayAccountInfo();
		System.out.println("===========================");
		fourthAccount.displayAccountInfo();
		System.out.println("===========================");
		
		Bank.makeTransaction();

	}

}
