package ca.bcit.comp1451.session04LabASolution;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ca.bcit.comp1451.session04LabBSolution.BankAccount;

public class TimeTest {
	private Time time;
	
	@Before
	public void setUp() throws Exception {
		
	       time = new Time(11,25,36);
	}

	
	@After
	public void tearDown() throws Exception {
		time = null;
		
	}
	

	@Test
	public void testMinuteInInt(){
		
	assertEquals(25,time.getMinutes());
	
	}
	
	@Test
	public void tesHoursInInt() {
		assertEquals(11,time.getHours());
		
	}
	
	@Test
	public void tesSecondInInt() {
		assertEquals(36,time.getSeconds());
		
	}

	@Test
	public void testTimeString() {
		assertEquals("11:25:36",time.getTimeString());
	}
	@Test
	public void testTimeStringParameter(){
	Time time2 = new Time("11:59");
	assertEquals("11:59:00", time2.getTimeString());
	
	}
	
	

	@Test
	public void testSetHoursUpperLimit() {
		time.setHours(24);
		assertEquals(11,time.getHours());
		
	}	
	
	@Test
	public void testSetHoursLowerLimit() {
		time.setHours(0);
		assertEquals(0,time.getHours());
		
	}
	
	@Test
	public void testSetHoursNegative() {
		time.setHours(-1);
		assertEquals(11,time.getHours());
		
	}
	
	@Test
	public void testSetHoursNegative2() {
		time.setHours(25);
		assertEquals(11,time.getHours());
		
	}
	
	
	@Test
	public void testSetHoursPositive() {
		time.setHours(12);
		assertEquals(12,time.getHours());
		
	}
	
	
	@Test
	public void testSetMinutesLowerLimit() {
		Time time2 = new Time(6,0,0);
		assertEquals(0,time2.getMinutes());
		
	}
	
	@Test
	public void testSetMinutesUpperLimit() {
		Time time2 = new Time(6,60,0);
		assertEquals(0,time2.getMinutes());
		
	}

	
	@Test
	public void testSetMinutesNegative() {
		Time time2 = new Time(6,-1,0);
		assertEquals(0,time2.getMinutes());
		
	}
	
	@Test
	public void testSetMinutesNegative2() {
		Time time2 = new Time(6,61,0);
		assertEquals(0,time2.getMinutes());
		
	}
	
	@Test
	public void testSetMinutesPositive() {
		Time time2 = new Time(6,1,0);
		assertEquals(1,time2.getMinutes());
		
	}
	
	@Test
	public void testSetSecondsLowerLimit() {
		Time time2 = new Time(6,1,0);
		assertEquals(0,time2.getSeconds());
		
	}
	
	@Test
	public void testSetSecondsUpperLimit() {
		Time time2 = new Time(6,1,60);
		assertEquals(0,time2.getSeconds());
		
	}
	
	
	@Test
	public void testSetSecondsNegative() {
		Time time2 = new Time(6,1,-1);
		assertEquals(0,time2.getSeconds());
		
	}
	
	
	@Test
	public void testSetSecondsNegative2() {
		Time time2 = new Time(6,1,61);
		assertEquals(0,time2.getSeconds());
		
	}
	
	@Test
	public void testSetSecondsPositive() {
		Time time2 = new Time(6,1,1);
		assertEquals(1,time2.getSeconds());
		
	}
	
	@Test
	public void testGetTimeString() {
		Time time2 = new Time(4,2,9);
		assertEquals("04:02:09",time2.getTimeString());
		
	}
	
	@Test
	public void testTimeInSeconds() {
		Time time2 = new Time(6,1,1);
		assertEquals(21661,time2.inSeconds());
		
	}
	
	@Test
	public void testgetTimePlusNegative() {
		Time time2 = new Time(6,1,1);
		
		assertEquals("06:01:01",time2.getTimePlus(-1));
		
	}
	
	@Test
	public void testgetTimePlusPositive() {
		Time time2 = new Time(6,1,1);
		assertEquals("07:01:01",time2.getTimePlus(3600));
		
	}
}
