/**
 * 
 */
package bcit.ca.comp1451.assignment02;

import java.awt.datatransfer.Transferable;

/**
 * @author adamdipinto
 *
 */
public class LabourAndMaterialAndEquipment extends LabourAndMaterial implements Transferable {

	private double equipmentValueCAD;
	private int numberOfRentedHours;
	private static final double RATE = 0.05; 
	private static final double EQUIP_FEE = 0.02;
	
	/**
	 * @param projectName
	 * @param numOfWorkingHours
	 * @param hourlyRate
	 * @param distanceOfTransportationKM
	 * @param hourlyRateCriteria
	 * @param typeOfLabour
	 */
	public LabourAndMaterialAndEquipment(String projectName, int numOfWorkingHours, double hourlyRate,
			int distanceOfTransportationKM, String hourlyRateCriteria, String typeOfLabour) {
		super(projectName, numOfWorkingHours, hourlyRate, distanceOfTransportationKM, hourlyRateCriteria, typeOfLabour);
		setEquipmentValueCAD(equipmentValueCAD);
		setNumberOfRentedHours(numberOfRentedHours);
	}

	/**
	 * @return the equipmentValueCAD
	 */
	public double getEquipmentValueCAD() {
		return equipmentValueCAD;
	}

	/**
	 * @param equipmentValueCAD the equipmentValueCAD to set
	 */
	public void setEquipmentValueCAD(double equipmentValueCAD) {
		if (equipmentValueCAD > 0) {
			this.equipmentValueCAD = equipmentValueCAD;
		}
	}

	/**
	 * @return the numberOfRentedHours
	 */
	public int getNumberOfRentedHours() {
		return numberOfRentedHours;
	}

	/**
	 * @param numberOfRentedHours the numberOfRentedHours to set
	 */
	public void setNumberOfRentedHours(int numberOfRentedHours) {
		if (numberOfRentedHours > 0) {
			this.numberOfRentedHours = numberOfRentedHours;
		}
	}
	
	public double calculateTotalRentalFees() {
		double ratePerHour = RATE * equipmentValueCAD;
		return getNumberOfRentedHours() * ratePerHour;
	}
	
	public double trainingFees() {
		double trainingFee = 0.0;
		String laborType = getTypeOfLabour();
		if (laborType == "inexperienced") {
			trainingFee = (equipmentValueCAD * EQUIP_FEE);
			return trainingFee;
		}
		return trainingFee;
	}

	
	@Override
	public String toString() {
		String newLine = System.getProperty("line.separator");
		String result = super.toString();
		result = result + newLine + "Equipment rented (hours): " + getNumberOfRentedHours() + newLine + "Equipment Rental Fees: " + getEquipmentValueCAD() + newLine + "Training Fees: " + trainingFees();
		return result;
	}

	@Override
	public double calculateTotalCost() {
		trainingFees();
		double result = super.calculateTotalCost();
		result = (trainingFees() + getEquipmentValueCAD() + (result * RATE));
		return result;
	}
}
