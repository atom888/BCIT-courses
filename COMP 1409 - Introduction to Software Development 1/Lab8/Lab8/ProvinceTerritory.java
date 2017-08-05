
/**
 * This class ProvinceTerritory will provide information relating to the provinces names and their populations.
 *
 * @Adam Dipinto
 * @version V1 June 2 2017
 */

import java.util.ArrayList;
public class ProvinceTerritory
{
    private ProvinceTerritory[] provinces;
    
    private String name;
    private int population;
    
    public static final int NO_SUCH_PROVINCE = -1;
    
    public static final int BC = 0;
    public static final int AB = 1;
    public static final int SK = 2;
    public static final int MB = 3; 
    public static final int ON = 4;
    public static final int QC = 5;
    public static final int NS = 6;
    public static final int NB = 7;
    public static final int PEI = 8;
    public static final int NFW = 9;
    public static final int YK = 10;
    public static final int NU = 11;
    public static final int NWT = 12;
    
    public static final int NUM_OF_PROV = 13;
    public static final int MAX_OUT = 999999999;

    /**
     * Constructor for objects of class ProvinceTerritory - not allowing null or negative values
     * @param newName - sets the name of the province if not null
     * @param newPopulation - sets the population if larger than zero
     */
    public ProvinceTerritory(String newName, int newPopulation) {
        if (newName != null) {
            this.name = newName;
        }
        if (newPopulation > 0) {
            this.population = newPopulation;
        }
    }
    
    /**
     * @return getPopulation - returns the population value of the province provided
     * @param province - the suggested province for finding population value
     */
    public int getPopulation(String province) {
        int population = NO_SUCH_PROVINCE;
        
        if (province.equals(null)) {
            population = NO_SUCH_PROVINCE;
        }
        
        for (int i = 0; i < provinces.length; i++) {
            if (provinces[i].name == province) {
                population = provinces[i].population;
            }
        }
        
        return population; 
    }
    /**
     * @param newPopulation - sets the population value unless negative
     */
    public void setPopulation (int newPopulation) {
        if (newPopulation > 0) {
            this.population = newPopulation;
        }
    }
    /**
     * @return getPopulation - returns the population value
     */
    public int getPopulation() {
        return population;
    }
    /**
     * @return getName - returns the province name
     */
    public String getName() {
        return name;
    }
    /**
     * @param newName - sets the name of the province
     */
    public void setName (String newName) {
        if (newName != null) {
            this.name = newName;
        }
    }
    /**
     * Canada - establishes the province array containing all provinces 
     */
    public void Canada () {
            provinces = new ProvinceTerritory[NUM_OF_PROV];  
            
            provinces[BC] = new ProvinceTerritory("British Columbia", 4400057);
            provinces[AB] = new ProvinceTerritory("Alberta", 3645257);
            provinces[SK] = new ProvinceTerritory("Saskatchewan", 1033381);
            provinces[MB] = new ProvinceTerritory("Manitoba", 1208268);
            provinces[ON] = new ProvinceTerritory("Ontario", 12851821);
            provinces[QC] = new ProvinceTerritory("Quebec", 7903001);
            provinces[NS] = new ProvinceTerritory("Nova Scotia", 921727);
            provinces[NB] = new ProvinceTerritory("New Brunswick", 751171);
            provinces[PEI] = new ProvinceTerritory("Prince Edward Island", 140204);
            provinces[NFW] = new ProvinceTerritory("Newfoundland and Labrador", 514536);
            provinces[YK] = new ProvinceTerritory("Northwest Territories", 41426);
            provinces[NU] = new ProvinceTerritory("Nunavut", 31906);
            provinces[NWT] = new ProvinceTerritory("Yukon", 33897);
         
    }
    /**
     * @return getTotalPopulation - returns the total population value of all provinces
     */
    public int getTotalPopulation() {
        int total = 0; 
        
        for (int i = 0; i < provinces.length; i++) {
            total += provinces[i].population; 
        }
        return total;
    }
    /**
     * @return getLowestPopulation - returns the lowest population value between all provinces
     */
    public String getLowestPopulation() {
        int smallestPopulation = MAX_OUT;
        String smallestProvince = "";
        
        for (int i = 0; i < provinces.length; i++) {
            if (provinces[i].population < smallestPopulation) {
                smallestPopulation = provinces[i].population;
                smallestProvince = provinces[i].name;
            }
        }
        return smallestProvince;
    }
    /**
     * @return isProvinceInCanada - returns true if the suggest province is in Canada, false otherwise
     * @param name - the name of the suggested province
     */
    public boolean isProvinceInCanada(String name) {
        boolean result = false;
        if (name.equals(null)) {
            return result;
        }
        
        for (int i = 0; i < provinces.length; i++) {
            if (provinces[i].name == name) {
                result = true;
            }
        }
        return result;
    }
 
    /**
     * @return getProvinceWhoseNameContains - returns an array with every province that contains the suggested substring
     * @param substring - the substring that may be listed within provinces name
     */
     
    public String[] getProvinceWhoseNameContains(String substring) {
        String[] result = new String[10]; 
        String provinceName = "";
        int j = 0;
        for (int i = 0; i < provinces.length; i++) {
            provinceName = provinces[i].name;
            if (provinceName.contains(substring)) {
                result[j] = provinceName;
                j++;
            }
        }
        return result;
    }
    
    /**
     * @return getMoreProvincesWhoseNameContains - returns an array with every province that contains the suggested substring
     * @param substring - the substring that may be listed within provinces name
     */ 
     
    public ProvinceTerritory[] getMoreProvincesWhoseNameContains(String substring) {
        ProvinceTerritory[] result = new ProvinceTerritory[10]; 
        String provinceName = "";
        int j = 0;
        for (int i = 0; i < provinces.length; i++) {        
                provinceName = provinces[i].name;
                if (provinceName.contains(substring)) {
                    result[j].name = provinceName;
                    j++;
                }
        }
            return result;
        }
        
    
    
    /**
     * @return getProvincesWhoseNameStartsWith - returns an array with every province that contains the suggested substring
     * @param letter - the letter that may start at the beginning of the listed provinces 
     */
     
    public String[] getProvincesWhoseNameStartsWith(char letter) {
        String[] result = new String[10]; 
        String provinceName = "";
        int j = 0;
        for (int i = 0; i < provinces.length; i++) {
            provinceName = provinces[i].name;
            if (provinceName.charAt(0) >= letter) {
                result[j] = provinceName;
                j++;
            }
        }
        return result;
    }
    
    /**
     * @return getProvincesWithPopulationBetween - returns an array with every province between the suggested values
     * @param min and max - the population values of the min and max
     */
     
    
    public String [] getProvincesWithPopulationBetween(int min, int max) {
        int i = 0;
        int j = 0; // the new array index
        int numOfProvWithPop = 0;
        String[] matchingProvinces = new String [13];

        while(i < provinces.length){
            if((provinces[i].getPopulation() >= min) && (provinces[i].getPopulation() <= max)){
                numOfProvWithPop++;
            }
            i++;

        }

        if (numOfProvWithPop > 0){
           // matchingProvinces = new ProvinceTerritory[numOfProvWithPop];
        }else{
            return null;      
        }
            i = 0;  // start looking from the beginning again
        
        while (i < provinces.length){
            if((provinces[i].getPopulation()>= min) && provinces[i].getPopulation()<= max){
               // matchingProvinces[j] = provinces[i];
                j++;
            }
            i++;
        }
        return matchingProvinces;

    }
    
 
}
