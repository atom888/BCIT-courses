/**
 * 
 */
package bcit.ca.comp1451.assignment02;

/**
 * @author adamdipinto
 *
 */
public class Labour extends ProjectInvoice {
	private static double HOLIDAY_RATE = 2.0;
	private static double OVERTIME_RATE = 1.5;
	private static double TRANS_COST_RATE = 1.2;
	private static String REGULAR = "regular";
	private static String OVERTIME = "over time";
	private static String HOLIDAY = "holiday";
	private static String EXP = "experienced";
	private static String INEXP = "inexperienced";
	private static double SALES_TAX = 1.05;
	
	private int distanceOfTransportationKM;
	private String hourlyRateCriteria;
	private String typeOfLabour;
	
	public Labour(String projectName, int numOfWorkingHours, double hourlyRate, int distanceOfTransportationKM, String hourlyRateCriteria, String typeOfLabour) {
		super(projectName, numOfWorkingHours, hourlyRate);
		setdistanceOfTransportationKM(distanceOfTransportationKM);
		setHourlyRateCriteria(hourlyRateCriteria);
		setTypeOfLabour(typeOfLabour);
		
	}

	/**
	 * @return the distanceOfTransportationKM
	 */
	public int getdistanceOfTransportationKM() {
		return distanceOfTransportationKM;
	}

	/**
	 * @param distanceOfTransportationKM the distanceOfTransportationKM to set
	 */
	public void setdistanceOfTransportationKM(int distanceOfTransportationKM) {
		if (distanceOfTransportationKM > 0) {
			this.distanceOfTransportationKM = distanceOfTransportationKM;
		}
	}

	/**
	 * @return the hourlyRateCriteria
	 */
	public String getHourlyRateCriteria() {
		return hourlyRateCriteria;
	}

	/**
	 * @param hourlyRateCriteria the hourlyRateCriteria to set
	 */
	public void setHourlyRateCriteria(String hourlyRateCriteria) {
		if ((hourlyRateCriteria != null && !hourlyRateCriteria.isEmpty()) && (hourlyRateCriteria.equalsIgnoreCase(REGULAR) || hourlyRateCriteria.equalsIgnoreCase(OVERTIME) || hourlyRateCriteria.equalsIgnoreCase(HOLIDAY))) {
			this.hourlyRateCriteria = hourlyRateCriteria;
		} else {
			this.hourlyRateCriteria = REGULAR;
		}
		
	}

	/**
	 * @return the typeOfLabour
	 */
	public String getTypeOfLabour() {
		return typeOfLabour;
	}

	/**
	 * @param typeOfLabour the typeOfLabour to set
	 */
	public void setTypeOfLabour(String typeOfLabour) {
		if (typeOfLabour != null && !typeOfLabour.isEmpty() && (typeOfLabour.equalsIgnoreCase(EXP) || typeOfLabour.equalsIgnoreCase(INEXP))) {
			this.typeOfLabour = typeOfLabour;
		} else {
			this.typeOfLabour = INEXP;
		}
	}
	
	public double calculateTransportationCost() {
		double transportationCost = (TRANS_COST_RATE * distanceOfTransportationKM);
		return transportationCost;
	}
	
	public double calculateTotalCost() {
		int numHours = getNumOfWorkingHours();
		String rate = getHourlyRateCriteria();
		double hourlyRate = getHourlyRate();
		double result = 0.0;
		
		if (rate.equals(REGULAR)) {
			result = hourlyRate * numHours;
		} else if (rate.equals(OVERTIME)) {
			result = (OVERTIME_RATE * hourlyRate * numHours);
		} else if (rate.equals(HOLIDAY)) {
			result = (HOLIDAY_RATE * hourlyRate * numHours);
		}
		
		result = calculateTransportationCost() + result;
		result = result * SALES_TAX;
		
		return result;
	}
	
	@Override
	public String toString() {
		String newLine = System.getProperty("line.separator");
		String result = super.toString();
		result = result + newLine + "Hourly Rate Criteria: " + getHourlyRateCriteria() + newLine+ "Labour Type: " + getTypeOfLabour() + newLine + "Cost of Labour Transportation: " + calculateTransportationCost();
		return result;
	}
	
}
