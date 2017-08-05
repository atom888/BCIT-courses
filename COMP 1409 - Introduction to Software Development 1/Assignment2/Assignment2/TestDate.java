
/**
 * This Test class provides a list of dates based on provided values 
 *
 * @author Adam Dipinto
 * @version V1.0 - June 12 2017
 */
public class TestDate
{
    public static Date sampleDates[];
    /**
     * Constructor for objects of class TestDate
     */
    public TestDate()
    {
      Date date1 = new Date(1970, 11, 15);
      Date date2 = new Date(1887, 7, 31);
      Date date3 = new Date(1966, 5, 2);
      Date date4 = new Date(1980, 8, 19);
      Date date5 = new Date(2001, 9, 11);
      Date date6 = new Date(1900, 6, 26);
      Date date7 = new Date(1940, 2, 28); //Generating Thursday should be Wednesday
      Date date8 = new Date(1974, 10, 30);
      Date date9 = new Date(1914, 1, 15);
      Date date10 = new Date(1840, 10, 1);
      Date date11 = new Date(1999, 12, 31);
      Date date12 = new Date(1988, 5, 20);
      Date date13 = new Date(2012, 3, 10);
      Date date14 = new Date(2006, 4, 1);
      Date date15 = new Date(1992, 2, 29); //Generating Sunday sould be Saturday
      
      sampleDates = new Date[15];
      sampleDates[0] = date1;
      sampleDates[1] = date2;
      sampleDates[2] = date3;
      sampleDates[3] = date4;
      sampleDates[4] = date5;
      sampleDates[5] = date6;
      sampleDates[6] = date7;
      sampleDates[7] = date8;
      sampleDates[8] = date9;
      sampleDates[9] = date10;
      sampleDates[10] = date11;
      sampleDates[11] = date12;
      sampleDates[12] = date13;
      sampleDates[13] = date14;
      sampleDates[14] = date15; 
      
      int length = sampleDates.length;
      String result = "";
      int i = 0;
      while (i < length) {
          result = (sampleDates[i]).getDayOfTheWeek();
          System.out.println(result);
          i++;
      }
      
      
    }

    /**
     *@returns getSampleDates - returns a list of dates given the sample dates provided
     */
    public void getSampleDates() 
    {
      int length = TestDate.sampleDates.length; 
      String result = "";  
      int i = 0;
      while (i < TestDate.sampleDates.length) {
          result = (sampleDates[i]).getDayOfTheWeek();
          i++;
          System.out.println(result);
      }
      
    }
}
