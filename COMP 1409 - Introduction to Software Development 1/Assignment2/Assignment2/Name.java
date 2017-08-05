
/**
 * The Name class will provide information relating first, middle, last, and A Non Ymous names.
 *
 * @author Adam Dipinto
 * @version V1.0 June5 2017
 */
public class Name
{
    public String first;
    public String last;
    public String middle;
    
    private final static int MINIMUM_NAME_LENGTH = 1;
    private final static int MAXIMUM_NAME_LENGTH = 40;

    /**
     * Default constructor for objects of class Name
     */
    public Name()
    {
        first = "A.";
        middle = "Non";
        last = "Ymous";
    }
    
    /**
     * Name Constructor for objects of the class Name
     * @param newFirst - value must be between 1 and 40 characters and not null
     * @param newLast - value must be between 1 and 40 characters and not null
     * @param newMiddle - value must be between 1 and 40 characters and not null
    */
    public Name(String newFirst, String newLast, String newMiddle)
    {
        if (newFirst != null && (newFirst.length() >= MINIMUM_NAME_LENGTH && newFirst.length() <= MAXIMUM_NAME_LENGTH)) {
            first = newFirst;
        } 

        if (newMiddle != null && (newMiddle.length() >= MINIMUM_NAME_LENGTH && newMiddle.length() <= MAXIMUM_NAME_LENGTH)) {
            middle = newMiddle;
        } else if (newMiddle == null) {
            middle = null;
        } 

        if (newLast != null && (newLast.length() >= MINIMUM_NAME_LENGTH && newLast.length() <= MAXIMUM_NAME_LENGTH)) {
            last = newLast;
        } 
        
        if (newLast == null || newFirst == null) {
            first = "A.";
            middle = "Non";
            last = "Ymous";
        }
        
        if ((newFirst != null && newLast != null) && (newFirst.length() < MINIMUM_NAME_LENGTH || newLast.length() > MAXIMUM_NAME_LENGTH )) {
            first = "A.";
            middle = "Non";
            last = "Ymous";
        }
        
        if ((newMiddle != null) && (newMiddle.length() < MINIMUM_NAME_LENGTH || newMiddle.length() > MAXIMUM_NAME_LENGTH )) {
            first = "A.";
            middle = "Non";
            last = "Ymous";
        }

        if ((newFirst != null && newLast != null) && (newFirst.length() > MAXIMUM_NAME_LENGTH || newLast.length() > MAXIMUM_NAME_LENGTH)) {
            first = "A.";
            middle = "Non";
            last = "Ymous";
        }
            
       
    }
    
    /**
     * @return makePrettyName - returns a normalized representation of the first, middle, and last name 
    */
    private String makePrettyName()
    {
        String normalizedFirst = (first.toLowerCase()).substring(0,1).toUpperCase() + (first.toLowerCase()).substring(1);
        String normalizedLast = (last.toLowerCase()).substring(0,1).toUpperCase() + (last.toLowerCase()).substring(1);
        
        if (middle != null) {
            String normalizedMiddle = (middle.toLowerCase()).substring(0,1).toUpperCase() + (middle.toLowerCase()).substring(1);
            return normalizedFirst + " " + normalizedMiddle + " " + normalizedLast;
        } else {
            return normalizedFirst + " " + normalizedLast;
        }        
        
    }
    /**
     * @return getInitials - returns a normalized representation of the initials of the first, middle, and last name
    */
    
    public String getInitials() {
        String normalizedFirst = (first.toLowerCase()).substring(0,1).toUpperCase();
        String normalizedLast = (last.toLowerCase()).substring(0,1).toUpperCase();
        
        if (middle != null) {
            String normalizedMiddle = (middle.toLowerCase()).substring(0,1).toUpperCase();
            return normalizedFirst + "." + normalizedMiddle + "." + normalizedLast + ".";
        } else {
            return normalizedFirst + "." + normalizedLast  + ".";
        } 
       
    }
    /**
     * @return getFullName - returns the normalized version of the name provided
    */
    public String getFullName() {
        return makePrettyName();
    }
    /**
     * @return getFirstName - returns first name
    */
    public String getFirstName() {
        String normalizedFirst = (first.toLowerCase()).substring(0,1).toUpperCase() + (first.toLowerCase()).substring(1);
        return normalizedFirst;
    }
    /**
     * @return getMiddleName - returns middle name
    */
    public String getMiddleName() {
        if (middle != null) {
           String normalizedMiddle = (middle.toLowerCase()).substring(0,1).toUpperCase() + (middle.toLowerCase()).substring(1);
           return normalizedMiddle;
        } else {
            return null;
        }
        
    }
    /**
     * @return getLastName - returns last name
    */
    public String getLastName() {
        String normalizedLast = (last.toLowerCase()).substring(0,1).toUpperCase() + (last.toLowerCase()).substring(1);
        return normalizedLast;
    }
    /**
     * @param sFirst - sets the first name
    */
    public void setFirstName(String sFirst) {
        first = sFirst;
    }
    /**
     * @param sLast - sets the last name
    */
    public void setLastName(String sLast) {
        last = sLast;
    }
    /**
     * @param sMiddle - sets the middle name
    */
    public void setMiddleName(String sMiddle) {
        middle = sMiddle;
    }
    
    
}
