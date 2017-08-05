
/**
 * This Date class will provide information relating to the Date, determining the day of the week, determining a leap year, presented a formatted date,provide the month name and value.
 *
 * @author Adam Dipinto
 * @version V1.0 June4 2017
 */
public class Date
{
    
    public int year;
    public int month;
    public int day;
    public int daysInMonth;
    
    public static final int DAY_1 = 1;
    public static final int DAY_28 = 28;
    public static final int DAY_29 = 29;
    public static final int DAY_30 = 30;
    public static final int DAY_31 = 31;
    
    
    public static final int CURRENT_YEAR = 2017;
    public static final int EARLIEST_YEAR = 0;
    public static final int LOWEST_PADDED_VALUE = 10;
    
    public static final int SUNDAY = 0;
    public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 3;
    public static final int THURSDAY = 4;
    public static final int FRIDAY = 5;
    public static final int SATURDAY = 6;
    
    public static final String SUNDAY_STRING = "Sunday";
    public static final String MONDAY_STRING = "Monday";
    public static final String TUESDAY_STRING = "Tuesday";
    public static final String WEDNESDAY_STRING = "Wednesday";
    public static final String THURSDAY_STRING = "Thursday";
    public static final String FRIDAY_STRING = "Friday";
    public static final String SATURDAY_STRING = "Saturday";
   
    public static final int JANUARY = 1;
    public static final int FEBRUARY = 2;
    public static final int MARCH = 3;
    public static final int APRIL = 4;
    public static final int MAY = 5;
    public static final int JUNE = 6;
    public static final int JULY = 7;
    public static final int AUGUST = 8;
    public static final int SEPTEMBER = 9;
    public static final int OCTOBER = 10;
    public static final int NOVEMBER = 11;
    public static final int DECEMBER = 12;
    
    public static final String JANUARY_STRING = "January";
    public static final String FEBRUARY_STRING = "February";
    public static final String MARCH_STRING = "March";
    public static final String APRIL_STRING = "April";
    public static final String MAY_STRING = "May";
    public static final String JUNE_STRING = "June";
    public static final String JULY_STRING = "July";
    public static final String AUGUST_STRING = "August";
    public static final String SEPTEMBER_STRING = "September";
    public static final String OCTOBER_STRING = "October";
    public static final String NOVEMBER_STRING = "November";
    public static final String DECEMBER_STRING = "December";

    /**
     * Default Constructor that sets the date to January 1 2017
     */
    public Date()
    {
        day = MONDAY;
        month = JANUARY;
        year = CURRENT_YEAR;
    }
    /**
     * Constructor #2 ensures dates are valid
     * @param newYear  - value must be between 0 and 2017
     * @param newMonth - value must be between 1 and 12
     * @param newDay - value must be between 1 and 31
     */
    public Date(int newYear, int newMonth, int newDay) {
           
    if (newMonth >= JANUARY && newMonth <= DECEMBER) {
        month = newMonth;
    }
    
    if (newYear >= EARLIEST_YEAR && newYear <= CURRENT_YEAR) {
        year = newYear;
    }
    
    if (newDay >= DAY_1 && newDay <= DAY_31) {
        day = newDay;
    }
    
    if (newMonth > DECEMBER) {
        month = JANUARY;
        year = CURRENT_YEAR;
        day = DAY_1;
    }
    if (newYear < EARLIEST_YEAR || newYear > CURRENT_YEAR) {
        month = JANUARY;
        year = CURRENT_YEAR;
        day = DAY_1;
    }
    if (newDay > DAY_31) {
        month = JANUARY;
        year = CURRENT_YEAR;
        day = DAY_1;
    }
    
    if (newDay > getNumberOfDaysInThisMonth()) {
        month = JANUARY;
        year = CURRENT_YEAR;
        day = DAY_1;
    }
    
    }
    
    /**
     * @return getDayOfTheWeek - returns the day (String) based on the date provided
    */
    public String getDayOfTheWeek() {
       int lastTwoDigitsYear = year % 100; // 50
       int lastTwoDigitsRemainderTwelve = lastTwoDigitsYear / 12; // 4
       int remainderTwelve = Math.abs(lastTwoDigitsYear - (lastTwoDigitsRemainderTwelve * 12)); // 2
       int remainderFour = remainderTwelve / 4; // 0
       int dayOfTheWeek;
       String returnValue;
       
       int monthCodeValue;
       
       if (month == JANUARY || month == OCTOBER) {
           monthCodeValue = 1;
       } else if (month == FEBRUARY || month == MARCH || month == NOVEMBER) {
           monthCodeValue = 4;
       } else if (month == MAY) {
           monthCodeValue = 2;
       } else if (month == JUNE) {
           monthCodeValue = 5;
       } else if (month == AUGUST) {
           monthCodeValue = 3;
       } else if (month == SEPTEMBER || month == DECEMBER) {
           monthCodeValue = 6;
       } else {
           monthCodeValue = 0;
       }
       
       int firstTwoDigits = Integer.parseInt((""+year).substring(0, 2));  
       
       if (firstTwoDigits == 16 || firstTwoDigits == 20) {
           dayOfTheWeek = (lastTwoDigitsRemainderTwelve + remainderTwelve + remainderFour + day + (monthCodeValue + 6)) % 7;
       } else if (firstTwoDigits == 17 || firstTwoDigits == 21) {
           dayOfTheWeek = (lastTwoDigitsRemainderTwelve + remainderTwelve + remainderFour + day + (monthCodeValue + 4)) % 7;
       } else if (firstTwoDigits == 18) {
           dayOfTheWeek = (lastTwoDigitsRemainderTwelve + remainderTwelve + remainderFour + day + (monthCodeValue + 2)) % 7;
       } else {
           dayOfTheWeek = (lastTwoDigitsRemainderTwelve + remainderTwelve + remainderFour + day + monthCodeValue) % 7;
       }
       
           
       switch(dayOfTheWeek) {
       case 0:
        returnValue = SATURDAY_STRING;
       break;
       case 1:
        returnValue = SUNDAY_STRING;
       break;
       case 2:
        returnValue = MONDAY_STRING;
       break;
       case 3:
        returnValue = TUESDAY_STRING;
       break;
       case 4:
        returnValue = WEDNESDAY_STRING;
       break;
       case 5:
        returnValue = THURSDAY_STRING;
       break;
       case 6:
        returnValue = FRIDAY_STRING;
       break;
       default:
        returnValue = "Error";
       break;
       }

       return returnValue;
    }
    /**
     * @return isLeapYear - returns true if the year provided is a leap year, false for otherwise
    */
    
