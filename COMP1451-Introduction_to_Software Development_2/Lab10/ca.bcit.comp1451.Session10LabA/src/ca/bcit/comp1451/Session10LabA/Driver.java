/**
 * 
 */
package ca.bcit.comp1451.Session10LabA;

/**
 * @author adamdipinto
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		NumberReader r = new NumberReader();
		
		try {
			r.inputSum();
		} 
		catch (InvalidInputException e) {
			e.getMessage();
		}

	}

}
