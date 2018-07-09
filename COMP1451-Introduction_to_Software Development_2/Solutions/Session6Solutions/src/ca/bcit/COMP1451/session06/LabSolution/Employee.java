/**
 * 
 */
package ca.bcit.COMP1451.session06.LabSolution;

/**
 * @author Rana
 *
 */
public class Employee extends Person {
	
	public static final int MAXIMUM_NUMBER_OF_WORKING_HOURS = 80;
	public static final int FULLTIME_NUMBER_OF_HOURS = 40;
	public static final int NUMBER_OF_WEEKS_IN_YEAR = 52;
   
	//private double annualIncome;
	private int numberOfWorkingHours;
	private double hourlyRate;
	/**
	 * @param name
	 * @param ageInYears
	 */
	public Employee(String name, int ageInYears, double hourlyRate,int numberOfWorkingHours) {
		super(name, ageInYears);
		setHourlyRate(hourlyRate);
		setNumberOfWorkingHours(numberOfWorkingHours);
	}

	
	


	/**
	 * @return the hourlyRate
	 */
	public double getHourlyRate() {
		return hourlyRate;
	}





	/**
	 * @param hourlyRate the hourlyRate to set
	 */
	public void setHourlyRate(double hourlyRate) {
		if(hourlyRate>0) {
		this.hourlyRate = hourlyRate;
		}
	}





	/**
	 * @return the numberOfWorkingHours
	 */
	public int getNumberOfWorkingHours() {
		return numberOfWorkingHours;
	}
	/**
	 * @param numberOfWorkingHours the numberOfWorkingHours to set
	 */
	public void setNumberOfWorkingHours(int numberOfWorkingHours) {
		if(numberOfWorkingHours >0 && numberOfWorkingHours <= MAXIMUM_NUMBER_OF_WORKING_HOURS ){
		this.numberOfWorkingHours = numberOfWorkingHours;
		}
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String s = super.toString();
		if (numberOfWorkingHours >= FULLTIME_NUMBER_OF_HOURS) {
			s+=" This employee is a full Time employee " ;
		}
		else {
			s+=" This employee is a part Time employee";
		}
		s+= " with hourly rate of " + hourlyRate;
		return s;
	}





	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(calculateAnnualIncome());
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + numberOfWorkingHours;
		return result;
	}

  private double calculateAnnualIncome() {
	  return hourlyRate * numberOfWorkingHours * NUMBER_OF_WEEKS_IN_YEAR;
  }



	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (Double.doubleToLongBits(calculateAnnualIncome()) != Double.doubleToLongBits(other.calculateAnnualIncome()))
			return false;
		
		return true;
	}
	
	

}
