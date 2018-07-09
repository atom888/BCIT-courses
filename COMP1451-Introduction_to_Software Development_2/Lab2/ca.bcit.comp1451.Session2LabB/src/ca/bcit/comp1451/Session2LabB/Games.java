/**
 * 
 */
package ca.bcit.comp1451.Session2LabB;

/**
 * @author adamdipinto
 *
 */
public class Games {
	public static final int ROUND_NUMBER = 11;

	Die die = new Die();
	
	public void playChicago() {
		int pointCounter = 0;
		int index = 0;
		while(index < ROUND_NUMBER) {
			int roundCounter = index+2;
			
			int firstDie = die.roll();
			int secondDie = die.roll();
			
			System.out.println("Round number: "+ roundCounter);
			System.out.println("First die value was "+ firstDie);
			System.out.println("Second die value was "+ secondDie);
			
			if ((firstDie + secondDie) == roundCounter) {
				System.out.println("Points earned 1");
				pointCounter++;
			}
			System.out.println("========================");
			index++;
		}
		System.out.println("Your score for the game was: "+pointCounter);

	}
	

}
