package ca.bcit.comp1451.lab7A;

import java.util.ArrayList;

/**
 * @author Rana
 *
 */
public class Driver {
	private ArrayList<Electronics> devices;

	public Driver(){
		devices = new ArrayList<Electronics>();
		loadCollection();
	}

	/**
	 * loading the arrayList with Electronics objects
	 */
	public void loadCollection(){
		devices.add(new CellPhone("Nokia TS200", 300, 18, 3.5));
		devices.add(new Computer("Dell D2100", 1000, 24, 2500, 512));
		devices.add(new Laptop("HP N5170", 1500, 24, 1500, 256, 15));	

	}


	/**
	 * dislay the content of the collection
	 */
	public void displayAll(){
		for (Electronics d: devices){
			System.out.println(d);

		}
		System.out.println();
	}

	/**
	 * @param amount
	 */
	public void increasePrices(double amount) {
		System.out.println(" increasing the prices by "+ amount + "%");
		for (Electronics d: devices) {
			d.increasePrice(amount);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args){

		Driver demo = new Driver();
		demo.displayAll();
		demo.increasePrices(0.05);
		demo.displayAll();
	}
}
