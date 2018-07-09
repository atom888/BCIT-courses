/**
 * 
 */
package bcit.ca.comp1451.assignment02;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author adamdipinto
 *
 */
public class InsuranceCompany  {
	private String companyName;
	private ArrayList<ProjectInvoice> list;
	
	private static double LABOUR_INS = 0.05;
	private static double LABOUR_MATERIAL_INS = 0.05;
	private static double LABOUR_MATERIAL_EQU_INS = 0.05;
	
	/**
	 * @param companyName
	 * @param list
	 */
	public InsuranceCompany(String companyName) {
		setCompanyName(companyName);
		list = new ArrayList<ProjectInvoice>();
	}
	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}
	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		if (companyName != null && !companyName.isEmpty()) {
			this.companyName = companyName;
		} else {
			this.companyName = "unknown";
		}
	}
	
	public void addInvoice(ProjectInvoice obj) {
		if (obj != null) {
			list.add(obj);
		}
	}
	
	public void displayProjectInvoice(String invoiceNum) throws InvalidInvoiceNumberException {
		if (invoiceNum != null && !invoiceNum.isEmpty() && (invoiceNum.length() == 7) ) {
			String invoiceNumFormatted = invoiceNum.toUpperCase();
			
			for (ProjectInvoice item: list) {
				if (item.getInvoiceNumber().equals(invoiceNumFormatted)) {
					System.out.print(item.toString());
				}
			} 
		} else {
			throw new InvalidInvoiceNumberException("The value provide is incorrect");
		}
	}
	
	public double calculateTotalInsuranceFees() {
		double result = 0.0;
		for (ProjectInvoice item: list) {
			if (item instanceof Labour) {
				result = (item.calculateTotalCost() * LABOUR_INS );
			} else if (item instanceof LabourAndMaterial) {
				result = (item.calculateTotalCost() * LABOUR_MATERIAL_INS);
			} else if (item instanceof LabourAndMaterialAndEquipment) {
				result = (item.calculateTotalCost() * LABOUR_MATERIAL_EQU_INS);
			}
		} 
		return result;
	}
	
	public void displaySortedProjectInvoices() {
		
		Collections.sort(list);
		for (ProjectInvoice item: list) {
			item.compareTo(item);
			System.out.println("======================");
			if (item instanceof Labour) {
				System.out.println(item.toString());
				System.out.println("Total Cost including 5% tax : " + item.calculateTotalCost());
			} else if (item instanceof LabourAndMaterial) {
				System.out.println(item.toString());
				System.out.println("Total Cost including 5% tax : " + item.calculateTotalCost());
			} else if (item instanceof LabourAndMaterialAndEquipment) {
				System.out.println(item.toString());
				System.out.println("Total Cost including 5% tax : " + item.calculateTotalCost());
			}
			System.out.println("======================");
		}
		list.toString();
	}
	


}
