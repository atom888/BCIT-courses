/**
 * 
 */
package ca.bcit.comp1451.Session1LabB;

/**
 * @author adamdipinto
 *
 */
import java.util.ArrayList;
import java.util.Iterator;

public class Club {
	private ArrayList<Member> members;
	
	public Club() {
		members = new ArrayList<Member>();
	}

	public void join (Member member) {
		if (member != null) {
			members.add(member);
		} else {
			throw new IllegalArgumentException("The member can not be null");
		}
	}
	
	public int numberOfMembers() {
		int total = members.size();
		return total;
	}
	
	public void showMembers() {
		for (Member member: members) {
			System.out.println(member.getFirstName() + " " + member.getLastName() + " joined " + member.getMonthJoined() + " of " + member.getYearJoined());
		}
	}
	
	void showMembersByYear(int year) {
		Iterator<Member> it = members.iterator(); 
		while(it.hasNext()) {
		Member oneMember = it.next();
			if (oneMember.getYearJoined() == year) {
				System.out.println(oneMember.getFirstName() + " " + oneMember.getLastName() + " - " + oneMember.getYearJoined());
			}
		}
	}
	
	void removeMembersByYear(int year) {
		Iterator<Member> it = members.iterator(); 
		while(it.hasNext()) {
		Member oneMember = it.next();
			if (oneMember.getYearJoined() == year) {
				it.remove();
			}
		}
	}
	
}
