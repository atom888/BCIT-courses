package ca.bcit.comp1451.session1_Lab;

import java.util.ArrayList;
import java.util.Iterator;

public class Club {
	

	private ArrayList<Member> clubMembers;

	/**
	 * constructor for club
	 */
	public Club() {
		clubMembers = new ArrayList<Member>();
	}

	/**
	 * adds a member to the club
	 * 
	 * @param member
	 */
	public void join(Member memberToAdd) {
		if(memberToAdd != null){
		   clubMembers.add(memberToAdd);
		}
	}

	/**
	 * returns the count of members
	 */
	public int numberOfMembers() {
		
		return clubMembers.size();
	}

	/**
	 * displays the details of all member in the club
	 */
	public void displayMembersList() {
		System.out.println(" List of all the club members");
		for (Member aMember : clubMembers) {
			aMember.displayDetails();
		}
	}

	
	/**
	 * displays the details of members who joined in the given year
	 * @param year
	 */
	public void displayMembersByYear(int year) {
		if(year >0 && year <= Member.CURRENT_YEAR){
			System.out.println("Members who joined in year " + year + " are:");
			for (Member aMember : clubMembers) {
				if (aMember.getJoiningYear() == year) {
					aMember.displayDetails();
				}
			}
		}
	}

	
	/**
	 * method to remove members joined in the given year
	 * @param year
	 */
	public void removeMembersByYear(int year) {
		if(year >0 && year <= Member.CURRENT_YEAR){
			Iterator<Member> it = clubMembers.iterator();
			while (it.hasNext()) {
				Member oneMember = it.next();

				if (oneMember.getJoiningYear() == year) {
					it.remove();
				}
			}
	}
	}

	
	
}
