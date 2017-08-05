
/**
 * This Boat class will provide information relating Body Type, Model Year, Model Name, Horsepower, Manufacturer, and Engine Type.
 *
 * @author Adam Dipinto
 * @version V3.0 - May 25 2017
 */


public class Boat
{
    
    private static final String BODYTYPE = "powerboat";
    private static final int CURRENT_YEAR = 2017;
    private static final int MIN_MODEL_YEAR = 1973;
    private static final int EMPTY_MODEL_YEAR = 0;
    private static final double EMPTY_HORSEPOWER = 0.0;
    private static final int MIN_HORSEPOWER = 50;
    private static final int MAX_HORSEPOWER = 390;
    private int modelYear;
    private String modelName;
    private double horsepower;
    private String manufacturer;
    private boolean isTwinEngine;
    private static String webpage = "http://www.Boat.com/specs/";

    /**
     * Default constructor for objects of class Boat
     */
    public Boat() {}
    
    /**
     * Constructor for objects of class Boat
     * @param newModelYear - value must be later than 1973
     * @param newModelName - value must be a valid string
     * @param newHorsepower - value must be between the range of 50 and 390
     * @param new Manufacturer - value must be a valid string
     * @param newIsTwinEngine - value must be true or false 
     */
    public Boat(int newModelYear, String newModelName, double newHorsepower, String newManufacturer, boolean newIsTwinEngine) {
        
        if (newModelYear < MIN_MODEL_YEAR && newModelYear > EMPTY_MODEL_YEAR) {
            System.out.println( newModelYear + " is too early, sorry");
        } else if (newModelYear > CURRENT_YEAR) {
            System.out.println( newModelYear + " is too late, sorry");
        } else if (newModelYear >= MIN_MODEL_YEAR && newModelYear <= CURRENT_YEAR) {
            modelYear = newModelYear;
        }
        
        
        if (newHorsepower < MIN_HORSEPOWER && newHorsepower > EMPTY_HORSEPOWER) {
            System.out.println( newHorsepower + " is too little, sorry");
        } else if (newHorsepower > MAX_HORSEPOWER) {
            System.out.println( newHorsepower + " is too much, sorry");
        } else if (newHorsepower >= MIN_HORSEPOWER && newHorsepower <= MAX_HORSEPOWER) {
            horsepower = newHorsepower;
        }
       
        
        if (newModelName == "" || newModelName == null ||newModelName.length() == 0) {
            System.out.println("a model name was not provided, sorry");
        } else if (newModelName != null) {
            modelName = newModelName;
        }
        
        
        if (newManufacturer == "" || newManufacturer == null || newManufacturer.length() == 0) {
            System.out.println("a manufacturer name was not provided, sorry");
        } else if (newManufacturer != null) {
            manufacturer = newManufacturer;
        }
        
      
        if(newIsTwinEngine) {
            isTwinEngine = newIsTwinEngine;
        }
    
    }
    /**
    * Setters
    * @param setModelYear - sets the model year
    */
   public void setModelYear (int newModelYear) {
       if (newModelYear < MIN_MODEL_YEAR && newModelYear > EMPTY_MODEL_YEAR) {
            System.out.println( newModelYear + " is too early, sorry");
        } else if (newModelYear > CURRENT_YEAR) {
            System.out.println( newModelYear + " is too late, sorry");
        } else if (newModelYear >= MIN_MODEL_YEAR && newModelYear <= CURRENT_YEAR) {
            modelYear = newModelYear;
        }
    }
   /**
   *@param setModelName - sets the model name
   */
   public void setModelName (String newModelName) {
       if (newModelName == "" || newModelName == null ||newModelName.length() == 0) {
            System.out.println("a model name was not provided, sorry");
        } else if (newModelName != null) {
            modelName = newModelName;
        }
    } 
   /**
   *@param setManufacturer - sets the manufacturer
   */ 
   public void setManufacturer (String newManufacturer) {
       if (newManufacturer == "" || newManufacturer == null || newManufacturer.length() == 0) {
            System.out.println("a manufacturer name was not provided, sorry");
        } else if (newManufacturer != null) {
            manufacturer = newManufacturer;
        }
    }
   /**
   *@param setHorsepower - sets the horsepower
   */ 
   public void setHorsepower (double newHorsepower) {
       if (newHorsepower < MIN_HORSEPOWER && newHorsepower > EMPTY_HORSEPOWER) {
            System.out.println( newHorsepower + " is too little, sorry");
        } else if (newHorsepower > MAX_HORSEPOWER) {
            System.out.println( newHorsepower + " is too much, sorry");
        } else if (newHorsepower >= MIN_HORSEPOWER && newHorsepower <= MAX_HORSEPOWER) {
            horsepower = newHorsepower;
        }
    } 
   /**
   *@param setTwinEngine - sets the twin engine value
   */ 
   public void setTwinEngine (boolean sIsTwinEngine) {
       isTwinEngine = sIsTwinEngine;
    }
   /**
   *@param setWebpage - sets the webpage
   */
   public void setWebpage (String sWebpage) {
       webpage = sWebpage;
    }
   /**
   * GETTERS
   * @return getModelYear - returns model year
   */ 
   public int getModelYear() {
       return modelYear;
    }
   /**
   *@return getModelName - returns model name
   */
   public String getModelName() {
       return modelName;
    }
   /**
   *@return getHorsepower - returns horsepower
   */
   public double getHorsepower() {
       return horsepower;
    }
   /**
   *@return getManufacturer - returns manufacturer
   */ 
   public String getManufacturer() {
       return manufacturer;
    }
   /**
   *@return getIsTwinEngine - returns value for twin engine
   */ 
   public boolean getIsTwinEngine() {
       return isTwinEngine;
    }
   /**
   *@return getwebpage - returns webpage address
   */ 
   public static String getWebpage() {
       return webpage;
    }
   /**
   *@return getBdoyType - returns body type
   */ 
   public static String getBodyType() {
       return BODYTYPE;
    }
    /**
     * Methods
     * @return isTwinEngine - returns a string based on if it is a twin engine or not
     */
    
    public String isTwinEngine() {
        if (isTwinEngine) {
            return "has Twin-engine";
        } else {
            return "does not have a twin-engine";
        }
    }
    
    /**
    *@return - display a full sentence relating to the boat information provided.
    */
    public void getBoatDetails() {
       if (horsepower == EMPTY_HORSEPOWER) {
           System.out.println("Sorry. There is an error with this boat's horsepower.");
       } else if (modelYear == EMPTY_MODEL_YEAR || modelYear < MIN_MODEL_YEAR && modelYear > EMPTY_MODEL_YEAR) {
           System.out.println("Sorry. There is an error with this boat's model year.");
       } else if (modelName == null || modelName == "" ||modelName.length() == 0) {
            System.out.println("Sorry. There is an error with this boat's model name.");
       } else if (manufacturer == null || manufacturer == "" || manufacturer.length() == 0) {
           System.out.println("Sorry. There is an error with this boat's manufacturer.");
       } else {
           System.out.println("This " + BODYTYPE + " is a " + modelYear + " " + modelName + " with " + horsepower + "hp and " + isTwinEngine() + ". " + "It is manufactured by " + manufacturer + " and you can read more at ");
           System.out.println(webpage);
        }
    }
}
