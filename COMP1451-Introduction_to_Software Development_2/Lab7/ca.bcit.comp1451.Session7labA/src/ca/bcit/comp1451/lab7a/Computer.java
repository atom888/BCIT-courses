/**
 * 
 */
package ca.bcit.comp1451.lab7a;

/**
 * @author A01034457
 *
 */
public class Computer extends Electronics {
	private int cpuSpeed;
	private int memorySizeGB;
	
	/**
	 * @param brand
	 * @param price
	 * @param warrantyMonths
	 * @param cpuSpeed
	 * @param memorySizeGB
	 */
	public Computer(String brand, double price, int warrantyMonths, int cpuSpeed, int memorySizeGB) {
		super(brand, price, warrantyMonths);
		setCpuSpeed(cpuSpeed);
		setMemorySizeGB(memorySizeGB);
	}



	/**
	 * @return the cpuSpeed
	 */
	public int getCpuSpeed() {
		return cpuSpeed;
	}

	/**
	 * @param cpuSpeed the cpuSpeed to set
	 */
	public void setCpuSpeed(int cpuSpeed) {
		if (cpuSpeed > 0) {
			this.cpuSpeed = cpuSpeed;
		} else {
			throw new IllegalArgumentException("Incorrect Value.");
		}
	}



	/**
	 * @return the memorySizeGB
	 */
	public int getMemorySizeGB() {
		return memorySizeGB;
	}



	/**
	 * @param memorySizeGB the memorySizeGB to set
	 */
	public void setMemorySizeGB(int memorySizeGB) {
		if (memorySizeGB > 0) {
			this.memorySizeGB = memorySizeGB;
		} else {
			throw new IllegalArgumentException("Incorrect Value.");
		}
	}



	/* (non-Javadoc)
	 * @see ca.bcit.comp1451.lab7a.Electronics#increasePrice(double)
	 */
	@Override
	public void increasePrice(double percentage) {
		double percentageValue;
		double price = getPrice();
		int warrantyIncrease = getWarrantyMonths();
		
		if (percentage > 0) {
			percentage = percentage / 100;
			
			percentageValue = price * percentage;
			price = price + percentageValue;
			
			setPrice(price);
			
			warrantyIncrease += 12;
			setWarrantyMonths(warrantyIncrease);
			
		} else {
			throw new IllegalArgumentException("Incorrect Value.");
		}
	}
	
	@Override
	public String toString() {
		String result = super.toString();
		result = result + " CPU Speed: " + getCpuSpeed() + " Memory Size (GB): " + getMemorySizeGB();
		return result;
	}

}
