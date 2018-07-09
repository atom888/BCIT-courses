/**
 * 
 */
package ca.bcit.comp1451.lab7a;

import java.lang.reflect.Array;

/**
 * @author A01034457
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Electronics[] electronicList = new Electronics[3];
		
		Electronics phone = new Cellphone("Nokia TS200", 300.00, 18, 3.5);
		Electronics computer = new Computer("Dell D2100", 1000.00, 24, 2500, 512);
		Electronics laptop = new Laptop("HP N5170", 1500.00, 24, 1500, 256, 15.0);
		
		electronicList[0] = phone;
		electronicList[1] = computer;
		electronicList[2] = laptop;
		
		System.out.println("=========BEFORE===========");
		for (int index = 0; index < electronicList.length; index++) {
			System.out.println(electronicList[index]);
		}
		
		for (int index = 0; index < electronicList.length; index++) {
			electronicList[index].increasePrice(5.0);
		}
		System.out.println("=========AFTER===========");
		for (int index = 0; index < electronicList.length; index++) {
			System.out.println(electronicList[index]);
		}
		
	}

}
