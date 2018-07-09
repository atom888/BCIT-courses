/**
 * 
 */
package ca.bcit.comp1451.session05LabSolutions.LabA;

/**
 * @author A00749008
 *
 */
public class ReadingMaterial {

	private String title;
	private int numberOfPages;
	
	
	/**
	 * non-default ReadingMaterial constructor
	 * @param title String to set title
	 * @param numberOfPages int of total pages
	 */
	
	public ReadingMaterial(String title, int numberOfPages){
		setTitle(title);
		setNumberOfPages(numberOfPages);
	}
	
	
	/**
	 * Method getTitle
	 * @return title String value of the title
	 */
	
	public String getTitle() {
		return title;
	}
	
	/**
	 * Method setTitle
	 * @param title String to set the title
	 */
	
	public void setTitle(String title) {
		if(title != null && ! title.isEmpty()){
			this.title = title;
		} else {
			this.title = "unknown";
		}
	}
	
	/**
	 * Method getNumberOfPages
	 * @return numberOfPages the number of pages
	 */
	
	
	public int getNumberOfPages() {
		return numberOfPages;
	}
	
	
	/**
	 * Method setNumberOfPages
	 * @param numberOfPages int value of total number of pages
	 */
	
	public void setNumberOfPages(int numberOfPages) {
		if(numberOfPages >0){
			this.numberOfPages = numberOfPages;
		} 
	}
	
	
	
}
