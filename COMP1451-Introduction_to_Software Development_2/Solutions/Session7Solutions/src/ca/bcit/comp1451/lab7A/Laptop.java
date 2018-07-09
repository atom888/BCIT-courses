package ca.bcit.comp1451.lab7A;


/**
 * @author Rana
 *
 */
public class Laptop extends Computer{
	
private double screenSize;
	
	/**
	 * @param brand The brand of the laptop
	 * @param price The price of the laptop
	 * @param warrantyInMonths The warranty length in months
	 * @param cpuSpeed The speed of the cpu in mhz
	 * @param memorySizeGB The memory capacity in GB
	 * @param screenSize The screen size in inches.
	 */
	public Laptop(String brand, double price, int warrantyInMonths, int cpuSpeed, int memorySizeGB, double screenSize) {
		super(brand, price, warrantyInMonths, cpuSpeed, memorySizeGB);
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
		if (screenSize > 0){
			this.screenSize = screenSize;
		}
		else{
			this.screenSize = 1;
		}
	}


	@Override
	public String toString() {
		return super.toString() + ", screen size: " + screenSize + " inches";
	}
	
}
