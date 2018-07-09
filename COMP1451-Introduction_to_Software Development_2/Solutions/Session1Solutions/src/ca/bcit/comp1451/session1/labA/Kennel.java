/**
 * 
 */
package ca.bcit.comp1451.session1.labA;

import java.util.ArrayList;
import java.util.Iterator;
/**
 * @author Rana
 * 
 * 20-01-2017
 */
public class Kennel {
	
	private ArrayList<Dog> dogs ;
	
	
	/**
	 * no-args constructor
	 */
	public Kennel() {
		dogs  = new ArrayList<Dog>();
	}

	/**
	 * Adds a Dog object to the ArrayList
	 * 
	 * @param theDog adds a dog object
	 */
	public void addDog(Dog dogToAdd){
		if(dogToAdd != null){
		dogs.add(dogToAdd);
		}
	}
	
	/**
	 * Displays all the dogs in the ArrayList
	 */
	public void displayDogs(){
		for(Dog oneDog: dogs){
			oneDog.displayDetails();
		}
	}
	
	/**
	 * Searches for Dog name and displays details of that dog and then removes the object
	 * 
	 * @param name search for dog name
	 */
	public void adopt(String name){
		Iterator<Dog> it = dogs.iterator();
		boolean isAdopted = false;
		
		while(it.hasNext()){
			Dog oneDog = it.next();
			if(oneDog.getName().equalsIgnoreCase(name)){
				oneDog.displayDetails();
				it.remove();
				isAdopted = true;
			}
			
			
		}
		if(isAdopted == false){
		   System.out.println("the dog was not found");
		}
	}
	
	
}

