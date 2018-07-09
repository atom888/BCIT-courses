/**
 * 
 */

package ca.bcit.comp1451.session1_Lab;
import java.util.*;
/**
 * @author a00749008
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Club club = new Club();
		Member member = new Member(args[0], args[1],Integer.parseInt(args[2]), Integer.parseInt(args[3]));
		club.join(member);
		club.join(new Member(args[4], args[5],Integer.parseInt(args[6]), Integer.parseInt(args[7])));
		club.displayMembersList();
		System.out.println("the number of the members in the club is");	
		club.numberOfMembers();
		System.out.println("members who joined in year "+ args[3]);
		club.displayMembersByYear(Integer.parseInt(args[3]));
		System.out.println("Removing members who joined in year "+ args[3]);
		club.removeMembersByYear(Integer.parseInt(args[3]));
		club.displayMembersList();
	}

}
