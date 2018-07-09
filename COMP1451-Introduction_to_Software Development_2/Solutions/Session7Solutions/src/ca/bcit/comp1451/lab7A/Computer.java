package ca.bcit.comp1451.lab7A;


/**
 * @author Rana
 *
 */
public class Computer extends Electronics{
	
	public static final int WARRANTY_INCREASE = 12;
	
	private int cpuSpeed;
	private int memorySizeGB;
	
	/**
	 * 
	 * @param brand The brand name of the computer
	 * @param price The price of the computer
	 * @param warrantyInMonths The length of the warranty in months
	 * @param cpuSpeed The speed of the cpu in mhz
	 * @param memorySizeGB The memory capacity in GB
	 */
	public Computer(String brand, double price, int warrantyInMonths, int cpuSpeed, int memorySizeGB) {
		super(brand, price, warrantyInMonths);
		setCpuSpeed(cpuSpeed);
		setMemorySizeGB(memorySizeGB);
	}
	
	/**
	 * @return the cpuSpeed
	 */
	public int getCpuSpeed() {
		return cpuSpeed;
	}
	
	/**
	 * @return the memorySizeGB
	 */
	public int getMemorySizeGB() {
		return memorySizeGB;
	}
	
	/**
	 * @param cpuSpeed the cpuSpeed to set
	 */
	public void setCpuSpeed(int cpuSpeed) {
		if (cpuSpeed > 0){
			this.cpuSpeed = cpuSpeed;
		}
		else{
			this.cpuSpeed = 1;
		}
	}
	
	/**
	 * @param memorySizeGB
	 */
	public void setMemorySizeGB(int memorySizeGB) {
		if (memorySizeGB > 0){
			this.memorySizeGB = memorySizeGB;
		}
		else{
			this.memorySizeGB = 1;
		}
	}

	/**
	 * @param percentage The percentage to increase by
	 */
	public void increasePrice(double percentage){
		if (percentage > 0.0){
			setPriceInCad(getPriceInCad() + (getPriceInCad() *percentage));
			setWarrantyInMonths(getWarrantyInMonths() + WARRANTY_INCREASE);
		}
	}

	@Override
	public String toString() {
		return super.toString() + " Cpu Speed: " + cpuSpeed + "MHz, memory size: " + memorySizeGB + " GB";
	}
	

}
