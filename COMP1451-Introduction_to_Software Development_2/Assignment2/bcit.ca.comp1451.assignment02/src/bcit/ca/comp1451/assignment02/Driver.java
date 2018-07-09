/**
 * 
 */
package bcit.ca.comp1451.assignment02;

import java.util.Scanner;

/**
 * @author adamdipinto
 *
 */
public class Driver {
	private static Scanner input;

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		input = new Scanner(System.in);
		InsuranceCompany insuranceCompany = new InsuranceCompany("Tax man");

		Labour labour1 = new Labour("first labour project", 50, 20.0, 18, "regular", "experienced");
		Labour labour2 = new Labour("second labour project", 80, 20.0, 36, "holiday", "inexperienced");
		
		LabourAndMaterial labourMaterial1 = new LabourAndMaterial("first labour and material project", 80, 20.0, 10, "regular", "experienced");
		LabourAndMaterial labourMaterial2 = new LabourAndMaterial("second labour and material project", 80, 20.0, 24, "holiday", "inexperienced");
		labourMaterial1.setMaterialPurchasePrice(500);
		labourMaterial1.setMaterialDistanceOfTransportationKM(52.5);
		labourMaterial2.setMaterialPurchasePrice(500);
		labourMaterial2.setMaterialDistanceOfTransportationKM(52.5);
		
		
		LabourAndMaterialAndEquipment labourMaterialEquipment1 = new LabourAndMaterialAndEquipment("first labour and material and equipment project", 80, 20.0, 10, "regular", "experienced");
		LabourAndMaterialAndEquipment labourMaterialEquipment2 = new LabourAndMaterialAndEquipment("second labour and material and equipment project", 80, 20.0, 24, "over time", "inexperienced");
		labourMaterialEquipment1.setMaterialPurchasePrice(500);
		labourMaterialEquipment1.setMaterialDistanceOfTransportationKM(52.5);
		labourMaterialEquipment1.setNumberOfRentedHours(20);
		labourMaterialEquipment1.setEquipmentValueCAD(5000);
		
		labourMaterialEquipment2.setMaterialPurchasePrice(500);
		labourMaterialEquipment2.setMaterialDistanceOfTransportationKM(52.5);
		labourMaterialEquipment2.setNumberOfRentedHours(20);
		labourMaterialEquipment2.setEquipmentValueCAD(5000);


		
		insuranceCompany.addInvoice(labour1);
		insuranceCompany.addInvoice(labour2);
		insuranceCompany.addInvoice(labourMaterial1);
		insuranceCompany.addInvoice(labourMaterial2);
		insuranceCompany.addInvoice(labourMaterialEquipment1);
		insuranceCompany.addInvoice(labourMaterialEquipment2);	
		
		insuranceCompany.displaySortedProjectInvoices();
		String quit = "";
		do {
			System.out.println("Please provide an invoice number");
			if (input.hasNextInt()) {
				System.out.println("Invalid invoice number, the invoice number was either null or less than 7 characters long");
			} else if (input.hasNextDouble()) {
				System.out.println("Invalid invoice number, the invoice number was either null or less than 7 characters long");
			} else if (input.hasNext()) {
				String accountNumber = input.next().toUpperCase();
				try {
					insuranceCompany.displayProjectInvoice(accountNumber);
				} catch (InvalidInvoiceNumberException e) {
					e.getMessage();
					e.printStackTrace();
				}
			}

			System.out.println("");
			System.out.println("Would you like to enter another number? (Y/N)");
			quit = input.next();
			quit.toLowerCase();
		} while (quit.equals("y")); 
		System.out.println("Thank you!");
		System.exit(0);

	}

}
