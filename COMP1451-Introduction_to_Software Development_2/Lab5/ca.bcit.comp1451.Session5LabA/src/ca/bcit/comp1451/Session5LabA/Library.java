/**
 * 
 */
package ca.bcit.comp1451.Session5LabA;

import java.util.ArrayList;

/**
 * @author A01034457
 *
 */
public class Library {
	private ArrayList<ReadingMaterial> readingMaterial;
	/**
	 * @param args
	 */
	public Library() {
		readingMaterial = new ArrayList<ReadingMaterial>();
	}
	
	public void loadLibrary() {
		ReadingMaterial textBook = new TextBook("Physics 101", 350, 2, "Wiley", "Science");
		ReadingMaterial novel = new Novel("Harry Potter", 500, "String", "Fantasy", "J.K. Rowling");
		ReadingMaterial magazine = new Magazine("Science Weekly", 50, "Weekly", 3000);
		readingMaterial.add(textBook);
		readingMaterial.add(novel);
		readingMaterial.add(magazine);
		
	}
	
	public void displayAllMaterialDetails() {
		for (ReadingMaterial r : readingMaterial) {
			if (r instanceof TextBook) {
				System.out.println("=================");
				((TextBook) r).displayDetails();
				System.out.println("=================");
			} else if (r instanceof Novel) {
				System.out.println("=================");
				((Novel) r).displayDetails();
				System.out.println("=================");
			} else if (r instanceof Magazine) {
				System.out.println("=================");
				((Magazine) r).displayDetails();
				System.out.println("=================");
			}
		}
	}
	
	public void displayMagazineDetails() {
		for (ReadingMaterial r : readingMaterial) {
			if (r instanceof Magazine) {
				((Magazine) r).displayDetails();
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library library = new Library();
		
		
		library.loadLibrary();
		library.displayAllMaterialDetails();
	}

}
