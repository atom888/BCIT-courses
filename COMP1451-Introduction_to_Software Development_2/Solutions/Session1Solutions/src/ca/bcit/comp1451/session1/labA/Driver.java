package ca.bcit.comp1451.session1.labA;

public class Driver {

	/**
	 * The main method
	 */
	public static void main(String[] args){
		Kennel kennel = new Kennel();
		Dog dog1 = new Dog(args[0], args[1], Integer.parseInt(args[2]));
		kennel.addDog(dog1);
		
		kennel.addDog(new Dog(args[3],args[4],Integer.parseInt(args[5]) ));
	
		System.out.println("The list of dogs in the  kennel");
		kennel.displayDogs();
		System.out.println("adopting the dog "+ args[3]);
		kennel.adopt(args[3]);
		
		System.out.println();
		System.out.println("the list of dogs after adoption");
		kennel.displayDogs();
	}
	
}