    private Boolean isLeapYear() {
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }
    /**
     * @return getNumberOfDaysInThisMonth - returns a value of the number of days in the month provided
    */
    public int getNumberOfDaysInThisMonth() {
        if (month == APRIL || month == JUNE || month == SEPTEMBER || month == NOVEMBER) {
            daysInMonth = DAY_30;
        } else if (month == FEBRUARY) {
            daysInMonth = (isLeapYear()) ? DAY_29 : DAY_28;
        } else {
            daysInMonth = DAY_31;
        }

        return daysInMonth;
    }
    /**
     * @return getFormattedDate - returns year, month, day format
    */
    public String getFormattedDate() {
        return year + "-" + getPaddedMonth() + "-" + getPaddedDay();
    }
    /**
     * @return getPaddedMonth - returns the month value with a leading zero if required
    */
    private String getPaddedMonth() {
        if (month < LOWEST_PADDED_VALUE) {
            return "0" + month;
        } else {
            return "" + month;
        }
    }
    /**
     * @return getPaddedDay - returns the day value with a leading zero if required
    */
    private String getPaddedDay() {
        if (day < LOWEST_PADDED_VALUE) {
            return "0" + day;
        } else {
            return "" + day;
        }
    }
    /**
     * @return getMonthName - returns a String value of the month provided
     * @param monthNumber - method takes in an int value for the month
    */
    public static String getMonthName(int monthNumber) {
        String returnValue;
        switch (monthNumber) {
        case 1:
            returnValue = JANUARY_STRING;
        break;
        case 2:
            returnValue = FEBRUARY_STRING;
        break;
        case 3:
            returnValue = MARCH_STRING;
        break;
        case 4:
            returnValue = APRIL_STRING;
        break;
        case 5:
            returnValue = MAY_STRING;
        break;
        case 6:
            returnValue = JUNE_STRING;
        break;
        case 7:
            returnValue = JULY_STRING;
        break;
        case 8:
            returnValue = AUGUST_STRING;
        break;
        case 9:
            returnValue = SEPTEMBER_STRING;
        break;
        case 10:
            returnValue = OCTOBER_STRING;
        break;
        case 11:
            returnValue = NOVEMBER_STRING;
        break;
        case 12:
            returnValue = DECEMBER_STRING;
        break;
        default:
            returnValue = null;
        break;
        }
        
        return returnValue;
    }
    /**
     * @param monthName - method takes in String value of monthName
     * @return getMonthNumber - returns the int value of the month 
    */
    public static int getMonthNumber(String monthName) {
        String upperMonthName = monthName.toUpperCase();
        int returnValue;
        switch (upperMonthName) {
        case "JANUARY":
            returnValue = 1;
        break;
        case "FEBRUARY":
            returnValue = 2;
        break;
        case "MARCH":
            returnValue = 3;
        break;
        case "APRIL":
            returnValue = 4;
        break;
        case "MAY":
            returnValue = 5;
        break;
        case "JUNE":
            returnValue = 6;
        break;
        case "JULY":
            returnValue = 7;
        break;
        case "AUGUST":
            returnValue = 8;
        break;
        case "SEPTEMBER":
            returnValue = 9;
        break;
        case "OCTOBER":
            returnValue = 10;
        break;
        case "NOVEMBER":
            returnValue = 11;
        break;
        case "DECEMBER":
            returnValue = 12;
        break;
        default:
            returnValue = 0;
        break;
        }

        return returnValue;
        
    }
    /**
     * @return getYear - returns the year value
    */
    public int getYear() {
        return year;
    }
    /**
     * @return getMonth - returns the month value
    */
    public int getMonth() {
        return month;
    }
    /**
     * @return getDay - returns the day value
    */
    public int getDay() {
        return day;
    }
    /**
     * @param sYear - sets the year value
    */
    public void setYear(int sYear) {
        if (sYear >= EARLIEST_YEAR && sYear <= CURRENT_YEAR) {
        year = sYear;
    }
    }
    /**
     * @param sMonth - sets the month value
    */
    public void setMonth(int sMonth) {
    if (sMonth >= JANUARY && sMonth <= DECEMBER) {
        month = sMonth;
    } 
    }
    /**
     * @param sDay - sets the day value
    */
    public void setDay(int sDay) {
        if (sDay >= DAY_1 && sDay <= DAY_31) {
        day = sDay;
    }
    }
}
