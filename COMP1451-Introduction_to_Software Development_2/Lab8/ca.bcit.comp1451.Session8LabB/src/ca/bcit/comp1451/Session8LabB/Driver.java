/**
 * 
 */
package ca.bcit.comp1451.Session8LabB;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author adamdipinto
 *
 */
public class Driver {
	private static ArrayList<AudioMaterial> list;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		list = new ArrayList<AudioMaterial>();

		Album firstAlbum = new Album("ASAP Rocky Forever", 59.30, 14, "ASAP Rocky");
		AudioBook firstAudioBook = new AudioBook("Who owns the future", 200.13, 450, "Jaron Lanier");
		Movie firstMovie = new Movie("12 Angry Men", 120, "Sidney Lumet", 12);
		
		list.add(firstAlbum);
		list.add(firstAudioBook);
		list.add(firstMovie);
		
		System.out.println("Before Sorting");
		for(AudioMaterial m:list) {
			System.out.println(m);
		}
		
		System.out.println("After Sorting");
		Collections.sort(list);
		for(AudioMaterial m:list) {
			System.out.println(m);
		}
	}

}
