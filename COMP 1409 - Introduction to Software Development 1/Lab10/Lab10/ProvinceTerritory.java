
/**
 * Write a description of class ProvinceTerritory here.
 *
 * @author Adam Dipintp
 * @version V1 July 8th 2017
 */
import java.util.ArrayList;
public class ProvinceTerritory
{
    private ArrayList<ProvinceTerritory> provinces;
    
    private String name;
    private int population;
    
    public static final int NO_SUCH_PROVINCE = -1;
    public static final int MAX_OUT = 999999999;
    public static final int MIN_OUT = 0;
    

    /**
     * [ProvinceTerritory]
     * @param  String newName       - sets name if not null
     * @param  int    newPopulation - sets population if greater than zero
     */
    public ProvinceTerritory(String newName, int newPopulation)
    {
        if (newName != null) {
            this.name = newName;
        }
        if (newPopulation > 0) {
            this.population = newPopulation;
        }
        
    }
    /**
     * [Canada] 
     * Generates the ProvinceTerritory ArrayList with all provinces and populations
     */
    public void Canada() {
        provinces = new ArrayList<ProvinceTerritory>();
        provinces.add(new ProvinceTerritory("British Columbia", 4400057));
        provinces.add(new ProvinceTerritory("Alberta", 3645257));
        provinces.add(new ProvinceTerritory("Saskatchewan", 1033381));
        provinces.add(new ProvinceTerritory("Manitoba", 1208268));
        provinces.add(new ProvinceTerritory("Ontario", 12851821));
        provinces.add(new ProvinceTerritory("Quebec", 7903001));
        provinces.add(null);
        provinces.add(new ProvinceTerritory("Nova Scotia", 921727));
        provinces.add(new ProvinceTerritory("New Brunswick", 751171));
        provinces.add(new ProvinceTerritory("Prince Edward Island", 140204));
        provinces.add(new ProvinceTerritory("Newfoundland and Labrador", 514536));
        provinces.add(new ProvinceTerritory("Northwest Territories", 41426));
        provinces.add(new ProvinceTerritory("Nunavut", 31906));
        provinces.add(new ProvinceTerritory("Yukon", 33897));
    }
    /**
     * [getTotalPopulation]
     * @return total - total population of all provinces
     */
    public int getTotalPopulation () {
        int total = 0;
    
        for (int i = 0; i < provinces.size(); i++) {
            if (provinces.get(i) != null) {
                total += provinces.get(i).population;
            }
            
        }
        
        return total;
    }
    /**
     * [getLowestPopulation]
     * @return smallestProvince - province with the smallest population
     */
    public String getLowestPopulation() {
        int smallestPopulation = MAX_OUT;
        String smallestProvince = "";
        
        for (int i = 0; i < provinces.size(); i++) {
            if (provinces.get(i) != null) {
                if (provinces.get(i).population < smallestPopulation) {
                    smallestPopulation = provinces.get(i).population;
                    smallestProvince = provinces.get(i).name;
                }
            }
        }
        return smallestProvince;
    }
    
    /**
     * [getHighestPopulation]
     * @return largestPopulation - province with largest population
     */
    public ProvinceTerritory getHighestPopulation() {
        int largestPopulation = MIN_OUT;
        ProvinceTerritory largestProvince = new ProvinceTerritory("",0);
        
        for (int i = 0; i < provinces.size(); i++) {
            if (provinces.get(i) != null) {
                if (provinces.get(i).population > largestPopulation) {
                    largestPopulation = provinces.get(i).population;
                    largestProvince = provinces.get(i);
                }
            }
        }
        return largestProvince; 
    }
    /**
     * [getPopulation]
     * @param  String province      - selected province to finc population
     * @return populationValue - the population value of the province inputted     
     */
    public int getPopulation(String province) {
        int populationValue = NO_SUCH_PROVINCE;
        if (province != null) {
            for (int i = 0; i < provinces.size(); i++) {
                if (provinces.get(i) != null) {
                    if (provinces.get(i).name == province) {
                        populationValue = provinces.get(i).population;
                    }
                }
            }
        }
        return populationValue;
    }
    /**
     * [isProvinceInCanada]
     * @param  String name          - name of province
     * @return  result - returns true if province provide is within Canada
     */
    public boolean isProvinceInCanada(String name){
        boolean result = false;
        
        if (name.equals(null)) {
            return result;
        } else {
            for (int i = 0; i < provinces.size(); i++) {
                if (provinces.get(i) != null) {
                    if (provinces.get(i).name == name) {
                        result = true;
                    }
                }
            }
        
        }
        return result;
    }
    /**
     * [getProvincesWhoseNameContains]
     * @param  String substring     - substring value
     * @return provincesFound - all provinces containing substring value
     */
    public ProvinceTerritory[] getProvincesWhoseNameContains(String substring) {
        String normalizedSubstring = substring.toLowerCase();
        ProvinceTerritory provincesFound[] = new ProvinceTerritory[13];
        int j = 0;
        
        for (int i = 0; i < provinces.size(); i++) {
            if (provinces.get(i) != null) {
                String provinceName = provinces.get(i).name.toLowerCase();
                
                if (provinceName.contains(normalizedSubstring)) {
                    provincesFound[j] = (provinces.get(i));
                    j++;
                }
            }
        }
        return provincesFound;
    }
    /**
     * [getMoreProvincesWhoseNameContains]
     * @param  String substring     - substring value
     * @return provincesContaining - all provinces containing substring
     */
    public ArrayList<ProvinceTerritory> getMoreProvincesWhoseNameContains(String substring) {
        String normalizedSubstring = substring.toLowerCase();
        ArrayList provincesContaining = new ArrayList<ProvinceTerritory>();
        
        for (int i = 0; i < provinces.size(); i++) {
            if (provinces.get(i) != null) {
                String provinceName = provinces.get(i).name.toLowerCase();
                if (provinceName.contains(normalizedSubstring)) {
                    provincesContaining.add(provinces.get(i));
                }
            }
        }
        return provincesContaining;
    }
    /**
     * [getProvincesWhoseNameStartsWith]
     * @param  char letter        - char value
     * @return  provincesStart - all provinces starting with char provided
     */
    public ArrayList<String> getProvincesWhoseNameStartsWith(char letter) {
        char normalizedLetter = Character.toLowerCase(letter);
        
        ArrayList provincesStart = new ArrayList<ProvinceTerritory>();
        
        for (int i = 0; i < provinces.size(); i++) {
            if (provinces.get(i) != null) {
                String provinceName = provinces.get(i).name.toLowerCase();
                if (provinceName.charAt(0) == normalizedLetter) {
                    provincesStart.add(provinces.get(i));
                }
            }
        }
        return provincesStart;
    }
    
    
}
