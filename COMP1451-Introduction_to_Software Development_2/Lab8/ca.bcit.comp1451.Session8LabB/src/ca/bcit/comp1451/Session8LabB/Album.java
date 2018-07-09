/**
 * 
 */
package ca.bcit.comp1451.Session8LabB;

/**
 * @author adamdipinto
 *
 */
public class Album extends AudioMaterial {
	private int numOfSongs;
	private String artistName;
	/**
	 * @param name
	 * @param playingTimeMIN
	 */
	public Album(String name, double playingTimeMIN, int numOfSongs, String artistName) {
		super(name, playingTimeMIN);
		setNumOfSongs(numOfSongs);
		setArtistName(artistName);
	}
	/**
	 * @return the numOfSongs
	 */
	public int getNumOfSongs() {
		return numOfSongs;
	}
	/**
	 * @param numOfSongs the numOfSongs to set
	 */
	public void setNumOfSongs(int numOfSongs) {
		if (numOfSongs > 0) {
			this.numOfSongs = numOfSongs;
		} else {
			throw new IllegalArgumentException("Invalid value");
		}
	}
	/**
	 * @return the artistName
	 */
	public String getArtistName() {
		return artistName;
	}
	/**
	 * @param artistName the artistName to set
	 */
	public void setArtistName(String artistName) {
		if (artistName != null && !artistName.isEmpty()) {
			this.artistName = artistName;
		} else {
			throw new IllegalArgumentException("Invalid value");
		}
		
	}
}
