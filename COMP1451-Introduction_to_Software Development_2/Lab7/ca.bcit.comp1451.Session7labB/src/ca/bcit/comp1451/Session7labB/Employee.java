/**
 * 
 */
package ca.bcit.comp1451.Session7labB;

/**
 * @author adamdipinto
 *
 */
public abstract class Employee {
	private String name;

	/**
	 * @param name
	 */
	public Employee(String name) {
		setName(name);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
		} else {
			throw new IllegalArgumentException("Incorrect Value.");
		}
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	public abstract double calculatePay();

}
