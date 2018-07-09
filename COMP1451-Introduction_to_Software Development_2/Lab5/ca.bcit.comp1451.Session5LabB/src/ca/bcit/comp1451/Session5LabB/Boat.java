/**
 * 
 */
package ca.bcit.comp1451.Session5LabB;

/**
 * @author adamdipinto
 *
 */
public class Boat extends Vehicle {
	private boolean isMotorized;
	
	public Boat(int yearManufactured, String make, String model, boolean isMotorized) {
		super(yearManufactured, make, model);
		setMotorized(isMotorized);
	}

	/**
	 * @return the isMotorized
	 */
	public boolean isMotorized() {
		return isMotorized;
	}

	/**
	 * @param isMotorized the isMotorized to set
	 */
	public void setMotorized(boolean isMotorized) {
		this.isMotorized = isMotorized;
	}
	
	public void displayDetails() {
		System.out.println("Make: " + getMake());
		System.out.println("Model: " + getModel());
		System.out.println("Year Manufacture: " + getYearManufactured());
		System.out.println("Motorized: " + isMotorized());
	}

}
