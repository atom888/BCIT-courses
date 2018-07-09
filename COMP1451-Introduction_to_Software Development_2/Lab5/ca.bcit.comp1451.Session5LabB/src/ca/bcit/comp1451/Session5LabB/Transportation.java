/**
 * 
 */
package ca.bcit.comp1451.Session5LabB;

import java.util.ArrayList;


/**
 * @author adamdipinto
 *
 */
public class Transportation {

	/**
	 * @param args
	 */
	private ArrayList<Vehicle> transportation;
	
	public Transportation() {
		transportation = new ArrayList<Vehicle>();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transportation transportation = new Transportation();
		transportation.loadCollection();
		transportation.displayAirplaneDetails();
		transportation.displayAllDetails();

	}
	public void loadCollection() {
		Vehicle car = new Car(2003, "Honda", "Civic", 12);
		Vehicle boat = new Boat(2016, "Bayliner", "Element XR7", true);
		Vehicle airplane = new Airplane(1994, "Boeing", "777", 43100);
		
		transportation.add(car);
		transportation.add(boat);
		transportation.add(airplane);
	}
	
	public void displayAllDetails() {
		for (Vehicle t : transportation) {
			if (t instanceof Car) {
				System.out.println("=================");
				((Car) t).displayDetails();
				System.out.println("=================");
			} else if (t instanceof Boat) {
				System.out.println("=================");
				((Boat) t).displayDetails();
				System.out.println("=================");
			} else if (t instanceof Airplane) {
				System.out.println("=================");
				((Airplane) t).displayDetails();
				System.out.println("=================");
			}
		}
	}
	
	public void displayAirplaneDetails() {
		for (Vehicle a : transportation) {
			if (a instanceof Airplane) {
				((Airplane) a).displayDetails();
			}
		}
	}

}
