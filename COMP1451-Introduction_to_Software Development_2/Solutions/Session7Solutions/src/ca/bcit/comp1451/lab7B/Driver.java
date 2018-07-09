/**
 * 
 */
package ca.bcit.comp1451.lab7B;

/**
 * @author Rana
 *
 */
import java.util.ArrayList;
public class Driver {
	
private ArrayList<Employee> list;

public Driver(){
	list = new ArrayList<Employee>();
}

public void loadCollection(){
 list.add(new SalesEmployee("Bob adams", 15, 10.0));
 list.add(new SalesEmployee(" Micheal Jones", 20, 20.0));
 list.add(new HourlyEmployee("John Smith", 45, 30.15));
 list.add(new HourlyEmployee("Jane Wong", 80, 20.25));
}


public void displayAll(){
	for(Employee e :list){
		
	System.out.println(e);
	}
}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Driver list = new Driver();
		list.loadCollection();
		list.displayAll();

	}

}
