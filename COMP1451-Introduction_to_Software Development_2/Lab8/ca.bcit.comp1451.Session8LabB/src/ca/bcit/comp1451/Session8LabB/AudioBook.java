/**
 * 
 */
package ca.bcit.comp1451.Session8LabB;

/**
 * @author adamdipinto
 *
 */
public class AudioBook extends AudioMaterial {
	private int totalNumPages;
	private String authorName;
	
	/**
	 * @param name
	 * @param playingTimeMIN
	 */
	public AudioBook(String name, double playingTimeMIN, int totalNumPages, String authorName) {
		super(name, playingTimeMIN);
		setTotalNumPages(totalNumPages);
		setAuthorName(authorName);
	}
	
	/**
	 * @return the totalNumPages
	 */
	public int getTotalNumPages() {
		return totalNumPages;
	}
	/**
	 * @param totalNumPages the totalNumPages to set
	 */
	public void setTotalNumPages(int totalNumPages) {
		if (totalNumPages > 0) {
			this.totalNumPages = totalNumPages;
		} else {
			throw new IllegalArgumentException("Invalid value");
		}
	}
	/**
	 * @return the authorName
	 */
	public String getAuthorName() {
		return authorName;
	}
	/**
	 * @param authorName the authorName to set
	 */
	public void setAuthorName(String authorName) {
		if (authorName != null && !authorName.isEmpty()) {
			this.authorName = authorName;
		} else {
			throw new IllegalArgumentException("Invalid value");
		}
	}

}
