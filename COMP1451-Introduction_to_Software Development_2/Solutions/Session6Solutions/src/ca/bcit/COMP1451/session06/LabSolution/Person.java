/**
 * 
 */
package ca.bcit.COMP1451.session06.LabSolution;

/**
 * @author Rana
 *
 */
public class Person {
	
	public static final int MAXIMUM_AGE_IN_YEARS = 130;
	private String name;
	private int ageInYears;
	
	/**
	 * 
	 */
	public Person(String name,int ageInYears) {
		setName(name);
		setAgeInYears(ageInYears);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		if (name != null && !name.isEmpty()){
			this.name = name;
		}
		else{
			this.name="unknown";
		}
	}

	/**
	 * @return the ageInYears
	 */
	public int getAgeInYears() {
		return ageInYears;
	}

	/**
	 * @param ageInYears the ageInYears to set
	 */
	public void setAgeInYears(int ageInYears) {
		if (ageInYears >= 0 && ageInYears <= MAXIMUM_AGE_IN_YEARS){
			this.ageInYears = ageInYears;
		}
		else{
			this.ageInYears = 0;
		}
	}
	
	@Override
	public String toString() {
		
		return "The name is " + name +" and the age is  "+ ageInYears;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ageInYears;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Person)) {
			return false;
		}
		Person other = (Person) obj;
		if (ageInYears != other.ageInYears) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}

	

	
	
	

}
