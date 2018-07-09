/**
 * 
 */
package ca.bcit.comp1451.Session2LabB;

/**
 * @author adamdipinto
 *
 */
import java.util.Random;

public class Die {

	private int faceValue;
	private Random random;

	public Die() {
		random = new Random();
		//call upon roll
	}
	
	public int roll() {
		faceValue = random.nextInt(6)+1;
		return faceValue;
	} 
	
	
	
}
