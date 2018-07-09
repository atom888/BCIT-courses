/**
 * 
 */
package ca.bcit.comp1451.Session8LabA;

/**
 * @author adamdipinto
 *
 */
public class TwentyfourHourClock extends Clock {
	private static final int MAX_HOUR = 23;
	private static final int MIN_SEC = 10;
	private static final String LEADING_ZERO = "0";
	private int hour;
	
	/**
	 * @param minute
	 * @param second
	 */
	public TwentyfourHourClock(int hour, int minute, int second) {
		super(minute, second);
		setHour(hour);
	}

	/**
	 * @return the hour
	 */
	public int getHour() {
		return hour;
	}

	/**
	 * @param hour the hour to set
	 */
	public void setHour(int hour) {
		if (hour >= 0 && hour <= MAX_HOUR) {
			this.hour = hour;
		} else {
			this.hour = 0;
		}
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
		
		structureTime = hourString + ":" + minuteString + ":" + secondString; 
		return structureTime;
	
	}

}
