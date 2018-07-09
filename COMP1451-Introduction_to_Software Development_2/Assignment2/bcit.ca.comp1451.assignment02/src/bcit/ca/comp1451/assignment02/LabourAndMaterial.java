/**
 * 
 */
package bcit.ca.comp1451.assignment02;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

/**
 * @author adamdipinto
 *
 */
public class LabourAndMaterial extends Labour implements Transferable {

	private static double VOL_RATE_UNDER = 1.5;
	private static double VOL_RATE_OVER = 2.0;
	private double materialPurchasePrice;
	private double materialVolumeInCubicFoot;
	private double materialDistanceOfTransportationKM;
	private static double SALES_TAX = 1.05;
	private static double MARK_UP = 1.15;
	
	public LabourAndMaterial(String projectName, int numOfWorkingHours, double hourlyRate,
			int distanceOfTransportationKM, String hourlyRateCriteria, String typeOfLabour) {
		super(projectName, numOfWorkingHours, hourlyRate, distanceOfTransportationKM, hourlyRateCriteria, typeOfLabour);
		setMaterialPurchasePrice(materialPurchasePrice);
		setMaterialVolumeInCubicFoot(materialVolumeInCubicFoot);
		setMaterialDistanceOfTransportationKM(materialDistanceOfTransportationKM);
	}
	
	

	/**
	 * @return the materialPurchasePrice
	 */
	public double getMaterialPurchasePrice() {
		return materialPurchasePrice;
	}



	/**
	 * @param materialPurchasePrice the materialPurchasePrice to set
	 */
	public void setMaterialPurchasePrice(double materialPurchasePrice) {
		if (materialPurchasePrice > 0) {
			this.materialPurchasePrice = materialPurchasePrice;
		}
	}



	/**
	 * @return the materialVolumeInCubicFoot
	 */
	public double getMaterialVolumeInCubicFoot() {
		return materialVolumeInCubicFoot;
	}



	/**
	 * @param materialVolumeInCubicFoot the materialVolumeInCubicFoot to set
	 */
	public void setMaterialVolumeInCubicFoot(double materialVolumeInCubicFoot) {
		if (materialVolumeInCubicFoot > 0) {
			this.materialVolumeInCubicFoot = materialVolumeInCubicFoot;
		}
	}



	/**
	 * @return the materialDistanceOfTransportationKM
	 */
	public double getMaterialDistanceOfTransportationKM() {
		return materialDistanceOfTransportationKM;
	}



	/**
	 * @param materialDistanceOfTransportationKM the materialDistanceOfTransportationKM to set
	 */
	public void setMaterialDistanceOfTransportationKM(double materialDistanceOfTransportationKM) {
		if (materialDistanceOfTransportationKM > 0) {
			this.materialDistanceOfTransportationKM = materialDistanceOfTransportationKM;
		}
	}

	public double totalMaterialCost() {
		double totalMaterialCost = getMaterialPurchasePrice() * MARK_UP;
		return totalMaterialCost;
	}
	
	@Override
	public double calculateTransportationCost() {
		double transportationCost = super.calculateTransportationCost();
		if (materialVolumeInCubicFoot >= 10) {
			transportationCost = materialDistanceOfTransportationKM * VOL_RATE_OVER;
		}
		if (materialVolumeInCubicFoot < 10) {
			transportationCost = materialDistanceOfTransportationKM * VOL_RATE_UNDER;
		}
		return transportationCost;
	}
	
	@Override
	public double calculateTotalCost() {
		double result = super.calculateTotalCost();
		result = result + ((totalMaterialCost() + calculateTransportationCost()) * SALES_TAX);
		return result;
	}
	
	@Override
	public String toString() {
		String newLine = System.getProperty("line.separator");
		String result = super.toString();
		result = result + newLine+ "Material Cost: " + totalMaterialCost() + newLine + "Transportation Fees: " + calculateTransportationCost();
		return result;
	}
		

	/* (non-Javadoc)
	 * @see java.awt.datatransfer.Transferable#getTransferDataFlavors()
	 */
	@Override
	public DataFlavor[] getTransferDataFlavors() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.awt.datatransfer.Transferable#isDataFlavorSupported(java.awt.datatransfer.DataFlavor)
	 */
	@Override
	public boolean isDataFlavorSupported(DataFlavor flavor) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see java.awt.datatransfer.Transferable#getTransferData(java.awt.datatransfer.DataFlavor)
	 */
	@Override
	public Object getTransferData(DataFlavor flavor) throws UnsupportedFlavorException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

}
