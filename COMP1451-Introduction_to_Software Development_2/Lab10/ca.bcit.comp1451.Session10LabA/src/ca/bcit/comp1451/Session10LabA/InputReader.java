/**
 * 
 */
package ca.bcit.comp1451.Session10LabA;
import java.util.Scanner;
/**
 * @author adamdipinto
 *
 */
public class InputReader {
	
	private Scanner scanner;
	
	public InputReader() {
		scanner = new Scanner(System.in);
	}
	
	public int getNumber() throws InvalidInputException {
		int number = 0;
		try {
			number = scanner.nextInt();
		}
		catch (java.util.InputMismatchException exc) {
			scanner.nextLine();
			throw new InvalidInputException("not a valid number!");
		}
		return number;
	}
}
