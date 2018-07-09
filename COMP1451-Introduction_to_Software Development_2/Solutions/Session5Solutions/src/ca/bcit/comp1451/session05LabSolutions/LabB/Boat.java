/**
 * 
 */
package ca.bcit.comp1451.session05LabSolutions.LabB;

/**
 *
 * @author A00749008
 * 
 */
public class Boat extends Vehicle{

	private boolean isMotorized;
	
	/**
	 * non-default Boat constructor
	 * @param yearManufactured
	 * @param make
	 * @param model
	 * @param isMotorized
	 */
	public Boat(int yearManufactured,String make,String model,boolean isMotorized) {
		super(yearManufactured,make,model);
		setMotorized(isMotorized);
	}

	/**
	 * Method isMotorized
	 * @return the isMotorized
	 */
	public boolean isMotorized() {
		return isMotorized;
	}

	/**
	 * Method setMotorized
	 * @param isMotorized the isMotorized to set
	 */
	public void setMotorized(boolean isMotorized) {
		this.isMotorized = isMotorized;
	}

	/**
	 * Method displayDetails
	 */
	public void displayDetails(){
		System.out.println("Make: " + getMake());
		System.out.println("Model: " + getModel());
		System.out.println("Manufactured year: " + getYearManufactured());
		System.out.println("Motorized?: " + isMotorized);
	}
	
}
