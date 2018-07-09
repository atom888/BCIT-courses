/**
 * 
 */
package ca.bcit.comp1451.lab7a;

/**
 * @author A01034457
 *
 */
public abstract class Electronics {
	private String brand;
	private double price;
	private int warrantyMonths;
	/**
	 * @param brand
	 * @param price
	 * @param warrantyMonths
	 */
	public Electronics(String brand, double price, int warrantyMonths) {
		setBrand(brand);
		setPrice(price);
		setWarrantyMonths(warrantyMonths);
	}
	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		if (brand != null && !brand.isEmpty()) {
			this.brand = brand;
		} else {
			throw new IllegalArgumentException("Incorrect Value.");
		}
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		if (price > 0) {
			this.price = price;
		} else {
			throw new IllegalArgumentException("Incorrect Value.");
		}
	}
	/**
	 * @return the warrantyMonths
	 */
	public int getWarrantyMonths() {
		return warrantyMonths;
	}
	/**
	 * @param warrantyMonths the warrantyMonths to set
	 */
	public void setWarrantyMonths(int warrantyMonths) {
		if (warrantyMonths > 0) {
			this.warrantyMonths = warrantyMonths;
		} else {
			throw new IllegalArgumentException("Incorrect Value.");
		}
	}
	
	public abstract void increasePrice(double percentage);
	
	@Override
	public String toString() {
		String result;
		result = "Brand: " + brand + "Price: " + price + " Warranty: " + warrantyMonths;
		return result;
		
	}

}
