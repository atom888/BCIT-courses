/**
 * 
 */
package ca.bcit.comp1451.session05LabSolutions.LabB;

/**
 * 
 * @author A00749008
 */

import java.util.ArrayList;


public class Transportation {

	private ArrayList<Vehicle> vehicles;
	
	/**
	 * non-default Transportation constructor
	 */
	public Transportation(){
		vehicles = new ArrayList<Vehicle>();
	}
	
	/**
	 * Method loadCollection
	 * 
	 */
	public void loadCollection(){
		
			vehicles.add(new Car (1990,"porsche","944 S2",208));
			vehicles.add(new Boat(2017,"yamaha","242X E",true));
			vehicles.add(new Airplane(1976,"BAC" ,"concorde",18300));
		
	}
	
	/**
	 * Method displayAllDetail
	 * displays details of all the objects in the ArrayList
	 */
	public void displayAllDetail(){
		
	        for(Vehicle v : vehicles){
				if(v.getClass().getName().equals("ca.bcit.comp1451.session05LabSolutions.LabB.Car")){
					Car c = (Car)v;
					c.displayDetails();
				} else if (v instanceof Boat){
					 ((Boat)v).displayDetails();
					
				} else {
					 ((Airplane)v).displayDetails();
					
				}
				
			}
	        
	        }
	
	
	/**
	 * Method displayAirplane
	 * display details of Airplane in ArrayList
	 */
	public void displayAirplane(){
		for(Vehicle v : vehicles){
			if(v instanceof Airplane){
				((Airplane)v).displayDetails();
				
			}
			
		}
	}
	
	
	
	public static void main(String[] args){
		Transportation t1 = new Transportation();
		
		t1.loadCollection();
		t1.displayAirplane();
		t1.displayAllDetail();
	}
	
	
	
}
