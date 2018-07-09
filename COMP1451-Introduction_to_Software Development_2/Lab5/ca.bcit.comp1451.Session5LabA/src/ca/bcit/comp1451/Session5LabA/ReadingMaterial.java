/**
 * 
 */
package ca.bcit.comp1451.Session5LabA;

/**
 * @author A01034457
 *
 */
public class ReadingMaterial {
	
	private String title;
	private int numberOfPages;
	
	public ReadingMaterial(String title, int numberOfPages) {
		setTitle(title);
		setNumberOfPages(numberOfPages);
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		if (title != null && !title.isEmpty()) {
			this.title = title;
		} else {
			this.title = "unknown";
		}
		
	}

	/**
	 * @return the numberOfPages
	 */
	public int getNumberOfPages() {
		return numberOfPages;
	}

	/**
	 * @param numberOfPages the numberOfPages to set
	 */
	public void setNumberOfPages(int numberOfPages) {
		if (numberOfPages > 0) {
			this.numberOfPages = numberOfPages;
		} else {
			System.out.println("Please provide a positive number.");
		}
		
	}

}
