/**
 * 
 */
package ca.bcit.comp1451.session1.labA;

/**
 * @author a00749008
 *
 */
public class Dog {
	private String name;
	private String breed;
	private int ageInYears;
	
	public Dog(String name, String breed, int age){
		setName(name);
		setBreed(breed);
		setAgeInYears(age);
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
		if(name != null && ! name.isEmpty()){
			this.name = name;
		}
		else{
			throw new IllegalArgumentException("name cannot be null or empty String");
		}
		
		
	}

	/**
	 * @return the breed
	 */
	public String getBreed() {
		return breed;
	}

	/**
	 * @param breed the breed to set
	 */
	public void setBreed(String breed) {
		if(breed != null && ! breed.isEmpty()){
			this.breed = breed;
		}
		else{
			throw new IllegalArgumentException("breed cannot be null or empty String");
		}
	}

	/**
	 * @return the age
	 */
	public int getAgeInYears() {
		return ageInYears;
	}

	/**
	 * @param age the age to set
	 */
	public void setAgeInYears(int age) {
		if(age > 0){
			ageInYears = age;
		}
		else{
			throw new IllegalArgumentException("age cannot be negative");
		}
	}
	
	/**
	 * Display class details
	 */
	public void displayDetails(){
		System.out.println("Name: " + name);
		System.out.println("Breed: " + breed);
		System.out.println("Age: " + ageInYears);
	}
	
	
}

