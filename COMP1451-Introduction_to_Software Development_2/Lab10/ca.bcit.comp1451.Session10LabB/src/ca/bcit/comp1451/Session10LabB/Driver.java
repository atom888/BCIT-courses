/**
 * 
 */
package ca.bcit.comp1451.Session10LabB;

/**
 * @author adamdipinto
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BankAccount account = new BankAccount ("Herby", 12000.00);
		Bank bank = new Bank(account);
		
		bank.processTransaction();

	}

}
