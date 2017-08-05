
/**
 * Write a description of class Person here.
 *
 * @author Adam Dipinto
 * @version V1.0 May 20 2017
 */
public class Person
{
    private String firstName;
    private String lastName;
    private int birthYear;
    private String sex;
    private int weightPounds;
    private double weightKilograms;
    private String educationLevel;
    private boolean overdraftOne;
    private boolean overdraftTwo;
    private boolean overdraftThree;

    /**
     * Constructor for objects of class Person
     */
    public Person(String cFirstName, String cLastName, int cBirthYear, String cSex, int cWeightPounds, String cEducationLevel)
    {
        if (cFirstName == null || cFirstName == "" || cFirstName.length() == 0) {
            System.out.println("Sorry, the response you provided is not valid.");
        } else if (cFirstName != null) {
            firstName = cFirstName;
        }
        
        if (cLastName == null || cLastName == "" || cLastName.length() == 0) {
            System.out.println("Sorry, the response you provided is not valid.");
        } else if (cLastName != null) {
            lastName = cLastName;
        }
        
        if (cBirthYear <= 0) {
            System.out.println("Sorry, the response you provided is not valid.");
        } else if (cBirthYear > 0) {
            birthYear = cBirthYear;
        }
        
        if (cWeightPounds <= 0) {
            System.out.println("Sorry, the response you provided is not valid.");
        } else if (cWeightPounds > 0) {
            weightPounds = cWeightPounds;  
        }
        
        switch(cEducationLevel) {
            case "high school":
                educationLevel = cEducationLevel;
                break;
            case "undergraduate":
                educationLevel = cEducationLevel;
                break;
            case "graduate":
                educationLevel = cEducationLevel;
                break;
            default:
                System.out.println("Please pick either high school, undergraduate, or graduate");
                break;
        }
        switch(cSex) {
            case "male":
                sex = cSex;
                break;
            case "female":
                sex = cSex;
                break;
            default:
                System.out.println("Please pick either male or female");
                break;
        }
    }
    /**
     * Constructor for objects of class Person
     */
    public Person(String cFirstName, String cLastName, int cBirthYear, String cSex, String cEducationLevel) {
        if (cFirstName == null || cFirstName == "" || cFirstName.length() == 0) {
            System.out.println("Sorry, the response you provided is not valid.");
        } else if (cFirstName != null) {
            firstName = cFirstName;
        }
        
        if (cLastName == null || cLastName == "" || cLastName.length() == 0) {
            System.out.println("Sorry, the response you provided is not valid.");
        } else if (cLastName != null) {
            lastName = cLastName;
        }
        
        if (cBirthYear <= 0) {
            System.out.println("Sorry, the response you provided is not valid.");
        } else if (cBirthYear > 0) {
            birthYear = cBirthYear;
        }
        
        switch(cEducationLevel) {
            case "high school":
                educationLevel = cEducationLevel;
                break;
            case "undergraduate":
                educationLevel = cEducationLevel;
                break;
            case "graduate":
                educationLevel = cEducationLevel;
                break;
            default:
                System.out.println("Please pick either high school, undergraduate, or graduate");
                break;
        }
        switch(cSex) {
            case "male":
                sex = cSex;
                break;
            case "female":
                sex = cSex;
                break;
            default:
                System.out.println("Please pick either male or female");
                break;
        }
        
        birthYear = 2017;
    }
    /**
     * Constructor for objects of class Person
     */
    public Person(int newBirthYear, String newSex, String newEducationLevel) {
        birthYear = 2017;
        sex = "female";
        educationLevel = "high school";
    }
    
