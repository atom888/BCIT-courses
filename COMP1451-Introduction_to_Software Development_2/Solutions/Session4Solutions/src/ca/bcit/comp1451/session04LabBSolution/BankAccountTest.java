/**
 * 
 */
package ca.bcit.comp1451.session04LabBSolution;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Rana
 *
 */
public class BankAccountTest {

	 private BankAccount bankAcco1;
	 private BankAccount bankAcco2;

	
	@Before
	public void setUp() throws Exception {
		
	        bankAcco1 = new BankAccount("Colleen", 100.50);
	        bankAcco2 = new BankAccount("Sam");
	}
	@After
	public void tearDown() throws Exception {
		bankAcco1 = null;
		bankAcco2 = null;
	}

	
	
	@Test
   public void testConstructorTwoParameters()
   {
       assertEquals(100.5, bankAcco1.getBalance(), .01);
   }

	@Test
   public void testConstructorOneParameter()
   {
       assertEquals(0.0, bankAcco2.getBalance(), .01);
   }

	@Test
   public void testConstructorNegativeTest()
   {
       BankAccount bankAcco3 = new BankAccount("Sharon", -100.0);
       assertEquals(0.0, bankAcco3.getBalance(), .01);
   }

	@Test
   public void testDepositPositive()
   {
       bankAcco1.deposit(200.10);
       assertEquals(300.60, bankAcco1.getBalance(), .01);
   }

	@Test
   public void testDepositNegative()
   {
       bankAcco1.deposit(-50.0);
       assertEquals(100.5, bankAcco1.getBalance(), .01);
   }

	@Test
   public void testWithdrawPositive()
   {
       bankAcco1.withdraw(60.0);
       assertEquals(40.5, bankAcco1.getBalance(), .01);
   }
   
	@Test
   public void testWithdrawNegativeOverBalance()
   {
       bankAcco1.withdraw(500);
       assertEquals(100.5, bankAcco1.getBalance(), .01);
   }

	@Test
   public void testWithdrawNegativeAmount()
   {
       bankAcco1.withdraw(-60);
       assertEquals(100.5, bankAcco1.getBalance(), .01);
   }

	@Test
   public void testApplyInterestPositive()
   {
       bankAcco1.applyInterest();
       assertEquals(105.525, bankAcco1.getBalance(), .01);
   }

	@Test
   public void testApplyInterestNegative()
   {
       bankAcco2.applyInterest();
       assertEquals(0.0, bankAcco2.getBalance(), .01);
   }

	@Test
   public void testApplyInterestTwicePositive()
   {
       bankAcco1.applyInterest();
       bankAcco1.applyInterest();
       assertEquals(110.80, bankAcco1.getBalance(), .01);
   }
	@Test
   public void testNewGetBalance()
   {
       bankAcco2.deposit(100.95);
       assertEquals(100.95, bankAcco2.getBalance(), 0.1);
   }

}
