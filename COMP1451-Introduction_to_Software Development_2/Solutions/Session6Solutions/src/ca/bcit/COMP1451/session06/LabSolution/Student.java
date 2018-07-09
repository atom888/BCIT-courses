/**
 * 
 */
package ca.bcit.COMP1451.session06.LabSolution;

/**
 * @author Rana
 *
 */
public class Student extends Person {
	public static final int MAXIMUM_GRADE = 100;

	private boolean isFullTimeStudent;
	private double gpa;
	/**
	 * @param name
	 * @param ageInYears
	 */
	public Student(String name, int ageInYears, boolean isFullTimeStudent, double gpa) {
		super(name, ageInYears);
		setFullTimeStudent(isFullTimeStudent);
		setGpa(gpa);
		
	}
	/**
	 * @return the isFullTimeStudent
	 */
	public boolean isFullTimeStudent() {
		return isFullTimeStudent;
	}
	/**
	 * @param isFullTimeStudent the isFullTimeStudent to set
	 */
	public void setFullTimeStudent(boolean isFullTimeStudent) {
		this.isFullTimeStudent = isFullTimeStudent;
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
		if(gpa >= 0  && gpa <= MAXIMUM_GRADE)
		this.gpa = gpa;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(gpa);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof Student)) {
			return false;
		}
		Student other = (Student) obj;
		
		if(this.getName() == null){
			if( other.getName() != null){
				return false;
			}
		}
		else if(! this.getName().equals(other.getName())){
			return false;
		}
		if (Double.doubleToLongBits(gpa) != Double.doubleToLongBits(other.gpa)) {
			return false;
		}
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String s = super.toString();
		if (isFullTimeStudent){
		s+= " Student isFull Time Student with gpa, "+ gpa;
		}
		else{
			s+= " Student is Part TimeStudent with gpa, "+ gpa;
		}
		return s;
	}
	
	
	
	

}
