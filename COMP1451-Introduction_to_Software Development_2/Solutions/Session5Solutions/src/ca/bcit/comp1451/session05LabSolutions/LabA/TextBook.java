/**
 * 
 */
package ca.bcit.comp1451.session05LabSolutions.LabA;

/**
 * @author A00749008
 *
 */
public class TextBook extends ReadingMaterial {

	private int editionNumber;
	private String authorName;
	private String subject;
	
	
	/**
	 * non-default ReadingMaterial constructor
	 * @param title
	 * @param numberOfPages
	 * @param editionNumber
	 * @param authorName
	 * @param subject
	 */
	
	
	public TextBook(String title, int numberOfPages, int editionNumber,	String authorName, String subject) {
		super(title,numberOfPages);
		setEditionNumber(editionNumber);
		setAuthorName(authorName);
		setSubject(subject);
	}

	
	


	/**
	 * Method getEditionNumber
	 * @return the editionNumber
	 */
	public int getEditionNumber() {
		return editionNumber;
	}

	/**
	 * Method setEditionNumber
	 * @param editionNumber the editionNumber to set
	 */
	public void setEditionNumber(int editionNumber) {
		if(editionNumber > 0){
		this.editionNumber= editionNumber;	
		}
		}


	/**
	 * Method getAuthorName
	 * @return the authorName
	 */
	public String getAuthorName() {
		return authorName;
	}

	/**
	 * Method setAuthorName
	 * @param authorName the authorName to set
	 */
	public void setAuthorName(String authorName) {
		if(authorName!=null && ! authorName.isEmpty()){
			this.authorName = authorName;
		}
		else{
			authorName = "unknown";
		}
	}
		

	/**
	 * Method getSubject
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * Method setSubject
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		if(subject!=null && ! subject.isEmpty()){
			this.subject = subject;
	}
		else{
			subject = "unknown";
		}
	}
		
	public void displayDetails(){
		System.out.println("Title: " + getTitle() );
		System.out.println("Edition Number: " + editionNumber );
		System.out.println("Subject: " + subject );
		
		
	}
		
}
