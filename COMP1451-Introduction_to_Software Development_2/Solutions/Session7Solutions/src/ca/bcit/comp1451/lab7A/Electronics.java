package ca.bcit.comp1451.lab7A;
  

	
	/**
	 * @author Rana
	 *
	 */
	public abstract class Electronics {
		private String brand;
		private double priceInCad;
		private int warrantyInMonths;
		
		
		/**
		 * @param brand
		 * @param price
		 * @param warrantyInMonths
		 */
		public Electronics(String brand, double price, int warrantyInMonths) {
			setBrand(brand);
			setPriceInCad(price);
			setWarrantyInMonths(warrantyInMonths);
		}

		
		/**
		 * @return brand
		 */
		public String getBrand() {
			return brand;
		}

		/**
		 * 
		 * @return the price
		 */
		public double getPriceInCad() {
			return priceInCad;
		}

		/**
		 * 
		 * @return the warrantyInMonths
		 */
		public int getWarrantyInMonths() {
			return warrantyInMonths;
		}

		/**
		 * 
		 * @param brand the brand to set
		 */
		public void setBrand(String brand) {
			if (brand != null && !brand.equals("")){
				this.brand = brand;
			}
			else{
				this.brand = "Unknown";
			}
		}

		/**
		 * 
		 * @param price the price to set
		 */
		public void setPriceInCad(double price) {
			if (price > 0.0){
				this.priceInCad = price;
			}
			else{
				this.priceInCad = 1;
			}
		}

		/**
		 * 
		 * @param warrantyInMonths the warrantyInMonths to set
		 */
		public void setWarrantyInMonths(int warrantyInMonths) {
			if (warrantyInMonths >= 0){
				this.warrantyInMonths = warrantyInMonths;
			}
			
		}
		
		/**
		 *  
		 * @param percentage The percentage amount to increase
		 */
		public abstract void increasePrice(double percentage);


		
		@Override
		public String toString() {
			return this.getClass().getSimpleName() + " " + brand + ", $" + priceInCad + ", Warranty length: " + warrantyInMonths + " months. ";
		}
		

}
