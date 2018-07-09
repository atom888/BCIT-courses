/**
 * 
 */
package ca.bcit.comp1451.Session8LabA;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/**
 * @author adamdipinto
 *
 */
public class Date implements Displayable {
	
	private static final int INT_YEAR = 1900;
	private static final int CURRENT_YEAR = 2018;
	public static final String LEADING_ZERO = "0";
	public static final int MIN_ZERO = 10;
	private int day;
	private int month;
	private int year;
	private HashMap<Integer, String> monthNames;
	/**
	 * @param day
	 * @param month
	 * @param year
	 */
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
		if (day >= 1&& day <= 31) {
			this.day = day;
		} else {
			this.day = 1;
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
		if (month >= 1 && month <= 12) {
			this.month = month;
		} else {
			this.month = 1;
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
		if (year >= INT_YEAR && year <= CURRENT_YEAR) {
			this.year = year;
		} else {
			this.year = INT_YEAR;
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
	
	@Override
	public String getStringValue() {
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
			if (m.getKey().equals(getMonth())) {
				monthName = m.getValue();
			}
		}
		
		structureDate = dayString + " " + monthName + " " + Integer.toString(getYear());
		return structureDate;
	}
	

}
