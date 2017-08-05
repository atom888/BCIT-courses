/**
 * DayDisplay Class
 *
 * @author Adam Dipinto
 * @version V1.0 May 27 2017
 */
public class DayDisplay
{
    private NumberDisplay dayNumber;
    public static final int NUMBER_OF_DAYS_IN_WEEK = 7;
    public static final int INVALID = 00;
    public static final int SUNDAY = 0;
    public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 3;
    public static final int THURSDAY = 4;
    public static final int FRIDAY = 5;
    public static final int SATURDAY = 6;
    public static final int MIN_DAY_NUMBER = 0;
    public static final int MAX_DAY_NUMBER = 6;
    
    public static final String SUNDAY_STRING = "Sunday";
    public static final String MONDAY_STRING = "Monday";
    public static final String TUESDAY_STRING = "Tuesday";
    public static final String WEDNESDAY_STRING = "Wednesday";
    public static final String THURSDAY_STRING = "Thursday";
    public static final String FRIDAY_STRING = "Friday";
    public static final String SATURDAY_STRING = "Saturday";

    /**
     * This is the first constructor that expects the integer between 0 to 6 representing the day of the week to be stored
     * in dayNumber 
     * @param int theDayNumber
     */
    public DayDisplay(int theDayNumber)
    {
     if (theDayNumber >= MIN_DAY_NUMBER && theDayNumber <= MAX_DAY_NUMBER) {
        dayNumber = new NumberDisplay(NUMBER_OF_DAYS_IN_WEEK);
        dayNumber.setValue(theDayNumber);
     }  else {
        dayNumber = new NumberDisplay(0);
        System.out.println("Error - please provide a value between 0 and 6");
        }
    }
    
    /**
     * This second constructor takes a String parameter for the day of the week
     * @param String nameOfTheDay
     */
    public DayDisplay(String nameOfTheDay)
    {
       if (nameOfTheDay != null) {
           dayNumber = new NumberDisplay(NUMBER_OF_DAYS_IN_WEEK);
       }
       if (nameOfTheDay.equalsIgnoreCase(SUNDAY_STRING)){
           dayNumber = new NumberDisplay(NUMBER_OF_DAYS_IN_WEEK);
           dayNumber.setValue(SUNDAY);
       } else if (nameOfTheDay.equalsIgnoreCase(MONDAY_STRING)) {
           dayNumber = new NumberDisplay(NUMBER_OF_DAYS_IN_WEEK);
           dayNumber.setValue(MONDAY);
       } else if (nameOfTheDay.equalsIgnoreCase(TUESDAY_STRING)) {
           dayNumber = new NumberDisplay(NUMBER_OF_DAYS_IN_WEEK);
           dayNumber.setValue(TUESDAY);
       } else if (nameOfTheDay.equalsIgnoreCase(WEDNESDAY_STRING)) {
           dayNumber = new NumberDisplay(NUMBER_OF_DAYS_IN_WEEK);
           dayNumber.setValue(WEDNESDAY);
       } else if (nameOfTheDay.equalsIgnoreCase(THURSDAY_STRING)) {
           dayNumber = new NumberDisplay(NUMBER_OF_DAYS_IN_WEEK);
           dayNumber.setValue(THURSDAY);
       } else if (nameOfTheDay.equalsIgnoreCase(FRIDAY_STRING)) {
           dayNumber = new NumberDisplay(NUMBER_OF_DAYS_IN_WEEK);
           dayNumber.setValue(FRIDAY);
       } else if (nameOfTheDay.equalsIgnoreCase(SATURDAY_STRING)) {
           dayNumber = new NumberDisplay(NUMBER_OF_DAYS_IN_WEEK);
           dayNumber.setValue(SATURDAY);
       } else {
           System.out.println("invalid day name");
       }
       System.out.println("day cannot be empty"); 
    }
    
    /**
     * Constructor 3
     * @param NumberDislay theDay
     */
    public DayDisplay(NumberDisplay theDay)
    {
       dayNumber = theDay;
    }
    /**
     * getDayOfTheWeek
     * @return the String value of the day of the week when dayNumber has an int value.
     */
    public String getDayOfTheWeek()
    {
     if(dayNumber.getValue() == SUNDAY) {
         return SUNDAY_STRING;
     }  else if(dayNumber.getValue() == MONDAY) {
         return MONDAY_STRING;
     } else if(dayNumber.getValue() == TUESDAY) {
         return TUESDAY_STRING;
     } else if(dayNumber.getValue() == WEDNESDAY) {
         return WEDNESDAY_STRING;
     } else if(dayNumber.getValue() == THURSDAY) {
         return THURSDAY_STRING;
     } else if(dayNumber.getValue() == FRIDAY) {
         return FRIDAY_STRING;
     } else if(dayNumber.getValue() == SATURDAY) {
         return SATURDAY_STRING;
     } else {
         return "Incorrect input for day number";
     }   
    }
    /**
     * getDayOfTheWeekValue
     * @return the int value of the day of the week 
     */
    public int getDayOfTheWeekValue() {
        if(dayNumber.getValue() == SUNDAY) {
         return SUNDAY;
     }  else if(dayNumber.getValue() == MONDAY) {
         return MONDAY;
     } else if(dayNumber.getValue() == TUESDAY) {
         return TUESDAY;
     } else if(dayNumber.getValue() == WEDNESDAY) {
         return WEDNESDAY;
     } else if(dayNumber.getValue() == THURSDAY) {
         return THURSDAY;
     } else if(dayNumber.getValue() == FRIDAY) {
         return FRIDAY;
     } else if(dayNumber.getValue() == SATURDAY) {
         return SATURDAY;
     } else {
         return INVALID;
     } 
    }
   
    public void incrementDay() {
        if (dayNumber.getValue() == SUNDAY) {
            dayNumber.increment();
        } else if(dayNumber.getValue() == MONDAY) {
            dayNumber.increment();
        } else if(dayNumber.getValue() == TUESDAY) {
            dayNumber.increment();
        } else if(dayNumber.getValue() == WEDNESDAY) {
            dayNumber.increment();
        } else if(dayNumber.getValue() == THURSDAY) {
            dayNumber.increment();
        } else if(dayNumber.getValue() == FRIDAY) {
            dayNumber.increment();
        } else if(dayNumber.getValue() == SATURDAY) {
            dayNumber.increment();
        }
        
    }
    
    /**
     * @return a String corresponding to the next day. 
     */
    public String getWhatDayIsTomorrow() {
        if(dayNumber.getValue() == SUNDAY) {
            return MONDAY_STRING;
        } else if(dayNumber.getValue() == MONDAY) {
            return TUESDAY_STRING;
        } else if(dayNumber.getValue() == TUESDAY) {
            return WEDNESDAY_STRING;
        } else if(dayNumber.getValue() == WEDNESDAY) {
            return THURSDAY_STRING;
        } else if(dayNumber.getValue() == THURSDAY) {
            return FRIDAY_STRING;
        } else if(dayNumber.getValue() == FRIDAY) {
            return SATURDAY_STRING;
        } else if(dayNumber.getValue() == SATURDAY) {
            return SUNDAY_STRING;
        } else {
            return "Invalid response";
        }
    }
    /**
    *printDetails
    *prints a statement using the dayOfTheWeekValue and dayOfTheWeek String
    */
    public void printDetails() {
        System.out.println( "Today is day " + getDayOfTheWeekValue() + " which is " + getDayOfTheWeek());
    }
}
