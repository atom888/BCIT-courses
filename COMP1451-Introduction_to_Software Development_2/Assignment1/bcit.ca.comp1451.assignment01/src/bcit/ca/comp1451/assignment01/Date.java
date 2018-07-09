/**
 * 
 */
package bcit.ca.comp1451.assignment01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/**
 * @author adamdipinto
 *
 */
public class Date {
	private int day;
	private int month;
	private int year;
	
	public static final int FIRST_DAY = 1;
	public static final int LAST_DAY = 31;
	public static final String LEADING_ZERO = "0";
	public static final int MIN_ZERO = 10;
	public static final int FIRST_MONTH = 1;
	public static final int LAST_MONTH = 12;
	public static final int ACCEPTABLE_YEAR = 1900;
	
	
	private HashMap<Integer, String> monthNames;
	
	public Date(int day, int month, int year) {
		setDay(day);
		setMonth(month);
		setYear(year);
		monthNames = new HashMap<Integer, String>();
		populateMonths();
	}
	
	/**
	 * @return the day
	 */
	public int getDay() {
		return day;
	}

	/**
	 * @param day the day to set
	 */
	public void setDay(int day) {
		if (day >= FIRST_DAY && day <= LAST_DAY) {
			this.day = day;
		} else {
			this.day = FIRST_DAY;
		}
	}

	/**
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * @param month the month to set
	 */
	public void setMonth(int month) {
		if (month >= FIRST_MONTH && month <= LAST_MONTH) {
			this.month = month;
		} else {
			this.month = FIRST_MONTH;
		}
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		if (year >= ACCEPTABLE_YEAR) {
			this.year = year;
		} else {
			this.year = ACCEPTABLE_YEAR;
		}
	}
	
	private void populateMonths() {
		monthNames.put(1, "January");
		monthNames.put(2, "Febuary");
		monthNames.put(3, "March");
		monthNames.put(4, "April");
		monthNames.put(5, "May");
		monthNames.put(6, "June");
		monthNames.put(7, "July");
		monthNames.put(8, "August");
		monthNames.put(9, "September");
		monthNames.put(10, "October");
		monthNames.put(11, "November");
		monthNames.put(12, "December");
	}
	
	public String displayStructuredDate(int day, int month, int year) {
		String structureDate = "";
		String monthName = "";
		String dayString = "";
		
		
		if (day > 0 && day < MIN_ZERO) {
			this.day = day;
			dayString = Integer.toString(day);
			dayString = LEADING_ZERO + day;
		} else {
			this.day = day;
			dayString = Integer.toString(day);
		}
		
		Set<Map.Entry<Integer, String>> monthSet = monthNames.entrySet();
		for (Entry<Integer, String> m : monthSet) {
			if (m.getKey().equals(month)) {
				monthName = m.getValue();
			}
		}
		
		structureDate = dayString + "/" + monthName + "/" + year;
		return structureDate;
	}
	

}
