/**
 * Write a description of class HistoricalMoment here.
 *
 * @author Adam Dipinto
 * @version V1.0 Jun3 2017
 */
public class HistoricalMoment
{
    private String eventName;
    private ClockDisplay timeOfEvent;
    public static final int MIDNIGHT_HOUR = 0;
    public static final int MINUTE_ZERO = 0;

    /**
     * Constructor for objects of class HistoricalMoment
     */
    public HistoricalMoment()
    {
        eventName = "untitled event";
        timeOfEvent = new ClockDisplay(MIDNIGHT_HOUR,MINUTE_ZERO); 
    }
    /**
     * Constructor for objects of class HistoricalMoment
     */
    public HistoricalMoment(String nameOfTheEvent)
    {
        if (nameOfTheEvent == null || nameOfTheEvent.equals("")) {
            eventName = "untitled event";
            timeOfEvent = new ClockDisplay(MIDNIGHT_HOUR,MINUTE_ZERO);
        } else {
            eventName = nameOfTheEvent;
            timeOfEvent = new ClockDisplay(MIDNIGHT_HOUR,MINUTE_ZERO);
        }
    }
    /**
     * Constructor for objects of class HistoricalMoment
     */
    public HistoricalMoment(String nameOfTheEvent, ClockDisplay theTime)
    {
        if (nameOfTheEvent == null || nameOfTheEvent.equals("")) {
            eventName = "untitled event";
            timeOfEvent = new ClockDisplay(MIDNIGHT_HOUR,MINUTE_ZERO);
        } else {
            eventName = nameOfTheEvent;
            timeOfEvent = theTime;
        }
    }
    
    
    /**
     * Add one minute to the time value
     */
    public void addMinuteToTimeOfEvent()
    {
        timeOfEvent.timeTick(); 
    }
    
    /**
     * Print historical moment
     */
    public void printDetails() {
        if (timeOfEvent.getTime().equals("11:02 a.m.")) {
            eventName = "March 2013 Equinox";
        } else if (timeOfEvent.getTime().equals("11:40 p.m.")) {
            eventName = "Titanic hit an iceberg";
        } else if (timeOfEvent.getTime().equals("9:04 a.m.")) {
            eventName = "Halifax Explosion";
        } else if (timeOfEvent.getTime().equals("12:00 a.m.")) {
            eventName = "untitled event";
        } else {
            System.out.println("At " + timeOfEvent.getTime() + ", " + eventName + "!");
        }
       // System.out.println("At " + timeOfEvent.getTime() + ", " + eventName + "!");
    }
}