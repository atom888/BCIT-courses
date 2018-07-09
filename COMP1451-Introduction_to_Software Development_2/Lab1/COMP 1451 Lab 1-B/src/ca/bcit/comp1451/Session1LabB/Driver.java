/**
 * 
 */
package ca.bcit.comp1451.Session1LabB;

/**
 * @author adamdipinto
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int month = Integer.parseInt(args[2]);
		int year = Integer.parseInt(args[3]);
		int secondMonth = Integer.parseInt(args[6]);
		int secondYear = Integer.parseInt(args[7]);

		Member firstMember = new Member(args[0], args[1], month, year);
		Member secondMember = new Member(args[4], args[5], secondMonth, secondYear);

		Club newClub = new Club();
		newClub.join(firstMember);
		newClub.join(secondMember);

		System.out.println("Show Members:");
		newClub.showMembers();

		System.out.println("Number of Members:");
		newClub.numberOfMembers();

		System.out.println("Members joining for the year of " + year);
		newClub.showMembersByYear(year);

		System.out.println("Remove members for the year of " + year);
		newClub.removeMembersByYear(year);
		newClub.showMembers();

	}

}
