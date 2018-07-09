package ca.bcit.comp1451.session04LabASolution;
import java.util.Calendar;
public class Time {
	

	  private static final int SECONDS_PER_MINUTE = 60;
	  private static final int MINUTES_PER_HOUR = 60;
	  private static final int SECONDS_PER_HOUR = 3600;
	  private static final int HOURS_PER_DAY = 24;

	  

	  private int hours;
	  private int minutes;
	  private int seconds;


	  /**
	   * Creates a Time object representing the current time.
	   */
	  public Time()
	  {
	    Calendar now = Calendar.getInstance();

	    hours = now.get(Calendar.HOUR_OF_DAY);
	    minutes = now.get(Calendar.MINUTE);
	    seconds = now.get(Calendar.SECOND);
	  }


	  /**
	   * Creates a Time object representing a user-specified time.
	   *
	   * Note that the hours component must be specified using the
	   * 24-hour clock.
	   *
	   * @param h hours
	   * @param m minutes
	   * @param s seconds
	   *
	   */
	  public Time(int h, int m, int s)
	  {
	  
		  setHours(h);
		  setMinutes(m);
		  setSeconds(s);
	  }


	  /**
	   * Creates a Time object representing a user-specified time.
	   *
	   * The time is supplied as a string containing two integer values
	   * representing hours and minutes or three integer values representing
	   * hours, minutes and seconds, hours being specified using the 24-hour
	   * clock in either case. The values must be separated from each other by
	   * a colon.
	   *
	   * @param timeString string containing hours, minutes and seconds
	   * 
	   */
	  public Time(String timeString)
	  {
	    String[] parts = timeString.split(":");
	    if (parts.length < 2 || parts.length > 3) {
	     
	    	System.out.println("invalid time ");
	    }
	    else{

	    setHours( Integer.parseInt(parts[0]));
	    setMinutes( Integer.parseInt(parts[1]));
	    setSeconds( Integer.parseInt(parts[2]));
	    }
	  }


	  /**
	   * @return Hours component of this time
	   */
	  public int getHours()
	  {
	    return hours;
	  }


	  /**
	   * @return Minutes component of this time
	   */
	  public int getMinutes()
	  {
	    return minutes;
	  }


	  /**
	   * @return Seconds component of this time
	   */
	  public int getSeconds()
	  {
	    return seconds;
	  }

       
	  /**
	 * @param hours the hours to set
	 */
	public void setHours(int hours) {
		if (hours < 0 || hours > HOURS_PER_DAY) {
		   System.out.println("invalid  hours number");
		}
		else{
			this.hours = hours;
		}
		
	}


	/**
	 * @param minutes the minutes to set
	 */
	public void setMinutes(int minutes) {
		if (minutes < 0 || minutes >= MINUTES_PER_HOUR){
			System.out.println("invalid  minutes number");
		}
		else{
			this.minutes = minutes;
		}
		
	}


	/**
	 * @param seconds the seconds to set
	 */
	public void setSeconds(int seconds) {
		if (seconds < 0 || seconds >= SECONDS_PER_MINUTE) {
			System.out.println("invalid  seconds number");
		}
		else{
		this.seconds = seconds;
		}
	}


	/**
	   * Formats this time as a string containing hours, minutes and seconds.
	   *
	   * Leading zeroes are added to values if necessary and components are
	   * separated from each other by a colon.
	   *
	   * @return String representation of this time
	   */
	   public String getTimeString()
	  {
	    return String.format("%02d:%02d:%02d", getHours(), getMinutes(), getSeconds());
	  }

	  
	  /**
	   * Expresses this time as a single integer value - the number of seconds
	   * since midnight.
	   *
	   * @return Number of seconds
	   */
	  public int inSeconds()
	  {
	    int hourSec = SECONDS_PER_HOUR * hours;
	    int minSec = SECONDS_PER_MINUTE * minutes;
	    return hourSec + minSec + seconds;
	  }


	  /**
	   * Creates a Time object advanced in time relative to this one by
	   * a user-specified number of seconds.
	   *
	   * @param sec number of seconds to advance
	   * @return String object advanced in time relative to this one
	   * 
	   */
	  public String getTimePlus(int sec)
	  {
		  int h = 0;
		  int m = 0;
		  int s = 0;
		  int future = 0;
		  int remainder = 0;
	    if (sec < 0) {
	     System.out.println("invalid number of seconds");
	    }
	    else {
	       future = this.inSeconds() + sec;
	       h = (future / SECONDS_PER_HOUR) % HOURS_PER_DAY;
	       remainder = future % SECONDS_PER_HOUR;
	       m = remainder / SECONDS_PER_MINUTE;
	       s = remainder % SECONDS_PER_MINUTE;
	      
	    }
	    return String.format("%02d:%02d:%02d",h, m, s);
	  }

}
