package ca.bcit.comp1451.session3.LabB;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.TreeSet;
public class EmailInfo {
	
	 private HashMap<String, String> addressBook;

	    /**
	     * EmailInfo holds a collection of friend mames and their email addresses
	     */
	    public EmailInfo()
	    {
	        addressBook = new HashMap<String,String>();
	    }

	    /**
	     * Add a friend's name and email to the address book -
	     * Names and addresses are stored already formatted.
	     * 
	     * @param  friend name of friend
	     * @param email email address of friend
	     */
	    public void addFriend(String friend, String email) {
	    if(!addressBook.containsKey(formatName(friend))){
	        addressBook.put(formatName(friend), formatAddress(email));
	    }
	    }
	    
	    /**
	     * Remove a friend from the address book.
	     * 
	     * @param friend the friend to remove
	     */
	    public void removeFriend(String friend)
	    {
	    	 if(addressBook.containsKey(formatName(friend))){
	        addressBook.remove(formatName(friend));
	    }
	    }
	    
	    /**
	     * Get the email of the specified friend
	     * 
	     * @param friend the friend whose address we want
	     * @return the email address as a String
	     */
	    public String getEmail(String friend)
	    {
	    	if(addressBook.containsKey(formatName(friend))) {
	       return addressBook.get(formatName(friend));
	    	}
	    	else {
	    		return null;
	    	}
	    }
	    
	  
	    
	    /**
	     * List all friends and their addresses, sorted by 
	     * friend name.
	     */
	    public void listSorted()
	    {
	        TreeSet<String> friendsSorted = new TreeSet<String>(addressBook.keySet());
	        for (String friend : friendsSorted) {
	            System.out.println(friend + " " + addressBook.get(friend));
	        }
	    }
	    
	    /**
	     * Locate any friends with the specified address - there might be more than one.
	     * @param address the email address to search for
	     */
	    public void findFriends(String address) 
	    {
	        boolean friendFound = false;
	        address = formatAddress(address);
	        for (String person : addressBook.keySet()) {
	            if (getEmail(formatAddress(person)).equals(address)) {
	                friendFound = true;
	                System.out.println(person + " has address " + address);
	            }
	        }
	        if (! friendFound) {
	            System.out.println("No match found for " + address);
	        }
	    }
	     
	    /**
	     * Lists all the friends in the book, with their addresses.
	     */
	    public void listAll()
	    {
	    	Set<Map.Entry<String,String>> mySet = addressBook.entrySet();
	        for (Map.Entry<String,String> friend : mySet) {
	            System.out.println(friend.getKey() + " " + friend.getValue());
	        }       
	    }
	    
	    /**
	     * Formats email address.
	     * @param address email address to format
	     */
	    private String formatAddress(String address)
	    {
	        return address.toLowerCase();
	    }
	  
	     /**
	     * Format a name so that the first letter of each
	     *  name portion is uppercase and the rest lowercase.
	     * 
	     * @param nameToFormat name to be formatted
	     * @return the formatted name as a String
	     */
	    private String formatName(String nameToFormat)
	    {
	        String formattedName = "";                    // start off blank
	        if (nameToFormat != null && nameToFormat.length() > 0) { 
	            String[] nameParts = nameToFormat.toUpperCase().split(" "); // separate the parts
	            for (int i = 0; i < nameParts.length; i++) {
	                // name is already uppercase so everything after the first letter
	                // needs to be made lowercase 
	                formattedName = formattedName + nameParts[i].substring(0,1) // first letter
	                   + nameParts[i].substring(1).toLowerCase() + " "; // all the rest + space between
	                
	            }
	        }
	        return formattedName.trim(); // get rid of last space
	    }
}
