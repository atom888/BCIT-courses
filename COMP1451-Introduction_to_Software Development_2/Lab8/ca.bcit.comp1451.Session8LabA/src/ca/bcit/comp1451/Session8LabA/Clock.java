/**
 * 
 */
package ca.bcit.comp1451.Session8LabA;

/**
 * @author adamdipinto
 *
 */
public abstract class Clock implements Displayable {
	
	private int minute;
	private int second;
	private static int LAST_VALUE = 59;
	
	
	/**
	 * @param minute
	 * @param second
	 */
	public Clock(int minute, int second) {
		setMinute(minute);
		setSecond(second);
	}



	/**
	 * @return the minute
	 */
	public int getMinute() {
		return minute;
	}



	/**
	 * @param minute the minute to set
	 */
	public void setMinute(int minute) {
		if (minute >= 0 && minute <= LAST_VALUE) {
			this.minute = minute;
		} else {
			this.minute = 0;
		}
		
	}



	/**
	 * @return the second
	 */
	public int getSecond() {
		return second;
	}



	/**
	 * @param second the second to set
	 */
	public void setSecond(int second) {
		if (second >= 0 && second <= LAST_VALUE) {
			this.second = second;
		} else {
			this.second = 0;
		}
		
	}

	public abstract void setHour(int hour);
	
	public abstract int getHour();


	

}