    /**
     * printDetails
     * @returns sentence providing detail about the person
     */
    public String printDetails() {
        String genderPronoun;
        String educationPrefix;
        if (sex.equals("male")) {
            genderPronoun = "he";
        } else {
            genderPronoun = "she";
        }
        
        if (educationLevel.equals("undergraduate")) {
            educationPrefix = "an";
        } else {
            educationPrefix = "a";
        }
        
        return firstName + " " + lastName + " was born in " + birthYear + ". " + genderPronoun.substring(0,1).toUpperCase() + genderPronoun.substring(1).toLowerCase() + " weighs " + weightPounds + " pounds and " + genderPronoun + " has " + educationPrefix + " " + educationLevel + " degree.";
    } 
    /**
     * printDetails
     * @returns sentence providing detail about the person - can provide weight in kilograms 
     */
    public String printDetails(boolean kilograms) {
        String genderPronoun;
        String educationPrefix;
        if (sex.equals("male")) {
            genderPronoun = "he";
        } else {
            genderPronoun = "she";
        }
        if (educationLevel.equals("undergraduate")) {
            educationPrefix = "an";
        } else {
            educationPrefix = "a";
        }
        
        
        if (kilograms) {
           weightKilograms = java.lang.Math.round((weightPounds * .453) * 10.0) / 10.0;
           return firstName + " " + lastName + " was born in " + birthYear + ". " + genderPronoun.substring(0,1).toUpperCase() + genderPronoun.substring(1).toLowerCase() + " weighs " + weightKilograms + " kilograms and " + genderPronoun + " has " + educationPrefix + " " + educationLevel + " degree."; 
        } else {
        return firstName + " " + lastName + " was born in " + birthYear + ". " + genderPronoun.substring(0,1).toUpperCase() + genderPronoun.substring(1).toLowerCase() + " weighs " + weightPounds + " pounds and " + genderPronoun + " has " + educationPrefix + " " + educationLevel + " degree.";
        }
    }
    /**
     * printDetails
     *@returns sentence providing detail about the person - can provide weight in kilograms and name in upper case
     */
    public String printDetails(boolean kilograms, boolean uppercase) {
        String genderPronoun;
        String educationPrefix;
        if (sex.equals("male")) {
            genderPronoun = "he";
        } else {
            genderPronoun = "she";
        }
        if (educationLevel.equals("undergraduate")) {
            educationPrefix = "an";
        } else {
            educationPrefix = "a";
        }
        
        if (kilograms) {
            weightKilograms = java.lang.Math.round((weightPounds * .453) * 10) / 10.0;
        }
       
        if (kilograms) {
            if (uppercase) {
               return firstName.toUpperCase() + " " + lastName.toUpperCase() + " was born in " + birthYear + ". " + genderPronoun.substring(0,1).toUpperCase() + genderPronoun.substring(1).toLowerCase() + " weighs " + weightKilograms + " kilograms and " + genderPronoun + " has " + educationPrefix + " " + educationLevel + " degree.";
            } else {
               return firstName.toLowerCase() + " " + lastName.toLowerCase() + " was born in " + birthYear + ". " + genderPronoun.substring(0,1).toUpperCase() + genderPronoun.substring(1).toLowerCase() + " weighs " + weightKilograms + " kilograms and " + genderPronoun + " has " + educationPrefix + " " + educationLevel + " degree.";
            } 
        } else if (uppercase) {
          return firstName.toUpperCase() + " " + lastName.toUpperCase() + " was born in " + birthYear + ". " + genderPronoun.substring(0,1).toUpperCase() + genderPronoun.substring(1).toLowerCase() + " weighs " + weightPounds + " pounds and " + genderPronoun + " has " + educationPrefix + " " +educationLevel + " degree.";
        } else {
          return firstName.toLowerCase() + " " + lastName.toLowerCase() + " was born in " + birthYear + ". " + genderPronoun.substring(0,1).toUpperCase() + genderPronoun.substring(1).toLowerCase() + " weighs " + weightPounds + " pounds and " + genderPronoun + " has " + educationPrefix + " " + educationLevel + " degree.";
        }
    }
    
    /**
     * Getters
     */
    /**
    * @params getFirstName - returns first name
    */
    public String getFirstName() {
        return firstName;
    }
    /**
    * @params getLastName - returns last name
    */
    public String getLastName() {
        return lastName;
    }
    /**
    * @params getBirthYear - returns birth year
    */
    public int getBirthYear() {
        return birthYear;
    }
    /**
    * @params getWeightPounds - returns weight in pounds
    */
    public int getWeightPounds() {
        return weightPounds;
    }
    /**
    * @params getEducationLevel - returns education level
    */
    public String getEducationLevel() {
        return educationLevel;
    }
    /**
    * @params getSex - returns gender type
    */
    public String getSex() {
        return sex;
    }
    
    /**
     * Setters
     */
    /**
    * @params setFirstName - sets a new first name
    */
    public void setFirstName (String newFirstName) {
        firstName = newFirstName;
    }
    /**
    * @params setLastName - sets a new last name
    */
    public void setLastName (String newLastName) {
        lastName = newLastName;
    }
    /**
    * @params setBirhtYear - sets a new birth year
    */
    public void setBirthYear (int newBirthYear) {
        birthYear = newBirthYear;
    }
    /**
    * @params setWeightPounds - sets a new weight in pounds
    */
    public void setWeightPounds(int newWeightPounds) {
        weightPounds = newWeightPounds;
    }
    /**
    * @params setSex - sets a new gender
    */
    public void setSex (String newSex) {
        sex = newSex;
    }
    /**
    * @params setEducationLevel - sets a education level
    */
    public void setEducationLevel (String newEducationLevel) {
        educationLevel = newEducationLevel;
    }
  

    
}
