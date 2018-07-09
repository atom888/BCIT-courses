/**
 * 
 */
package ca.bcit.comp1451.Session5LabB;

/**
 * @author adamdipinto
 *
 */
public class Car extends Vehicle {
	private int horsePower;
	
	public Car(int yearManufactured, String make, String model, int horsePower) {
		super(yearManufactured, make, model);
		setHorsePower(horsePower);
	}

	/**
	 * @return the horsePower
	 */
	public int getHorsePower() {
		return horsePower;
	}

	/**
	 * @param horsePower the horsePower to set
	 */
	public void setHorsePower(int horsePower) {
		if (horsePower > 0) {
			this.horsePower = horsePower;
		} else {
			System.out.println("Please privide a positive value.");
		}
	}
	
	public void displayDetails() {
		System.out.println("Make: " + getMake());
		System.out.println("Model: " + getModel());
		System.out.println("Year Manufacture: " + getYearManufactured());
		System.out.println("Horse Power: " + getHorsePower());
	}

}
