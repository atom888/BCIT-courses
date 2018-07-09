/**
 * 
 */
package ca.bcit.COMP1451.session06.LabSolution;

/**
 * @author Rana
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PersonCollection list = new PersonCollection();
		list.loadCollection();
		list.displayAllDetail();
		list.testEquality();

	}

}
