package ca.bcit.comp1451.lab7A;


	/**
	 * @author Rana
	 *
	 */
	public class CellPhone extends Electronics {
		
		public static final int WARRANTY_INCREASE = 6;
		private double batteryLifeTime;

		/**
		 * Create a cellphone object
		 * @param brand The brand name of the phone
		 * @param price The price of the phone
		 * @param warrantyInMonths The length of the warranty in months
		 * @param batteryLifeTime The lifetime of the battery in hours
		 */
		public CellPhone(String brand, double price, int warrantyInMonths, double batteryLifeTime) {
			super(brand, price, warrantyInMonths);
			setBatteryLifeTime(batteryLifeTime);
		}
		

		/**
		 * @return the batteryLifeTime
		 */
		public double getBatteryLifeTime() {
			return batteryLifeTime;
		}

		/**
		 * @param batteryLifeTime the batteryLifeTime to set
		 */
		public void setBatteryLifeTime(double batteryLifeTime) {
			if (batteryLifeTime >= 0.0){
				this.batteryLifeTime = batteryLifeTime;
			}
		}

		/**
		 * Increase the price of the cellphone by the given percentage, and add 6 months to the warranty
		 * @param percentage The percentage to increase by
		 */
		public void increasePrice(double percentage){
			if (percentage > 0.0){
				setPriceInCad(getPriceInCad() + (getPriceInCad() * percentage));
				setWarrantyInMonths(getWarrantyInMonths() + WARRANTY_INCREASE);
			}
		}
		
		@Override
		public String toString() {
			return super.toString() + "Battery lifetime: " + batteryLifeTime + " hours.";
		}
	

}
