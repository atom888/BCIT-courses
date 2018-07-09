/**
 * 
 */
package ca.bcit.comp1451.lab7B;

/**
 * @author Rana
 *
 */
public abstract class Employee {
	private String name;

	/**
	 * Abstract Employee class
	 * @param name The employee's name
	 */
	public Employee(String name) {
		setName(name);
	}

	/**
	 * Get the name of the employee
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the name of the employee
	 * @param name the name to set
	 */
	public void setName(String name) {
		if (name != null && name.length()>0){
			this.name = name;
		}
		else{
			this.name = "Unknown";
		}
	}
	
	/**
	 * Calculate the total pay. Abstract, implemented in the child classes
	 * @return The rate of pay
	 */
	public abstract double calculatePay();

	@Override
	public String toString() {
		return "Employee name: " + getName();
	}
	
	

}
