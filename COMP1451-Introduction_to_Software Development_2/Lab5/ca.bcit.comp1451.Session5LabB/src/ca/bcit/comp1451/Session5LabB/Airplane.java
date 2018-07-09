/**
 * 
 */
package ca.bcit.comp1451.Session5LabB;

/**
 * @author adamdipinto
 *
 */
public class Airplane extends Vehicle {
	private int maxHeightFEET;
	
	public Airplane(int yearManufactured, String make, String model, int maxHeigthFEET) {
		super(yearManufactured, make, model);
		setMaxHeightFEET(maxHeigthFEET);
	}

	/**
	 * @return the maxHeightFEET
	 */
	public int getMaxHeightFEET() {
		return maxHeightFEET;
	}

	/**
	 * @param maxHeightFEET the maxHeightFEET to set
	 */
	public void setMaxHeightFEET(int maxHeightFEET) {
		if (maxHeightFEET > 0) {
			this.maxHeightFEET = maxHeightFEET;
		} else {
			System.out.println("Please provide a positive value.");
		}
	}
	
	public void displayDetails() {
		System.out.println("Make: " + getMake());
		System.out.println("Model: " + getModel());
		System.out.println("Year Manufacture: " + getYearManufactured());
		System.out.println("Max Height (Ft): " + getMaxHeightFEET());
	}

}
