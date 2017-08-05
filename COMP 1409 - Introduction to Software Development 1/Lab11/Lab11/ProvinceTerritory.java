
/**
 * Write a description of class ProvinceTerritory here.
 *
 * @author Adam Dipinto
 * @version v1 July 15 2017
 */
import java.util.ArrayList;
import java.util.Iterator;
public class ProvinceTerritory
{
    private ArrayList<ProvinceTerritory> provinces;
    
    private String name;
    private int population;
    
    public static final int NO_SUCH_PROVINCE = -1;
   
    public static final int NUM_OF_PROV = 13;
    public static final int MAX_OUT = 999999999;
    public static final int MIN_OUT = 0;
    
    /**
     * [ProvinceTerritory]
     * @param  String newName       - sets name if not null
     * @param  int    newPopulation - sets population if greater than zero
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
     * @param newPopulation - sets the population value unless negative
     */
    public void setPopulation (int newPopulation) {
        if (newPopulation > 0) {
            this.population = newPopulation;
        }
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
        provinces = new ArrayList<ProvinceTerritory>();
        provinces.add(new ProvinceTerritory("British Columbia", 4400057));
        provinces.add(new ProvinceTerritory("Alberta", 3645257));
        provinces.add(new ProvinceTerritory("Saskatchewan", 1033381));
        provinces.add(new ProvinceTerritory("Manitoba", 1208268));
        provinces.add(new ProvinceTerritory("Ontario", 12851821));
        provinces.add(new ProvinceTerritory("Quebec", 7903001));
        provinces.add(new ProvinceTerritory("Nova Scotia", 921727));
        provinces.add(new ProvinceTerritory("New Brunswick", 751171));
        provinces.add(new ProvinceTerritory("Prince Edward Island", 140204));
        provinces.add(new ProvinceTerritory("Newfoundland and Labrador", 514536));
        provinces.add(new ProvinceTerritory("Northwest Territories", 41426));
        provinces.add(new ProvinceTerritory("Nunavut", 31906));
        provinces.add(new ProvinceTerritory("Yukon", 33897));
    }
    /**
     * @return getTotalPopulation - returns the total population value of all provinces
     */
    public int getTotalPopulation() {
        int total = 0; 
        Iterator<ProvinceTerritory> it = provinces.iterator();
        
        while(it.hasNext()) {
            ProvinceTerritory p = it.next();
            total += p.population;

        }
        return total;
    }
    /**
     * @return getLowestPopulation - returns the lowest population value between all provinces
     */
    public String getLowestPopulation() {
        int smallestPopulation = MAX_OUT;
        String smallestProvince = "";
        
        Iterator<ProvinceTerritory> it = provinces.iterator();
        
        while(it.hasNext()) {
            ProvinceTerritory p = it.next();
            if (p.population < smallestPopulation) {
                smallestPopulation = p.population;
                smallestProvince = p.name;
            }
        }
       
        return smallestProvince;
    }
    
    /**
     * [getPopulation]
     * @param  String province      - selected province to finc population
     * @return populationValue - the population value of the province inputted     
     */
    
    public int getPopulation(String province) {
        int populationValue = NO_SUCH_PROVINCE;
        String normalizedProvince = province.toUpperCase();
        Iterator<ProvinceTerritory> it = provinces.iterator();
        
        if (normalizedProvince != null) {
            while(it.hasNext()) {
                ProvinceTerritory p = it.next();
                if (p.name.toUpperCase().equals(normalizedProvince)) {
                    populationValue = p.population;
                }
            }
        }
        return populationValue;
    }
    /**
     * @return getProvincesWithPopulationBetween - returns an array with every province between the suggested values
     * @param min and max - the population values of the min and max
     */
     
    public String[] getProvincesWithPopulationBetween(int min, int max) {
        String[] matchingProvinces = new String [13];
        Iterator<ProvinceTerritory> it = provinces.iterator();
        int j = 0;
        
        while(it.hasNext()) {
            ProvinceTerritory p = it.next();
            if (p.population >= min && p.population <= max) {
                matchingProvinces[j] = p.name;
                j++;
            }
        }
        
        return matchingProvinces;
    }
    /**
     * [isProvinceInCanada]
     * @param  String name          - name of province
     * @return  result - returns true if province provide is within Canada
     */
    public boolean isProvinceInCanda(String name){
        boolean result = false;
        Iterator<ProvinceTerritory> it = provinces.iterator();
        
        if (name.equals(null)) {
            return result;
        }
        
        while(it.hasNext()) {
            ProvinceTerritory p = it.next();
            if (p.name.equals(name)) {
                result = true;
            }
        }
        return result;
    }
    /**
     * [getProvincesWhoseNameContains]
     * @param  String substring     - substring value
     * @return provincesFound - all provinces containing substring value
     */
    public String[] getProvincesWhoseNameContains(String substring) {
        String[] result = new String[10]; 
        String provinceName = "";
        Iterator<ProvinceTerritory> it = provinces.iterator();
        int j = 0;
        
        while(it.hasNext()) {
            ProvinceTerritory p = it.next();
            if (p.name.contains(substring)) {
                result[j] = p.name;
                j++;
            }
        }
        return result;
    }
    /**
     * [getProvincesWhoseNameContains]
     * @param  String substring     - substring value
     * @return provincesFound - all provinces containing substring value
     */
    public ProvinceTerritory[] getMoreProvincesWhoseNameContains(String substring){
        ProvinceTerritory[] result = new ProvinceTerritory[10]; 
        Iterator<ProvinceTerritory> it = provinces.iterator();
        int j = 0;
        
        while(it.hasNext()) {
            ProvinceTerritory p = it.next();
            if (p.name.contains(substring)) {
                result[j] = p;
                j++;
            }
        }
        return result;
    }
    /**
     * [getProvincesWhoseNameStartsWith]
     * @param  char letter        - char value
     * @return  provincesStart - all provinces starting with char provided
     */
    public String[] getProvincesWhoseNameStartsWith(char letter) {
        char normalizedLetter = Character.toUpperCase(letter);
        Iterator<ProvinceTerritory> it = provinces.iterator();
        String[] result = new String[10]; 
        String provinceName = "";
        int j= 0;
        
            while(it.hasNext()) {
                ProvinceTerritory p = it.next();
                if (p.name.charAt(0) == normalizedLetter) {
                    result[j] = p.name;
                    j++;
                }
            }
            return result;
    }
    
}
   
    
