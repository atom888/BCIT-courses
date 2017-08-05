
/**
 * Write a description of class Model here.
 *
 * @author Adam Dipinto
 * @version V1.0 May 13 2017
 */
public class Model
{
    private String firstName;
    private static final int MIN_CHARACTER_LENGTH = 3;
    private static final int MAX_CHARACTER_LENGTH = 20;
    private String lastName;
    private int heightInches;
    private static final int MIN_HEIGHT_INCHES = 24;
    private static final int MAX_HEIGHT_INCHES = 84;
    private int feet;
    private int inches;
    private static final int MIN_INCH = 1;
    private static final int MAX_INCH = 12;
    private double weightKg;
    private double weightPounds;
    private static final int MIN_WEIGHT_POUNDS = 80;
    private static final int MAX_WEIGHT_POUNDS = 280;
    private boolean canTravel;
    private boolean smokes;
    private static String occupation = "modeling";
    
    public static final int INCHES_PER_FOOT = 12;
    public static final int BASE_RATE_DOLLARS_PER_HOUR = 60;
    public static final int TALL_THIN_BONUS_DOLLARS_PER_HOUR = 5;
    public static final int TALL_INCHES = 67;
    public static final double THIN_POUNDS = 140.0;
    public static final int TRAVEL_BONUS_DOLLARS_PER_HOUR = 4;
    public static final int SMOKER_DEDUCTION_DOLLARS_PER_HOUR = 10;
    
    private static int hourlyRate;
    private static boolean metricUnits;
    private static double heightCM;

    /**
    * Constructors - Initialized Values
    * @param cFirstName - sets first name of model
    * @param cLastName - sets last name of model
    * @param cHeightInches - sets height in inches for model
    * @param cWeightPounds - sets weigth in pounds for model
    * @param cCanTravel - sets if the model can or cannot travel (true or false)
    * @param cSmoke - sets if the model smokes or does not (true of false)
    */ 
    public Model(String cFirstName, String cLastName, int cHeightInches, double cWeightPounds, boolean cTravel, boolean cSmoke) {
       
        setFirstName(cFirstName);
        setLastName(cLastName);
        setHeightInches(cHeightInches);
        setWeightPounds(cWeightPounds);
        setCanTravel(cTravel);
        setCanSmoke(cSmoke);
    }
   
    /**
    * Constructor for setting travel and smoking
    * @param newFirstName - sets first name of model
    * @param newLastName - sets last name of model
    * @param newHeightInches - sets height in inches for model
    * @param newWeightPounds - sets weigth in pounds for model. 
    * <br>
    * CanTravel - automatically set to true.
    * <br>
    * CanSmoke - automatically set to false.
    */
    public Model(String newFirstName, String newLastName, int newHeightInches, double newWeightPounds)
    {
       
       setFirstName(newFirstName);
       setLastName(newLastName);  
       setHeightInches(newHeightInches); 
       setWeightPounds(newWeightPounds);
       setCanTravel(true);
       setCanSmoke(false);
    }
    
    /**
    * Setters
    * setFirstName
    * @param sFirstName - sets first name of model if the name is longer than three characters and less than twenty
    */
    public final void setFirstName(String sFirstName) {
        if (sFirstName.length() > MIN_CHARACTER_LENGTH && sFirstName.length() < MAX_CHARACTER_LENGTH && sFirstName != null) {
            firstName = sFirstName;
        }
    }
    /**
    * setLastName 
    * @param sLastName - sets last name of model if the name is longer than three characters and less than twenty
    */
    public final void setLastName(String sLastName) {
        if (sLastName.length() > MIN_CHARACTER_LENGTH && sLastName.length() < MAX_CHARACTER_LENGTH && sLastName != null) {
            lastName = sLastName;
        }
    }
    /**
    * setWeightKg
    * @param kilograms - sets weight in kilogram 
    */
    public void setWeightKg(long kilograms) {
        weightKg = (long)Math.round(kilograms);
    }
    /**
    * setWeigthPounds
    * @param sWeightPounds - sets weight in pounds if it is between 80 and 280 pounds
    */
    public void setWeightPounds(double sWeightPounds) {
        if(sWeightPounds >= MIN_WEIGHT_POUNDS && sWeightPounds <= MAX_WEIGHT_POUNDS) {
            weightPounds = sWeightPounds;
        }
    }
    /**
    * setHeightFeetInces
    * @param sInches - sets height for feet and inches method
    */
    public void setHeightFeetInches(int sInches) {
        feet = sInches / MAX_INCH;
        inches = sInches % MAX_INCH;
    }
    /**
    * setHeightInches
    * @param sHeightInches - sets height in inches if it is between 0 and 12 inches 
    */
    public void setHeightInches(int sHeightInches) {
        if (sHeightInches >= MIN_HEIGHT_INCHES && sHeightInches <= MAX_HEIGHT_INCHES) {
            heightInches = sHeightInches;
        }
    }
    /**
    * setCanTravel
    * @params sTravel - sets travel to true or false 
    */
     public final void setCanTravel(boolean sTravel){
        canTravel = sTravel;
    }
    /**
    * setCanSmoke
    * @param sSmoke - sets smoking to true or false 
    */
    public final void setCanSmoke(boolean sSmoke) {
        smokes = sSmoke;
    }
    /**
    * setMetricUnits
    * @param  sMetricUnits - acts as a switch between imperical and metric
    */
    public void setMetricUnits(boolean sMetricUnits) {
        metricUnits = sMetricUnits;
    }
    
