/**
 * 
 */
package ca.bcit.comp1451.session3.LabB;

/**
 * @author a00749008
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EmailInfo address = new EmailInfo();
		address.addFriend("aDaM", "adam@bcit.ca");
		address.addFriend("bOb", "Bob@bcit.ca");
		address.addFriend("jIll", "Jill@bcit.ca");
		System.out.println(" the address book contains:");
		address.listSorted();
		System.out.println("finding bob's address:");
		address.findFriends("Bob@bcit.ca");
		System.out.println("finding Jim's address:");
		address.findFriends("jim@bcit.ca");
		System.out.println("getting adam's email");
		System.out.println(address.getEmail("adam")); 
		System.out.println("removing jill form the address book");
		address.removeFriend("jill");
		System.out.println(" the address book after  contains:");
		address.listAll();
		
		
	}

}
