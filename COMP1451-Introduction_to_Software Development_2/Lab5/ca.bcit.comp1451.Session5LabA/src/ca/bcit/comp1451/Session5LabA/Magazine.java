/**
 * 
 */
package ca.bcit.comp1451.Session5LabA;

/**
 * @author A01034457
 *
 */
public class Magazine extends ReadingMaterial {
	private String scheduledPublications;
	private int numberOfSubscribers;
	
	public Magazine(String title, int numberOfPages, String scheduledPublications, int numberOfSubscribers) {
		super(title, numberOfPages);
		setScheduledPublications(scheduledPublications);
		setNumberOfSubscribers(numberOfSubscribers);
	}

	/**
	 * @return the scheduledPublications
	 */
	public String getScheduledPublications() {
		return scheduledPublications;
	}

	/**
	 * @param scheduledPublications the scheduledPublications to set
	 */
	public void setScheduledPublications(String scheduledPublications) {
		if (scheduledPublications != null && !scheduledPublications.isEmpty()) {
			this.scheduledPublications = scheduledPublications;
		} else {
			this.scheduledPublications = "unknown schedule.";
		}
		
	}

	/**
	 * @return the numberOfSubscribers
	 */
	public int getNumberOfSubscribers() {
		return numberOfSubscribers;
	}

	/**
	 * @param numberOfSubscribers the numberOfSubscribers to set
	 */
	public void setNumberOfSubscribers(int numberOfSubscribers) {
		if (numberOfSubscribers > 0) {
			this.numberOfSubscribers = numberOfSubscribers;
		} else {
			System.out.println("Please provide a positive value");
		}
		
	}
	
	public void displayDetails() {
		System.out.println("Title: " + getTitle());
		System.out.println("Scheduled Publications: " + getScheduledPublications());
		System.out.println("Number of Subscribers : " + getNumberOfSubscribers());
	}

}
