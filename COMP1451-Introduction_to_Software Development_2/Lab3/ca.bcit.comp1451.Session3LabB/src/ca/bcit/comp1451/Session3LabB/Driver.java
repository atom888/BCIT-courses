/**
 * 
 */
package ca.bcit.comp1451.Session3LabB;

/**
 * @author adamdipinto
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EmailInfo addressList = new EmailInfo();
		
		addressList.addFriend("jason", "jason@gmail.com");
		addressList.addFriend("tina", "tina@gmail.com");
		addressList.addFriend("jessica", "jessica@gmail.com");
		addressList.addFriend("jackson", "jackson@gmail.com");
		
		System.out.println("Get Address Example:");
		addressList.getAddress("tina");
		System.out.println("=====================");
		
		System.out.println("Find Friend Example:");
		addressList.findFriends("jessica@gmail.com");
		System.out.println("=====================");
		
		addressList.listAll();
		System.out.println("=====================");
	
		System.out.println("Remove Friend Example:");
		addressList.removeFriend("jackson");
		System.out.println("=====================");
		
		addressList.listAll();
		System.out.println("=========END=========");
		
		

	}

}
