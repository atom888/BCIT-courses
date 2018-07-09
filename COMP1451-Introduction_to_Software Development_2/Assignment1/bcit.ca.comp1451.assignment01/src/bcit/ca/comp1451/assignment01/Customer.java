/**
 * 
 */
package bcit.ca.comp1451.assignment01;

/**
 * @author adamdipinto
 *
 */
public class Customer {
	private String name;
	private String address;
	private Date dateOfBirth;
	
	public Customer(String name, String address, Date dateOfBirth) {
		setName(name);
		setAddress(address);
		setDateOfBirth(dateOfBirth);
	}
	
	public String formatName(String name) {
		String result = "";
		if(name != null) {
			result = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
		}
		return result;
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
		if (name != null && !name.trim().isEmpty()) {
			this.name = formatName(name);
		} else {
			throw new IllegalArgumentException("Name can not be null");
		}
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		if (address != null && !address.trim().isEmpty()) {
			this.address = address;
		} else {
			throw new IllegalArgumentException("Address can not be null");
		}
		
	}

	/**
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		if (dateOfBirth != null) {
			this.dateOfBirth = dateOfBirth;
		} else {
			throw new IllegalArgumentException("Please provide a valid value");
		}

	}
	
	public void displayCustomerInfo() {
		System.out.println("Customer Name: " + getName());
		System.out.println("Customer Address: " + getAddress());
		System.out.println("Customer Date of Birth: " + getDateOfBirth());
	}

}
