/**
 * 
 */
package ca.bcit.comp1451.Session5LabB;

/**
 * @author adamdipinto
 *
 */
public class Vehicle {
	private int yearManufactured;
	private String make;
	private String model;
	
	public Vehicle(int yearManufactured, String make, String model) {
		setYearManufactured(yearManufactured);
		setMake(make);
		setModel(model);
		
	}

	/**
	 * @return the yearManufactured
	 */
	public int getYearManufactured() {
		return yearManufactured;
	}

	/**
	 * @param yearManufactured the yearManufactured to set
	 */
	public void setYearManufactured(int yearManufactured) {
		if (yearManufactured > 0) {
			this.yearManufactured = yearManufactured;
		} else {
			System.out.println("Please provide a positive number for the year manufactured.");
		}
		
	}

	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		if (make != null && !make.isEmpty()) {
			this.make = make;
		} else {
			this.make = "unknown model";
		}
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		if (model != null && !model.isEmpty()) {
			this.model = model;
		} else {
			this.model = "unknown";
		}
		
	}

}
