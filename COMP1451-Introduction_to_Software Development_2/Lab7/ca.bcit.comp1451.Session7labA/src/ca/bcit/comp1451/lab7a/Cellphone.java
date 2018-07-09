/**
 * 
 */
package ca.bcit.comp1451.lab7a;

/**
 * @author A01034457
 *
 */
public class Cellphone extends Electronics {
	
	private double batteryLifeTime;

	/**
	 * @param brand
	 * @param price
	 * @param warrantyMonths
	 * @param batteryLifeTime
	 */
	public Cellphone(String brand, double price, int warrantyMonths, double batteryLifeTime) {
		super(brand, price, warrantyMonths);
		setBatteryLifeTime(batteryLifeTime);
	}


	/**
	 * @return the batteryLifeTime
	 */
	public double getBatteryLifeTime() {
		return batteryLifeTime;
	}


	/**
	 * @param batteryLifeTime the batteryLifeTime to set
	 */
	public void setBatteryLifeTime(double batteryLifeTime) {
		if (batteryLifeTime > 0) {
			this.batteryLifeTime = batteryLifeTime;
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
			
			warrantyIncrease += 6;
			setWarrantyMonths(warrantyIncrease);
			
		} else {
			throw new IllegalArgumentException("Incorrect Value.");
		}
	}
	
	@Override
	public String toString() {
		String result = super.toString();
		result = result + " Battery Life: " + batteryLifeTime;
		return result;
		
	}

}
