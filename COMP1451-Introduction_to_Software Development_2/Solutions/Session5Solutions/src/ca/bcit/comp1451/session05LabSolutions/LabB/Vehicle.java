/**
 * 
 */
package ca.bcit.comp1451.session05LabSolutions.LabB;
/**
 * 
 * @author A00749008 
 */

public class Vehicle {
	
		private int yearManufactured;
		private String make;
		private String model;
		
		/**
		 * non-default Vehicle constructor
		 * @param yearManufactured
		 * @param make
		 * @param model
		 */
      
		public Vehicle (int yearManufactured, String make, String model){
			setYearManufactured(yearManufactured);
			setMake(make);
			setModel(model);
		}
		public Vehicle() {
			
		}
		
		
		/**
		 * Method setYearManufactured
		 * @param yearManufactured
		 */
		
		public void setYearManufactured(int yearManufactured){
			if(yearManufactured > 0){
				this.yearManufactured = yearManufactured;
			}
		}
		
		/**
		 * Method setMake
		 * @param make
		 */
		
		public void setMake(String make){
			if(make != null && ! make.isEmpty()){
				this.make = make;
			} else {
				this.make = "unknown";
			}
		}
		
		/**
		 * Method setModel
		 * @param model
		 */
		public void setModel(String model){
			if(model != null && ! model.isEmpty()){
				this.model = model;
			} else {
				this.model = "unknown";
			}
		}

		/**
		 * Method getYearManufactured
		 * @return yearManufactured
		 */
		public int getYearManufactured(){
			return yearManufactured;
		}
		
		/**
		 * Method getMake
		 * @return make
		 */
		public String getMake(){
			return make;
		}
		
		/**
		 * Method getModel
		 * @return model
		 */
		public String getModel(){
			return model;
		}
		
		
}
