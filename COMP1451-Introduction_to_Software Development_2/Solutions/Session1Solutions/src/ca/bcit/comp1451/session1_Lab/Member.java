package ca.bcit.comp1451.session1_Lab;
/**
 * 
 * @author Rana
 * 20/01/2017
 */


public class Member {
	public static final int FIRST_MONTH = 1;
	public static final int LAST_MONTH = 12;
	public static final int CURRENT_YEAR = 2017;
	public static final String DEFAULT_String = "unknown";

	private String firstName;
	private String lastName;
	private int joiningMonth;
	private int joiningYear;

	
	
	/**
	 * @param inputFirstName
	 * @param inputLastName
	 * @param inputMonth
	 * @param inputYear
	 */
	public Member(String inputFirstName, String inputLastName, int inputMonth, int inputYear) {
		setFirstName(inputFirstName);
		setLastName(inputLastName);
		setJoiningMonth(inputMonth);
		setJoiningYear(inputYear);
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	
	/**
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		if (firstName != null && !firstName.isEmpty()) {
			this.firstName = firstName;
		} else {
			throw new IllegalArgumentException(" first name cannot be null or an empty String");
		}
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	
	/**
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		if (lastName != null && ! lastName.isEmpty()) {
			this.lastName = lastName;
		} else {
			throw new IllegalArgumentException(" last name cannot be null or an empty String");
		}
	}

	/**
	 * @return the joiningMonth
	 */
	public int getJoiningMonth() {
		return joiningMonth;
	}

	/**
	 * @param joiningMonth
	 *           
	 */
	public void setJoiningMonth(int joiningMonth) {
		if (joiningMonth >= FIRST_MONTH &&   joiningMonth <= LAST_MONTH) {
			this.joiningMonth = joiningMonth;
		} else {
			this.joiningMonth = FIRST_MONTH;
		}
	}

	/**
	 * @return the joiningYear
	 */
	public int getJoiningYear() {
		return joiningYear;
	}

	/**
	 * @param joiningYear
	 *            
	 */
	public void setJoiningYear(int joiningYear) {
		if ( joiningYear > 0 && joiningYear <= CURRENT_YEAR) {
			this.joiningYear = joiningYear;
		} else {
			throw new IllegalArgumentException(" year cannot be less than 1900 or greater than the current year");
		}
	}

	/**
	 * print details of a member
	 */
	public void displayDetails() {
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Month joined: " + joiningMonth);
		System.out.println("Year joined: " + joiningYear);
	}
}
