/**
 * 
 */
package ca.bcit.comp1451.Session2LabA;

/**
 * @author A01034457
 *
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Games {
	private Scanner input;
	
	public Games() {
		input = new Scanner(System.in);
	}
	
	public void textParser() {
		
		System.out.println("Please enter text:");
		
		ArrayList<Integer> intArr = new ArrayList<Integer>();
		ArrayList<Double> doubleArr = new ArrayList<Double>();
		ArrayList<String> stringArr = new ArrayList<String>();
		
		while(input.hasNext()) {
			if (input.hasNextInt()) {
				Integer number = input.nextInt();
				intArr.add(number);
			} else if (input.hasNextDouble()) {
				double numberDouble = input.nextDouble();
				doubleArr.add(numberDouble);
			} else {

				String word = input.next();
				stringArr.add(word);
			}
		} 
		input.close();
		

			System.out.println("Word count: " + stringArr.size());
			System.out.println("Word list: " + stringArr);
			
			System.out.println("Int count: " + intArr.size());
			System.out.println("Int list: " + intArr);
			
			System.out.println("Double count: " + doubleArr.size());
			System.out.println("Double list: " + doubleArr);
			
	}

	

}
