/**
 * 
 */
package ca.bcit.comp1451.session05LabSolutions.LabA;

/**
 * @author A00749008
 *
 */
public class Magazine extends ReadingMaterial{

	private String publisher;
	private int numberOfSubscribers;
	
	
	/**
	 * non-default Magazine constructor
	 * @param title
	 * @param numberOfPages
	 * @param sPub
	 * @param numberOfSubscribers
	 */
	
	public Magazine(String title, int numberOfPages,String publisher,int numberOfSubscribers) {
		super(title,numberOfPages);
		setsPublisher(publisher);
		setNumberOfSubscribers(numberOfSubscribers);
		
	}


	/**
	 * Method getPublisher
	 * @return publisher the scheduled publication
	 */
	public String getPublisher() {
		return publisher;
	}


	/**
	 * Method setPublisher
	 * @param publisher the publisher to set
	 */
	public void setsPublisher(String publisher) {
		if(publisher != null && ! publisher.isEmpty()){
			this.publisher = publisher;
		}
		else{
			publisher = "unknown";
		}
		
		}


	/**
	 * Method getNumberOfSubscribers
	 * @return the numberOfSubscribers
	 */
	public int getNumberOfSubscribers() {
		return numberOfSubscribers;
	}


	/**
	 * Method setNumberOfSubscribers
	 * @param numberOfSubscribers the numberOfSubscribers to set
	 */
	public void setNumberOfSubscribers(int numberOfSubscribers) {
		if(numberOfSubscribers > 0){
			this.numberOfSubscribers = numberOfSubscribers;
		}
	}

	public void displayDetails(){
		System.out.println("Title: " + getTitle() );
		System.out.println("Scheduled publication: " + publisher );
		System.out.println("Number of subscribers: " + numberOfSubscribers );
	}
	
	
}
