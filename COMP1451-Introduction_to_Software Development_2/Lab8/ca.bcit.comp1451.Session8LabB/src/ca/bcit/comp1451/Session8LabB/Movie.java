/**
 * 
 */
package ca.bcit.comp1451.Session8LabB;

/**
 * @author adamdipinto
 *
 */
public class Movie extends AudioMaterial {
	private String directorName;
	private int numOfActors;
	/**
	 * @param name
	 * @param playingTimeMIN
	 */
	public Movie(String name, double playingTimeMIN, String directorName, int numOfActors) {
		super(name, playingTimeMIN);
		setDirectorName(directorName);
		setNumOfActors(numOfActors);
	}
	/**
	 * @return the directorName
	 */
	public String getDirectorName() {
		return directorName;
	}
	/**
	 * @param directorName the directorName to set
	 */
	public void setDirectorName(String directorName) {
		if (directorName != null && !directorName.isEmpty()) {
			this.directorName = directorName;
		} else {
			throw new IllegalArgumentException("Invalid value");
		}
		
	}
	/**
	 * @return the numOfActors
	 */
	public int getNumOfActors() {
		return numOfActors;
	}
	/**
	 * @param numOfActors the numOfActors to set
	 */
	public void setNumOfActors(int numOfActors) {
		if (numOfActors > 0) {
			this.numOfActors = numOfActors;
		} else {
			throw new IllegalArgumentException("Invalid value");
		}	
	}
}
