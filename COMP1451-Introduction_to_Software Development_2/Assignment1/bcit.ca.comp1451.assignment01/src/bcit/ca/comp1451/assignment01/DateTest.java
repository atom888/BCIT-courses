/**
 * 
 */
package bcit.ca.comp1451.assignment01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author adamdipinto
 *
 */
class DateTest {
	
	private Date date1;
	private int day1;
	private int month1;
	private int year1;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		date1 = new Date(2,4,1998);
		day1 = 2;
		month1 = 4;
		year1 = 1998;
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		date1 = null;
	}

	/**
	 * Test method for {@link bcit.ca.comp1451.assignment01.Date#getDay()}.
	 */
	@Test
	void testGetDay() {
		assertEquals(02, date1.getDay());
	}
	
	/**
	 * Test method for {@link bcit.ca.comp1451.assignment01.Date#getDay()}.
	 */
	@Test
	void testGetDayNegative() {
		date1.setDay(0);
		assertEquals(01, date1.getDay());
	}
	
	/**
	 * Test method for {@link bcit.ca.comp1451.assignment01.Date#getDay()}.
	 */
	@Test
	void testGetDayBoudary() {
		date1.setDay(31);
		assertEquals(31, date1.getDay());
	}

	/**
	 * Test method for {@link bcit.ca.comp1451.assignment01.Date#getMonth()}.
	 */
	@Test
	void testGetMonth() {
		assertEquals(04, date1.getMonth());
	}
	
	/**
	 * Test method for {@link bcit.ca.comp1451.assignment01.Date#getMonth()}.
	 */
	@Test
	void testGetMonthNegative() {
		date1.setMonth(0);
		assertEquals(01, date1.getMonth());
	}
	
	/**
	 * Test method for {@link bcit.ca.comp1451.assignment01.Date#getMonth()}.
	 */
	@Test
	void testGetMonthBoundary() {
		date1.setMonth(12);
		assertEquals(12, date1.getMonth());
	}

	/**
	 * Test method for {@link bcit.ca.comp1451.assignment01.Date#getYear()}.
	 */
	@Test
	void testGetYear() {
		assertEquals(1998, date1.getYear());
	}
	
	/**
	 * Test method for {@link bcit.ca.comp1451.assignment01.Date#getYear()}.
	 */
	@Test
	void testGetYearNegative() {
		date1.setYear(1899);
		assertEquals(1900, date1.getYear());
	}
	
	/**
	 * Test method for {@link bcit.ca.comp1451.assignment01.Date#getYear()}.
	 */
	@Test
	void testGetYearBoundary() {
		date1.setYear(2018);
		assertEquals(2018, date1.getYear());
	}
	
	/**
	 * Test method for {@link bcit.ca.comp1451.assignment01.Date#displayStructuredDate()}.
	 */
	void testDisplayStructuredDate() {
		date1.displayStructuredDate(day1, month1, year1);
		assertEquals("02/April/1998", date1.displayStructuredDate(day1, month1, year1));
	}



}
