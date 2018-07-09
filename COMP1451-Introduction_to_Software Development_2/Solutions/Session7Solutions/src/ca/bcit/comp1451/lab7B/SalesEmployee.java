/**
 * 
 */
package ca.bcit.comp1451.lab7B;

/**
 * @author Rana
 *
 */
public class SalesEmployee extends Employee {
	
	private int numberOfSoldUnits;
	private double commissionRatePerUnit;

	/**
	 * Create a Sales Employee
	 * @param name The employee's name
	 * @param numberOfSoldUnits The number of sold units
	 * @param commissionRatePerUnit The commission rate per unit
	 */
	public SalesEmployee(String name, int numberOfSoldUnits, double commissionRatePerUnit) {
		super(name);
		setNumberOfSoldUnits(numberOfSoldUnits);
		setCommissionRatePerUnit(commissionRatePerUnit);
	}

	/**
	 * Get the number of sold units
	 * @return the numberOfSoldUnits
	 */
	public int getNumberOfSoldUnits() {
		return numberOfSoldUnits;
	}

	/**
	 * Get the commission rate
	 * @return the commissionRatePerUnit
	 */
	public double getCommissionRatePerUnit() {
		return commissionRatePerUnit;
	}

	/**
	 * set the number of units sold
	 * @param numberOfSoldUnits the number of units sold
	 */
	public void setNumberOfSoldUnits(int numberOfSoldUnits) {
		if (numberOfSoldUnits >= 0){
			this.numberOfSoldUnits = numberOfSoldUnits;
		}
		else{
			this.numberOfSoldUnits = 0;
		}
	}


	/**
	 * Set the commission rate per unit
	 * @param commissionRatePerUnit the commission rate per unit
	 */
	public void setCommissionRatePerUnit(double commissionRatePerUnit) {
		if (commissionRatePerUnit >= 0.0){
			this.commissionRatePerUnit = commissionRatePerUnit;
		}
		else{
			this.commissionRatePerUnit = 0.0;
		}
	}

	
	/**
	 * Calculate the rate of pay
	 * @return the rate of pay
	 */
	 @Override
	public double calculatePay() {
		return getNumberOfSoldUnits() * getCommissionRatePerUnit();
	}
	 
	@Override
	public String toString() {
		return super.toString() + "\n"
				+ "Type of employee : Sales. \n" 
				+ "number of units sold "+ getNumberOfSoldUnits() + " units sold, \n"
				+ " commision rate: " + getCommissionRatePerUnit() + "\n"
				+" total pay: " + calculatePay() +"\n";
	}
	 
	 

}
