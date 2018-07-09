/**
 * 
 */
package ca.bcit.comp1451.Session5LabA;

/**
 * @author A01034457
 *
 */
public class TextBook extends ReadingMaterial {
	private int editionNumber;
	private String authorName;
	private String subject;
	
	public TextBook(String title, int numberOfPages, int editionNumber, String authorName, String subject) {
		super(title, numberOfPages);
		setEditionNumber(editionNumber);
		setAuthorName(authorName);
		setSubject(subject);
	}

	/**
	 * @return the editionNumber
	 */
	public int getEditionNumber() {
		return editionNumber;
	}

	/**
	 * @param editionNumber the editionNumber to set
	 */
	public void setEditionNumber(int editionNumber) {
		if (editionNumber > 0) {
			this.editionNumber = editionNumber;
		} else {
			System.out.println("Please provide a positive number.");
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
			this.authorName = "unknown author";
		}
		
	}

	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		if (subject != null && !subject.isEmpty()) {
			this.subject = subject;
		} else {
			this.subject = "unknown subject";
		}
		
	}
	
	public void displayDetails() {
		System.out.println("Title: " + getTitle());
		System.out.println("Edition Number: " + getEditionNumber());
		System.out.println("Author Name: " + getAuthorName());
		System.out.println("Subject: : " + getSubject());

	}

}
