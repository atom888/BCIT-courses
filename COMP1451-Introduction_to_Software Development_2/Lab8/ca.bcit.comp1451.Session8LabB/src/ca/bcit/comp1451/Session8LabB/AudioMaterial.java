/**
 * 
 */
package ca.bcit.comp1451.Session8LabB;

/**
 * @author adamdipinto
 *
 */
public abstract class AudioMaterial implements Comparable <AudioMaterial> {

	private String name;
	private double playingTimeMIN;
	/**
	 * @param name
	 * @param playingTimeMIN
	 */
	public AudioMaterial(String name, double playingTimeMIN) {
		setName(name);
		setPlayingTimeMIN(playingTimeMIN);
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
		} else {
			throw new IllegalArgumentException("Invalid value");
		}
		
	}
	/**
	 * @return the playingTimeMIN
	 */
	public double getPlayingTimeMIN() {
		return playingTimeMIN;
	}
	/**
	 * @param playingTimeMIN the playingTimeMIN to set
	 */
	public void setPlayingTimeMIN(double playingTimeMIN) {
		if (playingTimeMIN > 0) {
			this.playingTimeMIN = playingTimeMIN;
		} else {
			throw new IllegalArgumentException("Invalid value");
		}		
	}
	
	public int compareTo(AudioMaterial obj) {
		return(int)(this.getPlayingTimeMIN() - obj.getPlayingTimeMIN());
	}
	
	@Override
	public String toString() {
		return "Name: " + getName() + ", Play Time (mins): " + getPlayingTimeMIN();
		
	}
	

}
