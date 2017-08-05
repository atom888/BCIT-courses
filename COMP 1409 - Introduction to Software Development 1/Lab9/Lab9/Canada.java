
/**
 * This Canada class will provide information relating to each provinces name, capital, largest city and details
 *
 * @author Adam Dipinto
 * @version V1.0 June 24
 */
public class Canada
{
    private String[][] province;
    
    public int selectedProvince;
    public String provinceName;
    public String largestCity;
    public String capitalCity;
    public String STJOHNS = "St. John's";
    
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
    public static final int NUM_OF_OPTIONS = 3;
    
    public static final int NAME_OF_PROVINCE = 0;
    public static final int NAME_OF_CAPITAL_CITY = 1;
    public static final int NAME_OF_BIGGEST_CITY = 2;

    /**
     * Constructor for objects of class Canada
     */
    public void Canada()
    {
       province = new String[NUM_OF_PROV][NUM_OF_OPTIONS];
       
       province[BC][NAME_OF_PROVINCE] = "British Columbia";
       province[BC][NAME_OF_CAPITAL_CITY] = "Victoria";
       province[BC][NAME_OF_BIGGEST_CITY] = "Vancouver";
       
       province[AB][NAME_OF_PROVINCE] = "Alberta";
       province[AB][NAME_OF_CAPITAL_CITY] = "Edmonton";
       province[AB][NAME_OF_BIGGEST_CITY] = "Calgray";
       
       province[SK][NAME_OF_PROVINCE] = "Saskatchewan";
       province[SK][NAME_OF_CAPITAL_CITY] = "Regina";
       province[SK][NAME_OF_BIGGEST_CITY] = "Saskatoon";
       
       province[MB][NAME_OF_PROVINCE] = "Manitoba";
       province[MB][NAME_OF_CAPITAL_CITY] = "Winnipeg";
       province[MB][NAME_OF_BIGGEST_CITY] = "Winnipeg";
       
       province[ON][NAME_OF_PROVINCE] = "Ontario";
       province[ON][NAME_OF_CAPITAL_CITY] = "Toronto";
       province[ON][NAME_OF_BIGGEST_CITY] = "Toronto";
       
       province[QC][NAME_OF_PROVINCE] = "Quebec";
       province[QC][NAME_OF_CAPITAL_CITY] = "Quebec City";
       province[QC][NAME_OF_BIGGEST_CITY] = "Montreal";
       
       province[NS][NAME_OF_PROVINCE] = "Nova Scotia";
       province[NS][NAME_OF_CAPITAL_CITY] = "Halifax";
       province[NS][NAME_OF_BIGGEST_CITY] = "Halifax";
       
       province[NB][NAME_OF_PROVINCE] = "New Brunswick";
       province[NB][NAME_OF_CAPITAL_CITY] = "Fredericton";
       province[NB][NAME_OF_BIGGEST_CITY] = "Saint John";
       
       province[PEI][NAME_OF_PROVINCE] = "Prince Edward Island";
       province[PEI][NAME_OF_CAPITAL_CITY] = "Charlottetown";
       province[PEI][NAME_OF_BIGGEST_CITY] = "Charlottetown";
       
       province[NFW][NAME_OF_PROVINCE] = "Newfoundland and Labrador";
       province[NFW][NAME_OF_CAPITAL_CITY] = "St. John's";
       province[NFW][NAME_OF_BIGGEST_CITY] = "St. John's";
       
       province[NWT][NAME_OF_PROVINCE] = "Northwest Territories";
       province[NWT][NAME_OF_CAPITAL_CITY] = "Yellowknife";
       province[NWT][NAME_OF_BIGGEST_CITY] = "Yellowknife";
       
       province[NU][NAME_OF_PROVINCE] = "Nunavut";
       province[NU][NAME_OF_CAPITAL_CITY] = "Iqaluit";
       province[NU][NAME_OF_BIGGEST_CITY] = "Iqaluit";
       
       province[YK][NAME_OF_PROVINCE] = "Yukon";
       province[YK][NAME_OF_CAPITAL_CITY] = "Whitehorse";
       province[YK][NAME_OF_BIGGEST_CITY] = "Whitehorse";
       
       
    }

