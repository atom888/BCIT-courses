/**
 * 
 */
package ca.bcit.comp1451.session10.LabASolution;

import java.util.InputMismatchException;

/**
 * @author Rana
 *
 */

import java.util.Scanner;
public class InputReader {
	private Scanner scanner;
	public InputReader(){
	scanner = new Scanner(System.in);	
	
	}
	
	public int getNumber() throws InvalidInputException{
		int number = 0;
		try{
			number = scanner.nextInt();
		}
		catch(InputMismatchException exc){
			scanner.nextLine();
			throw new InvalidInputException(" not a valid number");
		}
		return number;
	}

}
