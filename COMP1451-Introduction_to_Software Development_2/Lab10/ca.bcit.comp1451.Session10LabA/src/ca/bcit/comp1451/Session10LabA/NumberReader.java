/**
 * 
 */
package ca.bcit.comp1451.Session10LabA;

/**
 * @author adamdipinto
 *
 */
public class NumberReader {
	
	public int inputSum() throws InvalidInputException {
		InputReader input = new InputReader();
		int sum = 0;
		boolean result = true;
		
		try {
			while (result) {
				System.out.println("Please provide a number.");
				int value = input.getNumber();
				if (value != 0) {
					sum += value;
				} else {
					result = false;
				}
			}

		} catch (InvalidInputException e) {
			e.getMessage();
			e.printStackTrace();
		} catch (Exception e) {
			e.getMessage();
		}

		return sum;
		
	}
	
}
