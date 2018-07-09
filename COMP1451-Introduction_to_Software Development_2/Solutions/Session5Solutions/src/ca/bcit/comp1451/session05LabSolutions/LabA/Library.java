/**
 * 
 */
package ca.bcit.comp1451.session05LabSolutions.LabA;
import java.util.ArrayList;
//import java.util.Iterator;
/**
 * @author A00749008
 *
 */
public class Library {

	private ArrayList<ReadingMaterial>  materials;
	
	
	/**
	 * non-default Library constructor
	 */
	public Library() {
		materials = new ArrayList<ReadingMaterial>();
	}
	
	/**
	 * Method loadLibrary
	 * add add TextBook, Novel, and Magazine object to ArrayList
	 * 
	 */

	public void loadLibrary(){
		TextBook book = new TextBook("Objects First with Java",600,6," Michael Kolling","Computer Science");
		materials.add(book);
		Magazine myMagazine = new Magazine("CoDE",60,"EPS Software",500000);
		materials.add(myMagazine);
		Novel theNovel = new Novel("Inferno",609,"	Robert Langdon","Mystery","Dan Brown");
		materials.add(theNovel);
	}
	
	/**
	 * Method displayAllMaterialDetail
	 * 
	 */
	
	public void displayAllMaterialDetail(){
		  
        for(ReadingMaterial myMaterial : materials){
			if(myMaterial.getClass().getName().equals("ca.bcit.comp1451.session05LabSolutions.LabA.TextBook")){
				TextBook text = (TextBook)myMaterial;
				text.displayDetails();
			} else if (myMaterial.getClass().getName().equals("ca.bcit.comp1451.session05LabSolutions.LabA.Novel")){
			 ((Novel)myMaterial).displayDetails();
			} else {
				Magazine theMagazine = (Magazine)myMaterial;
				((Magazine)theMagazine).displayDetails();
			}
			
		}
        
        }
		
	
	/**
	 * Method displayMagazine
	 * display details of Magazines in ArrayList
	 */
	public void displayMagazine(){
		for(ReadingMaterial m : materials){
			if(m instanceof Magazine){
				  ((Magazine)m).displayDetails();
				
			}
			
		}
	}
		
	
	
	public static void main(String[] args) {
		Library theLibrary = new Library();
		
		theLibrary.loadLibrary();
		theLibrary.displayMagazine();
		theLibrary.displayAllMaterialDetail();

	}

}
