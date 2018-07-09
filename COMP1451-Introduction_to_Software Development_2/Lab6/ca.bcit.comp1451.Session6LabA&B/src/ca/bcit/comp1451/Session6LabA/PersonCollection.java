/**
 * 
 */
package ca.bcit.comp1451.Session6LabA;

import java.util.ArrayList;

/**
 * @author A01034457
 *
 */
public class PersonCollection {
	
	private ArrayList<Person> person;
	
	public PersonCollection() {
		person = new ArrayList<Person>();
	}
	
	public void loadCollection() {
		Person employee = new Employee("Jason Wong", 40, 30.0, 66);
		Person student = new Student("Adam Wong", 21, false, 75.8);

//		LabA
//		person.add(employee);
//		person.add(student);
	}
	
	public void displayAllDetails() {
		for (Person p : person) {
			if (p instanceof Employee) {
				System.out.println(p.toString());
			} else if (p instanceof Student) {
				System.out.println(p);
			}
		}	
	}
	
	public void testEquality() {
		Person student1 = new Student("Chelsea Osmond", 25, true, 66.6);
		Person student2 = new Student("Chelsea Osmond", 18, false, 66.6);
		
		person.add(student1);
		person.add(student2);
		
		student1.equals(student2);
		
		Person employee1 = new Employee("Ben Smith", 25, 30.0, 66);
		Person employee2 = new Employee("Ben Smith", 18, 66.0, 66);
		
		person.add(employee1);
		person.add(employee2);
		
		employee1.equals(employee2);
	}
}
