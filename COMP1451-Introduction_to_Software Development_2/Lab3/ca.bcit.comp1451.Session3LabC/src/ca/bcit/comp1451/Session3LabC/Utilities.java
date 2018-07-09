/**
 * 
 */
package ca.bcit.comp1451.Session3LabC;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author adamdipinto
 *
 */
public class Utilities {
	private HashMap<String, Integer> map;
	private Scanner input;
	
	public Utilities() {
		map = new HashMap<String, Integer>();
		input = new Scanner(System.in);
	}
	
	public void populateHashMap() {

		while(input.hasNext()) {
			String word = input.next().toLowerCase();
			
			if (map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			} else {
				map.put(word, 1);
			}
		} input.close();
	}
	
	public void displayCollection() {
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("Word: " + key);
			System.out.println("Count: " + value);
		}
	}
	
	public void getCount(String word) {
		if (word != null && !word.isEmpty()) {
			String formatedWord = word.toLowerCase();
			for (Map.Entry<String, Integer> entry : map.entrySet()) {
				if (entry.getKey().equals(formatedWord)) {
					Integer value = entry.getValue();
					System.out.println(formatedWord + " appears " + value + " times.");
				}
			}
		}
		
	}
	
	public void displayTheWord(int number) {
		if (number > 0) {
			for (Map.Entry<String, Integer> entry : map.entrySet()) {
				if (entry.getValue().equals(number)) {
					String key = entry.getKey();
					System.out.println(key + " appears " + number + " times.");
				}
			}
		}
	}
	
	public void removeWord(String word) {
		if (word != null && !word.isEmpty()) {
			String formatedWord = word.toLowerCase();
			if (map.containsKey(formatedWord)) {
				map.remove(formatedWord);
			}
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String word = "daydream";
		int number = 1;
		// TODO Auto-generated method stub
		Utilities utility = new Utilities();
		
		utility.populateHashMap();
		utility.displayCollection();
		utility.getCount(word);
		utility.displayTheWord(number);
		utility.removeWord(word);
		utility.displayCollection();
		
	}

}
