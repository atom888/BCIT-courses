/**
 * 
 */
package ca.bcit.comp1451.Session8LabA;

import java.util.ArrayList;


/**
 * @author adamdipinto
 *
 */
public class Driver {
	private static ArrayList<Displayable> list;

	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		list = new ArrayList<Displayable>();
		
		Date firstDate = new Date(2,7,2017);
		TwelveHourClock firstTwelveClock = new TwelveHourClock(2,8,3,"am");
		TwelveHourClock secondTwelveClock = new TwelveHourClock(10,18,35,"pm");
		
		TwentyfourHourClock firstTwentyFourClock = new TwentyfourHourClock(5,1,0);
		TwentyfourHourClock secondTwentyFourClock = new TwentyfourHourClock(18,10,5);
		
		list.add(firstDate);
		list.add(firstTwelveClock);
		list.add(secondTwelveClock);
		list.add(firstTwentyFourClock);
		list.add(secondTwentyFourClock);
		
		for (Displayable e: list) {
			System.out.println(e.getStringValue());
		}
	}

}
