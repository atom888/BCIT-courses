/**
 * 
 */
package ca.bcit.comp1451.Session6LabA;

/**
 * @author A01034457
 *
 */
/**
 * @author A01034457
 *
 */
public class Person {
	private static int MAX_AGE = 130;
	
	private String name;
	private int ageInYears;
	
	public Person(String name, int ageInYears) {
		setName(name);
		setAgeInYears(ageInYears);
	}

	/**
	 * @return the getName
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
		} else {
			this.name = "unknown";
		}
		
	}
	
	/**
	 * @return the getAgeInYears
	 */
	public int getAgeInYears() {
		return ageInYears;
	}

	/**
	 * @param ageInYears the ageInYears to set
	 */
	public void setAgeInYears(int ageInYears) {
		if (ageInYears > 0 && ageInYears <= MAX_AGE) {
			this.ageInYears = ageInYears;
		}	
	}
	
	@Override
	public String toString() {
		String result = ""; 
		result = "Name is " + getName() + ", the age is " + getAgeInYears() + " years";	
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
		if (!(o instanceof Person)) {
			result = false;
		}
		Person other = (Person) o;
		if (getName() == null) {
			if (other.getName() != null) {
				result = false;
			}
		} else if (!getName().equals(other.getName()) ) {
			result = false;
		} 
		return result;
	}

}