    /**
     * @return getCapitalCityOf - returns the capital city of the province provided
     * @param provinceIn - the suggested province for finding the capital city
     */
    public String getCapitalCityOf(String provinceIn)
    {
        
        for (int i = 0; i < province.length; i++) {
            if (i == (setProvince(provinceIn))) {
                capitalCity = province[i][NAME_OF_CAPITAL_CITY];
            }
        }
        return capitalCity;
    }
    
    /**
     * @return getLargestCityOf - returns the largest city of the province provided
     * @param provinceIn - the suggested province for finding the largest city
     */
    public String getLargestCityOf(String provinceIn) {
        for (int i = 0; i < province.length; i++) {
            if (i == (setProvince(provinceIn))) {
                largestCity = province[i][NAME_OF_BIGGEST_CITY];
            }
        }
        return largestCity;
    }
    
    /**
     * @return getProvinceWhoseCapitals - returns the name of the province based on the capital city provided
     * @param city - the suggested city for finding the province
     */
    public String getProvinceWhoseCapitals(String city) {
        String normalizedCity = "";
        if (city.equals(STJOHNS)) {
            normalizedCity = STJOHNS;
        } else {
            normalizedCity = (city.toLowerCase()).substring(0,1).toUpperCase() + (city.toLowerCase()).substring(1); 
        }

        for (int i = 0; i < province.length; i++) {   
            if (province[i][NAME_OF_CAPITAL_CITY].equals(normalizedCity)) {
                provinceName = province[i][NAME_OF_PROVINCE];
            }
        }
        return provinceName; 
    }
    /**
     * displayAllProvicneInfo - dissplays all information relating to the provicne
     */
    public void displayAllProvinceInfo() {
        //loop through all provinces
        for (int i = 0; i < province.length; i++) {
                if (province[i][NAME_OF_CAPITAL_CITY] == province[i][NAME_OF_BIGGEST_CITY]) {
                    System.out.println("The capital city of " + province[i][NAME_OF_PROVINCE] + " is " + province[i][NAME_OF_CAPITAL_CITY] + ", and it is also largest city");
                } else {
                    System.out.println("The capital city of " + province[i][NAME_OF_PROVINCE] + " is " + province[i][NAME_OF_CAPITAL_CITY] + ", but the largest city is " + province[i][NAME_OF_BIGGEST_CITY]);
                }    
        }
        
    }
    /**
     * @param province - the suggested province to set
     * @return - returns the in value of the provided province
     */
    public int setProvince(String province) {
        String normalizedProvince = province.toUpperCase(); 
        
        switch (normalizedProvince) {
            case "BRITISH COLUMBIA":
               selectedProvince = BC;
               break;
            case "ALBERTA":
               selectedProvince = AB;
               break;
            case "SASKATCHEWAN":
                selectedProvince = SK;
                break;
            case "MANITOBA":
                selectedProvince = MB;
                break;
            case "ONTARIO":
                selectedProvince = ON;
                break;
            case "QUEBEC":
                selectedProvince = QC;
                break;
            case "NOVA SCOTIA":
                selectedProvince = NS;
                break;
            case "NEW BRUNSWICK":
                selectedProvince = NB;
                break;
            case "PRINCE EDWARD ISLAND":
                selectedProvince = PEI;
                break;
            case "NEWFOUNDLAND AND LABRADOR":
                selectedProvince = NFW;
                break;
            case "YUKON":
                selectedProvince = YK;
                break;
            case "NUNAVUT":
                selectedProvince = NU;
                break;
            case "NORTHWEST TERRITORIES":
                selectedProvince = NWT;
                break;
            default:
                System.out.println("Please provide a valid province"); 
        }
        return selectedProvince;
    }
   
    /**
     * @return getProvince - returns the name of the province 
     */
    public String getProvince() {
        for (int i = 0; i < province.length; i++) {
            if (i == selectedProvince) {
                provinceName = province[i][NAME_OF_PROVINCE];
            }
        }
        return provinceName;
    } 
}
