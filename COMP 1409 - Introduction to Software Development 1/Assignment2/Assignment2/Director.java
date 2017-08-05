
/**
 * This Director class will provide information relating to the name, date born, date of death, and pseudoynmfor the director provided
 *
 * @author Adam Dipinto
 * @version V1.0 June 6 2017
 */
public class Director
{
    public Name name;
    private Date born;
    private Date died;
    private Name pseudonym;
    private static final int CURRENT_YEAR = 2017;
    

    /**
     * Default constructor for objects of class Director
     */
    public Director()
    {
        name = new Name();
        born = new Date();
        died = new Date();
        pseudonym = new Name();
        
    }
    
    /**
     * @param firstName - sets the value of the first name if pseudonym is not null
     * @param lastName - sets the value of the last name if pseudonym is not null
     * @param middleName - sets the value of the middle name if pseudonym is not null
     * @param yearBorn - sets the year the director was born
     * @param monthBorn - sets the month the director was born
     * @param dayBorn - sets the day the director was born
     * @param yearDied - sets the year the director died
     * @param monthDied - sets the month the director died
     * @param dayDied - sets the day the director died
     * @param pseudonymFirstName - sets the value of the first name for pseudonym
     * @param pseudonymMiddleName - sets the value of the middle name for pseudonym
     * @param pseudonymLastName - sets the value of the last name for pseudonym
    */
    public Director(String firstName, String lastName, String middleName, int yearBorn, int monthBorn, int dayBorn, int yearDied, int monthDied, int dayDied, String pseudonymFirstName, String pseudonymLastName, String pseudonymMiddleName)
    {
        name = new Name(firstName,lastName, middleName);
        born = new Date(yearBorn,monthBorn,dayBorn);
        died = new Date(yearDied, monthDied, dayDied);
        pseudonym = new Name(pseudonymFirstName,pseudonymLastName,pseudonymMiddleName);
       
    }
    
    /**
     * @param newName - sets name if not null
     * @param newBorn - sets born date if not null
     * @param newDied - sets date of death to value provided
     * @param newPseudonym - sets pseudonym name to value provided
    */
    public Director(Name newName, Date newBorn, Date newDied, Name newPseudonym)
    {
        if (newName != null) {
            name = newName;
        } else {
            name = new Name();
        }
        
        if (newBorn != null) {
            born = newBorn;
        } else {
            born = new Date();
        }
        
        if (newName == null || newBorn == null) {
            name = new Name();
            born = new Date();
        }
        
        died = newDied;
        pseudonym = newPseudonym;
    }
    
    
    /**
     * @param newName - sets name if not null;
     * @param newBorn - sets born date if not null;
     * @param newDied - sets date of death;
    */
    public Director(Name newName, Date newBorn, Date newDied)
    {
        if (newName != null) {
            name = newName;
        }
        
        if (newBorn != null) {
            born = newBorn;
        }
       
        if ((newName == null) || (newBorn == null)) {
            name = new Name();
            born = new Date();
        }
        
        died = newDied;
        pseudonym = null;
    }
    /**
     * @return isDirectorAlive - returns true if value is null and false otherwise
    */
    public boolean isDirectorAlive()
    {
        if (died.equals(null)) {
            return true;
        } else {
            return false;
        }
    }
    /**
     * @return getAgeYearsOfDirector - returns the age of the director 
    */
    public int getAgeYearsOfDirector() {
        return (CURRENT_YEAR - born.year);
    }
    /**
     * @return getDirectorFullName - returns the name of the director 
    */
    public String getDirectorFullName() {
        return name.first + " " + name.middle + " " + name.last;
    }
    /**
     * @return getDateBorn - returns the date the director was born 
    */
    public Date getDateBorn() {
        return born;
    }
    /**
     * @return getDateDied - returns the date the director died 
    */
    public Date getDateDied() {
        return died;
    }
    /**
     * @return getPseudonym - returns the pseudonym of the director 
    */
    public Name getPseudonym() {
        return pseudonym;
    }
    /**
     * @return getName - returns the name of the director
    */
    public Name getName() {
        return name;
    }
    /**
     * @param newBorn - sets the date of birth
    */
    public void setDateBorn(Date newBorn) {
        born = newBorn;
    }
    /**
     * @param newDied - sets the date of death
    */
    public void setDateDied(Date newDied) {
        died = newDied;
    }
    /**
     * @param newPseudonym - sets the pseudonym of the director
    */
    public void setPseudonym(Name newPseudonym) {
        pseudonym = newPseudonym; 
    }
    /**
     * @param newName - sets the full name of the director
    */
    public void setName(Name newName) {
        name = newName;
    }
}

