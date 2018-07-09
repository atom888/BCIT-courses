/**
 * 
 */
package ca.bcit.comp1451.Session1LabB;

/**
 * @author adamdipinto
 *
 */
public class Member {
	public static final int FIRST_MONTH = 1;
	public static final int LAST_MONTH = 12;
	public static final int CURRENT_YEAR = 2018;
	public static final String DEFAULT_NAME = "unknown";
	
	private String firstName;
	private String lastName;
	private int monthJoined;
	private int yearJoined;
	
	public Member(String first, String last, int month, int year) {
		setFirstName(first);
		setLastName(last);
		setMonthJoined(month);
		setYearJoined(year);
	}
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		if (firstName != null && !firstName.trim().isEmpty()) {
			this.firstName = firstName;
		} else {
			throw new IllegalArgumentException("The first name can not be null");
		}
		
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		if (lastName != null && !lastName.trim().isEmpty()) {
			this.lastName = lastName;
		} else {
			throw new IllegalArgumentException("The last name can not be null");
		}
	}

	/**
	 * @return the monthJoined
	 */
	public int getMonthJoined() {
		return monthJoined;
	}

	/**
	 * @param monthJoined the monthJoined to set
	 */
	public void setMonthJoined(int monthJoined) {
		if (monthJoined > FIRST_MONTH && monthJoined <= LAST_MONTH) {
			this.monthJoined = monthJoined;
		} else {
			this.monthJoined = FIRST_MONTH;
		}
		
	}

	/**
	 * @return the yearJoined
	 */
	public int getYearJoined() {
		return yearJoined;
	}

	/**
	 * @param yearJoined the yearJoined to set
	 */
	public void setYearJoined(int yearJoined) {
		if (yearJoined > 0 && yearJoined <= CURRENT_YEAR) {
			this.yearJoined = yearJoined;
		} else {
			throw new IllegalArgumentException("The year value provided was not valid");
		}
		
	}

	
}
