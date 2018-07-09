/**
 * 
 */
package ca.bcit.comp1451.Session6LabA;

/**
 * @author A01034457
 *
 */
public class Student extends Person {
	private boolean isFullTime;
	private double gpa;
	
	public Student(String name, int ageInYears, boolean isFullTime, double gpa) {
		super(name, ageInYears);
		setFullTime(isFullTime);
		setGpa(gpa);
		
	}

	/**
	 * @return the isFullTime
	 */
	public boolean isFullTime() {
		return isFullTime;
	}

	/**
	 * @param isFullTime the isFullTime to set
	 */
	public void setFullTime(boolean isFullTime) {
		this.isFullTime = isFullTime;
	}

	/**
	 * @return the gpa
	 */
	public double getGpa() {
		return gpa;
	}

	/**
	 * @param gpa the gpa to set
	 */
	public void setGpa(double gpa) {
		if(gpa > 0) {
			this.gpa = gpa;
		}
	}

	@Override
	public String toString() {
		String result = "";
		
		if (isFullTime) {
			result = "This Students's name is " + getName() + " and the age is " + getAgeInYears() + " years old. This student is a full time student with the gpa of " + getGpa();
		} else {
			result = "This Students's name is " + getName() + " and the age is " + getAgeInYears() + " years old. This student is a part time student with the gpa of " + getGpa();
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
		if (!(o instanceof Student)) {
			result = false;
		}
		Student other = (Student) o;
		if (getName() == null) {
			if (other.getName() != null) {
				result = false;
			}
		} else if (!getName().equals(other.getName()) ) {
			result = false;
		} else if (!(getGpa() == other.getGpa())) {
			result = false;
		}
		return result;
	}
}
