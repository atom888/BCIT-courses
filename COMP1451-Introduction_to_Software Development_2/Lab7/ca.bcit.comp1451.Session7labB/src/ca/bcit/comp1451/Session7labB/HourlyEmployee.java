/**
 * 
 */
package ca.bcit.comp1451.Session7labB;

/**
 * @author adamdipinto
 *
 */
public class HourlyEmployee extends Employee {
	private int numOfHours;
	private double payRate;
		
	/**
	 * @param name
	 */
	public HourlyEmployee(String name, int numOfHours, double payRate) {
		super(name);
		setNumOfHours(numOfHours);
		setPayRate(payRate);
	}

	/**
	 * @return the numOfHours
	 */
	public int getNumOfHours() {
		return numOfHours;
	}

	/**
	 * @param numOfHours the numOfHours to set
	 */
	public void setNumOfHours(int numOfHours) {
		if (numOfHours > 0) {
			this.numOfHours = numOfHours;
		} else {
			throw new IllegalArgumentException("Incorrect Value.");
		}
	}

	/**
	 * @return the payRate
	 */
	public double getPayRate() {
		return payRate;
	}

	/**
	 * @param payRate the payRate to set
	 */
	public void setPayRate(double payRate) {
		if (payRate > 0) {
			this.payRate = payRate;
		} else {
			throw new IllegalArgumentException("Incorrect Value.");
		}
	}

	/* (non-Javadoc)
	 * @see ca.bcit.comp1451.Session7labB.Employee#calculatePay()
	 */
	@Override
	public double calculatePay() {
		double Pay = payRate * numOfHours;
		return Pay;
	}
	
	@Override 
	public String toString() {
		String result = super.toString();
		result = result + ", Type of Employees: Hourly, Hourly Rate: " + getPayRate() + ", Number of Hours: " + getNumOfHours() + " Pay: " + calculatePay();
		return result;
	}

}