    /**
    * Getters
    * getFirstName 
    * @returns first name
    */
    public String getFirstName() {
        return firstName;
    }
    /**
    * getLastName
    * @returns lastName
    */
    public String getLastName() {
        return lastName;
    }
    /**
    * getHeigthInFeetAndInches
    * @returns height as X feet Y inches
    */
    public String getHeigthInFeetAndInches() {
         if (inches == MIN_INCH) {
             return feet + " feet " + inches + " inch";
         } else if (inches >= MIN_INCH && inches <= MAX_INCH) {
           return feet + " feet " + inches + " inche";  
         } else if (inches == 0) {
             return feet + " feet";
         } else {
           return "Does not compute";
         }
         
    }
    /**
    * getHeightInches
    * @returns heightInches
    */
    public int getHeightInches() {
        return heightInches;
    }
    /**
    * getHeightCM
    * @returns heightCM
    */
    public double getHeightCM() {
        heightCM = heightInches * 2.54;
        return (double)Math.round(heightCM);
    } 
    /**
    * getWeightKg
    * @returns WeightKg
    */
     public double getWeightKg() {
        weightKg = weightPounds * 0.453592;
         return (double)Math.round(weightKg); 
    }
    /**
    * getWeightPounds
    * @returns weightPounds
    */
    public double getWeightPounds() {
        return weightPounds;
    }
    /**
     * getOccupation
     * @returns occupation
       */
     public static String getOccupation() {
        return occupation;
    }
    /**
     * getHourlyRate
     * @returns hourlyRate
       */
    public int getHourlyRate() {
        return hourlyRate;
    }
   
    /**
    * Methods
    * calculatePayDollarPerHour
    * @returns hourlyRate
    */
   
    public int calculatePayDollarsPerHour() {
            int hourlyRate = BASE_RATE_DOLLARS_PER_HOUR;
            if (canTravel) {
                hourlyRate += TRAVEL_BONUS_DOLLARS_PER_HOUR;
            } 
            
            if (smokes) {
                hourlyRate -= SMOKER_DEDUCTION_DOLLARS_PER_HOUR;
            }
            
            if(getHeightInches() >= TALL_INCHES && getWeightPounds() <= THIN_POUNDS) {
                hourlyRate += TALL_THIN_BONUS_DOLLARS_PER_HOUR;
            }
            
            return hourlyRate;
    }
    /**
    * printDetails
    * @returns a sentence describing the name, heigth, weight, traveller, and smoker
    */

    public void printDetails() {
    
            System.out.println("Name: " + getFirstName() + " " + getLastName());
            System.out.println("Height: " + getHeightInches() + " inches");
            System.out.println("Weight: " + Math.round(getWeightPounds()) + " pounds");
            
            if (canTravel) {
                System.out.println("Does travel");
            } else {
                System.out.println("Does not travel");
            }
            
            if (smokes) {
                System.out.println("Does smoke");
            } else {
                System.out.println("Does not smoke");
            }
            
    }
    /**
    * displayModelDetails
    * @returns a sentence describing the name, heigth, weight, traveller, smoker, and hourly rate
    */
    public void displayModelDetails() {
            System.out.println("Name: " + getFirstName() + " " + getLastName());
            System.out.println("Height: " + getHeigthInFeetAndInches());
            System.out.println("Weight: " + Math.round(getWeightPounds()) + " pounds");
            
            if (canTravel) {
                System.out.println("Travels: yep");
            } else {
                System.out.println("Travels: nope");
            }
            
            if (smokes) {
                System.out.println("Smokes: yep");
            } else {
                System.out.println("Smokes: nope");
            }
            
            int hourlyRate = BASE_RATE_DOLLARS_PER_HOUR;
            if (canTravel) {
                hourlyRate += TRAVEL_BONUS_DOLLARS_PER_HOUR;
            } 
            
            if (smokes) {
                hourlyRate -= SMOKER_DEDUCTION_DOLLARS_PER_HOUR;
            }
            
            if(getHeightInches() >= TALL_INCHES && getWeightPounds() <= THIN_POUNDS) {
                hourlyRate += TALL_THIN_BONUS_DOLLARS_PER_HOUR;
            }
           
            System.out.println("Hourly rate: $" + hourlyRate);
    }
    /**
    * displayModelDetails
    * @returns a sentence describing the name, heigth, weight, traveller, smoker, and hourly rate
    * Option of switching weight and height to metric or imperial
       */
    public void displayModelDetails(boolean metricUnits) {
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        if (metricUnits) {
            System.out.println("Height: " + Math.round(getHeightCM()) + " cm");
            System.out.println("Weight: " + Math.round(getWeightKg()) + " kg");
        } else {
            System.out.println("Height: "  + Math.round(getHeightInches()) + " inches");
            System.out.println("Weight: " + Math.round(getWeightPounds()) + " pounds");
        }
        
        if (canTravel) {
            System.out.println("Travels: yep");
        } else {
            System.out.println("Travels: nope");
        }
            
        if (smokes) {
            System.out.println("Smokes: yep");
        } else {
            System.out.println("Smokes: nope");
        }
        
        int hourlyRate = BASE_RATE_DOLLARS_PER_HOUR;
        if (canTravel) {
            hourlyRate += TRAVEL_BONUS_DOLLARS_PER_HOUR;
        } 
            
        if (smokes) {
            hourlyRate -= SMOKER_DEDUCTION_DOLLARS_PER_HOUR;
        }
            
        if(getHeightInches() >= TALL_INCHES && getWeightPounds() <= THIN_POUNDS) {
            hourlyRate += TALL_THIN_BONUS_DOLLARS_PER_HOUR;
        }
            
        System.out.println("Hourly rate: $" + hourlyRate);
    } 
}
