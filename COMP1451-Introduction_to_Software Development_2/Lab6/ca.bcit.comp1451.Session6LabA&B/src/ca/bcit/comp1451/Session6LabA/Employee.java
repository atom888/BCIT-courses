/**
 * 
 */
package ca.bcit.comp1451.Session6LabA;

/**
 * @author A01034457
 *
 */
public class Employee extends Person {
	private static int MAX_HOURS = 80;
	private static int PART_TIME = 40;
	
	private double hourlyRate;
	private int numWorkHoursPerWeek;
	
	public Employee(String name, int ageInYears, double hourlyRate, int numWorkHoursPerWeek) {
		super(name,ageInYears);
		setHourlyRate(hourlyRate);
		setNumWorkHoursPerWeek(numWorkHoursPerWeek);
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
		if (hourlyRate > 0) {
			this.hourlyRate = hourlyRate;
		}
	}

	/**
	 * @return the numWorkHoursPerWeek
	 */
	public int getNumWorkHoursPerWeek() {
		return numWorkHoursPerWeek;
	}

	/**
	 * @param numWorkHoursPerWeek the numWorkHoursPerWeek to set
	 */
	public void setNumWorkHoursPerWeek(int numWorkHoursPerWeek) {
		if (numWorkHoursPerWeek > 0 && numWorkHoursPerWeek <= MAX_HOURS) {
			this.numWorkHoursPerWeek = numWorkHoursPerWeek;
		}
	}
	
	@Override
	public String toString() {
		String result = "";
		if (numWorkHoursPerWeek > 0 && numWorkHoursPerWeek <= PART_TIME) {
			result = "This Employee's name is " + getName() + " and the age is " + getAgeInYears() +  " years old. This is a part time employee";
		} else {
			result = "This Employee's name is " + getName() + " and the age is " + getAgeInYears() +  " years old. This is a full time employee";	
		}
		return result;
	}
	
	@Override
	public boolean equals(Object o) {
		boolean result = true;
		if (this == o) {
			return result;
		} 
		if (o == null) {
			result = false;
		}
		if (!(o instanceof Employee)) {
			result = false;
		}
		Employee other = (Employee) o;
		if (getName() == null) {
			if (other.getName() != null) {
				result = false;
			}
		} else if (!getName().equals(other.getName()) ) {
			result = false;
		} else if (!(getHourlyRate() == other.getHourlyRate())) {
			result = false;
		}
		return result;
		
	}

}
