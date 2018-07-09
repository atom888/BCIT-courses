/**
 * 
 */
package ca.bcit.comp1451.Session3LabB;

/**
 * @author adamdipinto
 *
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EmailInfo {
	
	private HashMap<String, String> addressBook;
	
	public EmailInfo() {
		addressBook = new HashMap<String, String>();
	}
	
	private String formatName(String name) {
		String result = "";
		if(name != null) {
			result = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
		}
		return result;
	}
	
	public void addFriend(String name, String email) {
		if(!addressBook.containsKey(formatName(name))) {
			addressBook.put(formatName(name), email);
		}
	}
	
	public void removeFriend(String name) {
		if(addressBook.containsKey(formatName(name))) {
			addressBook.remove(formatName(name));
		}
	} 
	
	public String getAddress(String name) {
		String email = "";
		Set<Map.Entry<String, String>> addressSet = addressBook.entrySet();
		for (Entry<String, String> a : addressSet) {
			if (a.getKey().equals(formatName(name))) {
				email = a.getValue();
			}
		}
		return email;
	}
	
	public void findFriends(String email) {
		Set<Map.Entry<String, String>> friendSet = addressBook.entrySet();
		for (Entry<String, String> f : friendSet) {
			if (f.getValue().equals(email)) {
				System.out.println("Your friend "+f.getKey() + " is using email: " +email);
			}
		}
	}
	
	public void listAll() {
		Set<Map.Entry<String, String>> listSet = addressBook.entrySet();
		for (Entry<String, String> l : listSet) {
			System.out.println("Friend: "+l.getKey());
			System.out.println("Email: "+l.getValue());
			System.out.println("=====================");
		}
	}
	
	
	
	

}
