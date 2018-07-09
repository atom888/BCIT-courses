/**
 * 
 */
package ca.bcit.comp1451.session10.LabBSolution;

/**
 * @author Rana
 *
 */
import java.util.Scanner;
/**
 * @author a00749008
 *
 */
public class Bank {

	private BankAccount account;
	private Scanner scanner;
	public Bank(BankAccount account){
		setBankAccount(account);
		scanner = new Scanner(System.in);
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
	public void setBankAccount(BankAccount account) {
		if(account != null) {
		this.account = account;
		}else {
		 this.account = new BankAccount(); 
		}
	}
	
	
	
	public void processTransaction(){
		String answer = "";
		double amount = 0.0;
		while(!answer.equalsIgnoreCase("N")){
			
			System.out.println(" choose the transaction type: ");
			System.out.println("1 deposit ");
			System.out.println("2 withdraw");
			System.out.println("3 dipslay information");
			
			
			try{
				System.out.println("enter your choice");
				int choice = scanner.nextInt();
				
			switch(choice){
			case 1: System.out.println("enter the amount");
			        amount = scanner.nextDouble();
				    account.deposit(amount);
				  break;
			case 2:System.out.println("enter the amount");
			       amount = scanner.nextDouble(); 
				   account.withdraw(amount);
			       break;
			case 3:System.out.println(account);
			       break;
			default: System.out.println("invalid choice");
			
			}
			}
			catch(NegativeAmountException e){
				System.out.println(e.getMessage());
			}
			
			catch (InsufficientFundException e){
				System.out.println(e.getMessage());
			}
			catch(Exception e){
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			finally{
				scanner.nextLine();
				System.out.println(" another transaction? N for no, any thing for yes");
				answer = scanner.nextLine();
			}
		}
		}
	
	


	public static void main(String[] argv){
		
		Bank bank = new Bank(new BankAccount("Adam",300));
		bank.processTransaction();
		
	}

}
