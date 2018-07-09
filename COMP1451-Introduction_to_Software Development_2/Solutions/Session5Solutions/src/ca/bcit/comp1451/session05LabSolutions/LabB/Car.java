/**
 * 
 */
package ca.bcit.comp1451.session05LabSolutions.LabB;

/**
 * 
 * @author A00749008
 */

public class Car extends Vehicle{

	private int horsePower;
	
	/**
	 * non-default Car constructor
	 * @param yearManufactured
	 * @param make
	 * @param model
	 * @param horsePower
	 */
	public Car(int yearManufactured, String make, String model, int horsePower) {
		super(yearManufactured, make, model);
		//super();
		
		setHorsePower(horsePower);
	}

	/**
	 * Method getHorsePower
	 * @return the horsePower
	 */
	public int getHorsePower() {
		return horsePower;
	}

	/**
	 * Method SetHorsePower
	 * @param horsePower the horsePower to set
	 */
	public void setHorsePower(int horsePower) {
		if(horsePower > 0){
			this.horsePower= horsePower;
		}
		
	}
	
	/**
	 * Method displayDetails
	 */
	public void displayDetails(){
		System.out.println("Make: " + getMake());
		System.out.println("Model: " + getModel());
		System.out.println("Manufactured year: " + getYearManufactured());
		System.out.println("Horse power: " + horsePower);
	}
	

}
