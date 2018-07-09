/**
 * 
 */
package ca.bcit.comp1451.lab7a;

/**
 * @author A01034457
 *
 */
public class Laptop extends Computer {
	private double screenSize;

	/**
	 * @param brand
	 * @param price
	 * @param warrantyMonths
	 * @param cpuSpeed
	 * @param memorySizeGB
	 * @param screenSize
	 */
	public Laptop(String brand, double price, int warrantyMonths, int cpuSpeed, int memorySizeGB, double screenSize) {
		super(brand, price, warrantyMonths, cpuSpeed, memorySizeGB);
		setScreenSize(screenSize);
	}

	/**
	 * @return the screenSize
	 */
	public double getScreenSize() {
		return screenSize;
	}
	
	/**
	 * @param screenSize the screenSize to set
	 */
	public void setScreenSize(double screenSize) {
		if (screenSize > 0) {
			this.screenSize = screenSize;
		} else {
			throw new IllegalArgumentException("Incorrect Value.");
		}
	}

	@Override
	public String toString() {
		String result = super.toString();
		result = result + " Screen Size: " + getScreenSize();
		return result;
	}

	@Override
	public void increasePrice(double percentage) {

	}

}
