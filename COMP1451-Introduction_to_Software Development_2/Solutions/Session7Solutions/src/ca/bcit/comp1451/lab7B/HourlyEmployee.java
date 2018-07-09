/**
 * 
 */
package ca.bcit.comp1451.lab7B;

/**
 * @author Rana
 *
 */
public class HourlyEmployee extends Employee {
	private int numberOfHours;
	private double payRate;

	
	/**
	 * Create an Hourly employee
	 * @param name The employee's name
	 * @param numberOfHours The number of hours worked
	 * @param payRate The rate of pay
	 */
	public HourlyEmployee(String name, int numberOfHours, double payRate) {
		super(name);
		setNumberOfHours(numberOfHours);
		setPayRate(payRate);
	}
	
	/**
	 * @return the numberOfHours
	 */
	public int getNumberOfHours() {
		return numberOfHours;
	}

	/**
	 * Get the rate of pay
	 */
	public double getPayRate() {
		return payRate;
	}

	/**
	 * @param numberOfHours the numberOfHours to set
	 */
	public void setNumberOfHours(int numberOfHours) {
		if (numberOfHours >= 0){
			this.numberOfHours = numberOfHours;
		}
		
	}

	/**
	 * Get the rate of pay
	 * @param payRate the payRate to set
	 */
	public void setPayRate(double payRate) {
		if (payRate >= 0.0){
			this.payRate = payRate;
		}
		
	}

	/**
	 * Calculate the total pay
	 * @return the total pay
	 */
	@Override
	public double calculatePay() {
		return getPayRate() * getNumberOfHours();
	}

	@Override
	public String toString() {
		return super.toString() + "\n"
	           +"Type of employee: hourly."+ "\n"
	           +"Rate of pay: "     + getPayRate() + "\n"
	           +"number of hours: " + getNumberOfHours() +"\n" 
			   + "total pay: " + calculatePay() +"\n";
	}
	
}
