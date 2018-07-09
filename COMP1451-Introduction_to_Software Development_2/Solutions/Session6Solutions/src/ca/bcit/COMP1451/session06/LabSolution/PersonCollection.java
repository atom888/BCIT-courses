/**
 * 
 */
package ca.bcit.COMP1451.session06.LabSolution;

/**
 * @author Rana
 *
 */
import java.util.ArrayList;
import java.util.Iterator;

public class PersonCollection {
	private ArrayList<Person> people;

	public PersonCollection() {
		people = new ArrayList<Person>();
	}

	/**
	 * 
	 * @param p
	 */
	public void loadCollection() {
		people.add(new Student("James", 20, true, 75.5));
		people.add(new Student("Max", 23, false, 80.0));
		people.add(new Student("Jane", 21, true, 70.0));
		people.add(new Employee("Alex", 30, 45000, 60));
		people.add(new Employee("Adam", 35, 30000, 36));
		people.add(new Employee("Smith", 40, 40000, 40));
	}

	/**
	 * 
	 * @param e
	 */
	public void add(Person e) {
		people.add(e);
	}

	/**
	 * 
	 * /** display all details
	 */
	public void displayAllDetail() {
		for (Person p : people) {
			System.out.println(p);
		}
	}

	/**
	 * test equality
	 */
	public void testEquality() {
        System.out.println("\n \n Testing Equality ");
		Student s1 = new Student("Adam Smith", 28, false, 85.3);
		Student s2 = new Student("Adam Smith", 20, true, 85.3);
		System.out.println(s1);
		System.out.println(s2);
		System.out.print("Both student are equal ? ");
		System.out.println(s1.equals(s2));

		Employee e1 = new Employee("Jane Black", 28, 65000, 47);
		Employee e2 = new Employee("Jane Black", 28, 120000, 34);
		System.out.println(e1);
		System.out.println(e2);
		System.out.print("Both employees are equal? ");
		System.out.println(e1.equals(e2));

	}
}
