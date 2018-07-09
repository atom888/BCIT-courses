/**
 * 
 */
package ca.bcit.comp1451.Session8LabA;

/**
 * @author adamdipinto
 *
 */
public class TwelveHourClock extends Clock {
	private static final int MAX_HOUR = 11;
	private static final int MIN_SEC = 10;
	private static final String LEADING_ZERO = "0";
	private String meridiem;
	private int hour;
	/**
	 * @param minute
	 * @param second
	 */
	public TwelveHourClock(int hour, int minute, int second, String meridiem) {
		super(minute, second);
		setHour(hour);
		setMeridiem(meridiem);
	}
	/**
	 * @return the meridiem
	 */
	public String getMeridiem() {
		return meridiem;
	}
	/**
	 * @param meridiem the meridiem to set
	 */
	public void setMeridiem(String meridiem) {
		if (meridiem != null && !meridiem.isEmpty() && (meridiem.equalsIgnoreCase("am") || meridiem.equalsIgnoreCase("pm"))) {
			this.meridiem = meridiem;
		} else {
			this.meridiem = "AM";
		}
		
	}

	
	@Override
	public void setHour(int hour) {
		if (hour >= 0 && hour <= MAX_HOUR) {
			this.hour = hour;
		} else {
			this.hour = 0;
		}
		
	}
	@Override
	public int getHour() {
		return hour;
	}
	
	@Override
	public String getStringValue() {
		String structureTime = "";
		String secondString;
		String minuteString;
		String hourString;
		
		int second = getSecond();
		int minute = getMinute();
		int hour = getHour();
		
		if (second >= 0 && second < MIN_SEC) {
			secondString = Integer.toString(second);
			secondString = LEADING_ZERO + second;
		} else {
			secondString = Integer.toString(second);
		}
		
		if (minute > 0 && minute < MIN_SEC) {
			minuteString = Integer.toString(minute);
			minuteString = LEADING_ZERO + minute;
		} else {
			minuteString = Integer.toString(minute);
		}
		
		if (hour > 0 && hour < MIN_SEC) {
			hourString = Integer.toString(hour);
			hourString = LEADING_ZERO + hour;
		} else {
			hourString = Integer.toString(hour);
		}
		
		structureTime = hourString + ":" + minuteString + ":" + secondString + " " + getMeridiem(); 
		return structureTime;
	
	}
	
	
}
