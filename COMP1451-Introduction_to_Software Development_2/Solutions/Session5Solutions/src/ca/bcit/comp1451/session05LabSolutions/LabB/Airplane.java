/**
 * 
 */
package ca.bcit.comp1451.session05LabSolutions.LabB;

/**
 * 
 * @author A00749008
 * 
 */
public class Airplane extends Vehicle {

	private int maxHeightInFeet;
	
	/**
	 * non-default Airplane constructor
	 * @param yearManufactured
	 * @param make
	 * @param model
	 * @param maxHeightInFeet
	 */
	public Airplane(int yearManufactured, String make, String model, int maxHeightInFeet) {
			super(yearManufactured,make,model);
			setMaxHeightInFeet(maxHeightInFeet);
		}

	/**
	 * Method getMaxHeightInFeet
	 * @return the maxHeightInFeet
	 */
	public int getMaxHeightInFeet() {
		return maxHeightInFeet;
	}

	/**
	 * Method setMaxHeightInFeet
	 * @param maxHeightInFeet the maxHeightInFeet to set
	 */
	public void setMaxHeightInFeet(int maxHeightInFeet) {
		if(maxHeightInFeet > 0){
			this.maxHeightInFeet = maxHeightInFeet;
		}
		}
	
	/**
	 * Method displayDetails
	 */
	public void displayDetails(){
		System.out.println("Make: " + getMake());
		System.out.println("Model: " + getModel());
		System.out.println("Manufactured year: " + getYearManufactured());
		System.out.println("Maximum Height: " + maxHeightInFeet);
	}
	
	
	}
	
	


