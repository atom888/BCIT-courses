/**
 * 
 */
package ca.bcit.comp1451.Session7labB;

/**
 * @author adamdipinto
 *
 */
public class SalesEmployee extends Employee {
	
	private int numberOfSoldUnits;
	private double commissionRPU;


	public SalesEmployee(String name, int numberOfSoldUnits, double commissionRPU) {
		super(name);
		setNumberOfSoldUnits(numberOfSoldUnits);
		setCommissionRPU(commissionRPU);

	}

	/**
	 * @return the numberOfSoldUnits
	 */
	public int getNumberOfSoldUnits() {
		return numberOfSoldUnits;
	}

	/**
	 * @param numberOfSoldUnits the numberOfSoldUnits to set
	 */
	public void setNumberOfSoldUnits(int numberOfSoldUnits) {
		if (numberOfSoldUnits > 0) {
			this.numberOfSoldUnits = numberOfSoldUnits;
		} else {
			throw new IllegalArgumentException("Incorrect Value.");
		}	
	}

	/**
	 * @return the commissionRPU
	 */
	public double getCommissionRPU() {
		return commissionRPU;
	}



	/**
	 * @param commissionRPU the commissionRPU to set
	 */
	public void setCommissionRPU(double commissionRPU) {
		if (commissionRPU > 0 ) {
			this.commissionRPU = commissionRPU;
		} else {
			throw new IllegalArgumentException("Incorrect Value.");
		}
	}

	/* (non-Javadoc)
	 * @see ca.bcit.comp1451.Session7labB.Employee#calculatePay()
	 */
	@Override
	public double calculatePay() {
		double Pay = numberOfSoldUnits * commissionRPU;
		return Pay;
	}
	
	@Override 
	public String toString() {
		String result = super.toString();
		result = result + ", Type of Employees: Sales, Number of Units Sold: " + getNumberOfSoldUnits() + ", Commission Rate: " + getCommissionRPU();
		return result;
	}

}
