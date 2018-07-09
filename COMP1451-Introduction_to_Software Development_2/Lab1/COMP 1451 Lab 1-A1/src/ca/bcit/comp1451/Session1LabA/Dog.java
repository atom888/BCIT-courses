/**
 * 
 */
package ca.bcit.comp1451.Session1LabA;

/**
 * @author A01034457
 *
 */
public class Dog {
	private String nameOfDog;
	private String breedOfDog;
	private int ageInYears;
	
	
	public Dog(String name, String breed, int age) {
		setNameOfDog(name);
		setBreedOfDog(breed);
		setAgeInYears(age);
	}
	
	/**
	 * @return the nameOfDog
	 */
	public String getNameOfDog() {
		return nameOfDog;
	}
	/**
	 * @param nameOfDog the nameOfDog to set
	 */
	public void setNameOfDog(String nameOfDog) {
		if (nameOfDog != null) {
			this.nameOfDog = nameOfDog;
		} else {
			throw new IllegalArgumentException(" the name of dog cannot be null");
		}
	}
	/**
	 * @return the breedOfDog
	 */
	public String getBreedOfDog() {
		return breedOfDog;
	}
	/**
	 * @param breedOfDog the breedOfDog to set
	 */
	public void setBreedOfDog(String breedOfDog) {
		if (breedOfDog != null) {
			this.breedOfDog = breedOfDog;
		} else {
			throw new IllegalArgumentException(" the breed of dog cannot be null");
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
		if (ageInYears > 0) {
			this.ageInYears = ageInYears;
		} else {
			throw new IllegalArgumentException(" the age of the dog cannot be negative");
		}
	}
}
