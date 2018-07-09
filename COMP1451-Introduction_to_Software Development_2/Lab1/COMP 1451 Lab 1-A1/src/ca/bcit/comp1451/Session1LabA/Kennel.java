/**
 * 
 */
package ca.bcit.comp1451.Session1LabA;

/**
 * @author A01034457
 *
 */
import java.util.ArrayList;
import java.util.Iterator;


public class Kennel {
	private ArrayList<Dog> dogs;
	
	public Kennel() {
		dogs = new ArrayList<Dog>();
	}

	
	public void addDog(Dog theDog) {
		if (theDog != null) {
			dogs.add(theDog);
		} else {
			throw new IllegalArgumentException("The value of the dog cannot be null");
		}
		
	}
	
	public void displayDogs() {
		for(Dog kennelDog: dogs) {
			 System.out.println(kennelDog.getNameOfDog());
			 System.out.println(kennelDog.getBreedOfDog());
			 System.out.println(kennelDog.getAgeInYears());
		 }
	}
	
	public void adopt (String name) {
		
		Iterator<Dog> it = dogs.iterator();
			while(it.hasNext()) {
			Dog oneDog = it.next();
			if (oneDog.getNameOfDog().equals(name)) {
				System.out.println(oneDog.getNameOfDog());
				System.out.println(oneDog.getBreedOfDog());
				System.out.println(oneDog.getAgeInYears());
				it.remove();
			} 
		}

		
	}
}
