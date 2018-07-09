/**
 * 
 */
package ca.bcit.comp1451.Session6LabA;

/**
 * @author A01034457
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonCollection personCollection = new PersonCollection();
		personCollection.loadCollection();
		personCollection.displayAllDetails();
		personCollection.testEquality();

	}

}
