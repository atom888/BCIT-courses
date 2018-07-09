/**
 * 
 */
package bcit.ca.comp1451.assignment02;

/**
 * @author adamdipinto
 *
 */
public abstract class ProjectInvoice implements Comparable <ProjectInvoice>{
	public static int uniqueNumber = 1000;

	private String invoiceNumber;
	private String projectName;
	private int numOfWorkingHours;
	private double hourlyRate;
	
	public ProjectInvoice(String projectName, int numOfWorkingHours, double hourlyRate) {
		setProjectName(projectName);
		setNumOfWorkingHours(numOfWorkingHours);
		setHourlyRate(hourlyRate);
		invoiceNumber = Integer.toString(createInvoiceNumber());
		setInvoiceNumber(invoiceNumber);
	}

	/**
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}

	/**
	 * @param projectName the projectName to set
	 */
	public void setProjectName(String projectName) {
		if (projectName != null && !projectName.isEmpty()) {
			this.projectName = projectName;
		}	
	}

	/**
	 * @return the numOfWorkingHours
	 */
	public int getNumOfWorkingHours() {
		return numOfWorkingHours;
	}

	/**
	 * @param numOfWorkingHours the numOfWorkingHours to set
	 */
	public void setNumOfWorkingHours(int numOfWorkingHours) {
		if (numOfWorkingHours > 0) {
			this.numOfWorkingHours = numOfWorkingHours;
		}
	}

	/**
	 * @return the hourlyRate
	 */
	public double getHourlyRate() {
		return hourlyRate;
	}

	/**
	 * @param hourlyRate the hourlyRate to set
	 */
	public void setHourlyRate(double hourlyRate) {
		if (hourlyRate > 0) {
			this.hourlyRate = hourlyRate;
		}
	}
	
	private int createInvoiceNumber() {
		uniqueNumber++;
		return uniqueNumber;
	}
	
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = "INV" + invoiceNumber;
	}
	
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	
	public abstract double calculateTotalCost();
	
	@Override
	public int compareTo(ProjectInvoice obj) {
		return(int)(this.calculateTotalCost() - obj.calculateTotalCost());
	}
	
	@Override
	public String toString() {
		String newLine = System.getProperty("line.separator");
		String result = "Invoice Number: " + getInvoiceNumber() + newLine + "Project Name: " + getProjectName() + newLine + "Number of Hours: " + getNumOfWorkingHours() + newLine + "Hourly Rate: " + getHourlyRate();
		return result;
	}
	
}
