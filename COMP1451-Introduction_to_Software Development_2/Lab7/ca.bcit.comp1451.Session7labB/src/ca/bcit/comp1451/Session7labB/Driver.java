/**
 * 
 */
package ca.bcit.comp1451.Session7labB;

import java.util.ArrayList;

/**
 * @author adamdipinto
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Employee> employeeList= new ArrayList<Employee>();
		
		SalesEmployee salesOne = new SalesEmployee("Jedd", 12, 24.0);
		SalesEmployee salesTwo = new SalesEmployee("Chelsea", 23, 16.0);
		
		HourlyEmployee hourOne = new HourlyEmployee("Jake", 40, 12.0);
		HourlyEmployee hourTwo = new HourlyEmployee("Mel", 37, 16.0);
		
		employeeList.add(salesOne);
		employeeList.add(salesTwo);
		employeeList.add(hourOne);
		employeeList.add(hourTwo);
		
		for (Employee e: employeeList) {
			System.out.println(e);
		}
		
	}

}
