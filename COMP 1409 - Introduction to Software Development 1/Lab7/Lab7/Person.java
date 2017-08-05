
/**
 * This class describes people and their information
 *
 * @author Adam Dipinto
 * @version  V1 June 23 2017
 */
public class Person
{
    private String firstName;
    private String lastName;
    private int birthYear;
    private String sex;
    private double weightLB;
    private String highestEducation;
    
    
    private static final int BIRTH_YEAR = 2016;
    private static final String DEFAULT_SEX = "female";
    private static final String DEFAULT_EDUCATION = "high school";

    /**
     * @param firstName - is the first name
     * @param lastName - is the last name
     * @param birthYear - is the year of birth
     * @param sex - is the sex of the person
     * @param weightLB - is the weight of person in pounds
     * @param highestEducation - is the highest education of the person
     */
    public Person(String firstName, String lastName, int birthYear, String sex, int weightLB, String highestEducation) {
        this.birthYear = birthYear;
        this.weightLB = weightLB;
        if ((firstName.equalsIgnoreCase("jason")) || (lastName.equalsIgnoreCase("harrison")) || firstName.equals("") || firstName.equals(null)) {
            firstName = null;
            lastName = null;
        } else {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        switch (highestEducation){
            case "high school" :
            this.highestEducation = highestEducation;
            break;
            case "undergraduate" :
            this.highestEducation = highestEducation;
            break;
            case "graduate" :
            this.highestEducation = highestEducation;
            break;
            default :
            highestEducation = null;
        }

        switch (sex) {
            case "male" :
            this.sex = sex;
            break;
            case "female" :
            this.sex = sex;
            break;
            default :
            sex = null;
        }

    }

    /**
     * @param firstName - is the first name
     * @param lastName - is the last name
     * @param sex - is the sex of the person
     * @param weightLB - is the weight of person in pounds
     * @param highestEducation - is the highest education of the person 
     */
    public Person (String firstName, String lastName, String sex, int weightLB, String highestEducation) {
        this.weightLB = weightLB;
        birthYear = BIRTH_YEAR;
        if ((firstName.equalsIgnoreCase("jason")) || (lastName.equalsIgnoreCase("harrison")) || firstName.equals("") || firstName.equals(null)) {
            firstName = null;
            lastName = null;
        } else {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        switch (highestEducation){
            case "high school" :
            this.highestEducation = highestEducation;
            break;
            case "undergraduate" :
            this.highestEducation = highestEducation;
            break;
            case "graduate" :
            this.highestEducation = highestEducation;
            break;
            default :
            highestEducation = null;
        }

        switch (sex) {
            case "male" :
            this.sex = sex;
            break;
            case "female" :
            this.sex = sex;
            break;
            default :
            sex = null;
        }
    }

    /**
     * @param firstName - is the first name
     * @param lastName - is the last name
     * @param weightLB - is the weight of person in pounds
     */
    public Person (String firstName, String lastName, int weightLB) {
        birthYear = BIRTH_YEAR;
        sex = DEFAULT_SEX;
        highestEducation = DEFAULT_EDUCATION;
        this.weightLB = weightLB;
        if ((firstName.equalsIgnoreCase("jason")) || (lastName.equalsIgnoreCase("harrison")) || firstName.equals("") || firstName.equals(null)) {
            firstName = null;
            lastName = null;
        } else {
            this.firstName = firstName;
            this.lastName = lastName;
        }

    }

    /**
     *@param name - is the name of the person
     *@return postMethod returns the capitalized name
     */
    private String capitalize (String name) {
        if ( name == null) {
            return null;
        }
        String preMethod = name.substring(0,1).toUpperCase();
        String postMethod = preMethod + name.substring(1).toLowerCase();

        return postMethod;
    }

    /**
     *@param doubleKG - converts the weight from lb to KG
     *@return the converted weight
     */
    private double getWeightKG(double KG) {
        KG = weightLB * 0.453592;
        return (double)Math.round(KG);
    }

    /**
     * @param printDetails prints out the information of the person
     */
    public void printDetails() {
        String heOrShe = "he";
        if (sex == "female") {
            heOrShe = "she";
        }
        
        String aOrAn = "a";
        if (highestEducation == "undergraduate") {
            aOrAn = "an";
        }
        System.out.println(capitalize(firstName) + " " + capitalize(lastName) + " was born in " + birthYear + ". " + capitalize(heOrShe) + " " + "weighs " + weightLB + " pounds" + " and " + heOrShe + " has " + aOrAn + " " + highestEducation + " degree");  
    }

    /**
     *@param prinTDetails(boolean kilograms) prints out the information of person in  pounds or kilograms 
     */
    public void prinTDetails(boolean kilograms) {
        String heOrShe = "he";
        if (sex == "female") {
            heOrShe = "she";
        }
        
        String aOrAn = "a";
        if (highestEducation == "undergraduate") {
            aOrAn = "an";
        }
        
        if (kilograms){
            System.out.println(capitalize(firstName) + " " + capitalize(lastName) + " was born in " + birthYear + ". " + capitalize(heOrShe) + " " + "weighs " + getWeightKG(weightLB) + " kilograms" + " and " + heOrShe + " has " + aOrAn + " " + highestEducation + " degree");
        } else {
            System.out.println(capitalize(firstName) + " " + capitalize(lastName) + " was born in " + birthYear + ". " + capitalize(heOrShe) + " " + "weighs " + weightLB + " pounds" + " and " + heOrShe + " has " + aOrAn + " " + highestEducation + " degree");
        }
    }

    /**
     *@param printDetails (boolean uppercase) prints out the information of the person and either capitalizes all the letters of the name or puts them as lowercase
     */
    public void printDetails(boolean uppercase) {
        String heOrShe = "he";
        if (sex == "female") {
            heOrShe = "she";
        }
        
        String aOrAn = "a";
        if (highestEducation == "undergraduate") {
            aOrAn = "an";
        }
        
        if (uppercase){
            System.out.println(firstName.toUpperCase() + " " + lastName.toUpperCase() + " was born in " + birthYear + ". " + capitalize(heOrShe) + " weighs " + weightLB + " pounds" + " and " + heOrShe + " has " + aOrAn + " " + highestEducation + " degree");  
        } else {
            System.out.println(firstName.toLowerCase() + " " + lastName.toLowerCase() + " was born in " + birthYear + ". " + capitalize(heOrShe) + " weighs " + weightLB + " pounds" + " and " + heOrShe + " has " + aOrAn + " " + highestEducation + " degree");  
        }
    }
    
    
    /**
     * @param sFirstName - sets the first name of the person
     */
    public void setFirstName(String sFirstName) {
        this.weightLB = weightLB;
        birthYear = BIRTH_YEAR;
        if ((firstName.equalsIgnoreCase("jason")) || (lastName.equalsIgnoreCase("harrison")) || firstName.equals("") || firstName.equals(null))  {
            firstName = null;
            lastName = null;
        } else {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        firstName = sFirstName;
    }

    /**
     *@param sLastName - sets the last name of the person 
     */
    public void setLastName(String sLastName) {
        this.weightLB = weightLB;
        birthYear = BIRTH_YEAR;
        if ((firstName.equalsIgnoreCase("jason")) || (lastName.equalsIgnoreCase("harrison")) || firstName.equals("") || firstName.equals(null)) {
            firstName = null;
            lastName = null;
        } else {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        lastName = sLastName;
    }

    /**
     * @param sBirthYear - sets the birth year of the person
     */
    public void setBirthYear(int sBirthYear) {
        birthYear = sBirthYear;
    }

    /**
     * @param sSex - sets the sex of the person 
     */
    public void setSex(String sSex) {
         switch (highestEducation){
            case "high school" :
            this.highestEducation = highestEducation;
            break;
            case "undergraduate" :
            this.highestEducation = highestEducation;
            break;
            case "graduate" :
            this.highestEducation = highestEducation;
            break;
            default :
            highestEducation = null;
        }

        switch (sex) {
            case "male" :
            this.sex = sex;
            break;
            case "female" :
            this.sex = sex;
            break;
            default :
            sex = null;
        }

        sex = sSex;
    }

    /**
     * @param sWeightLB - sets the weight of the person
     */
    public void setWeightLB(double sWeightLB) {
        weightLB = sWeightLB;
    }
    
    /**
     * @param sHighestEducation - sets the education of the person
     */
    public void setHighestEducation(String sHighestEducation) {
         switch (highestEducation){
            case "high school" :
            this.highestEducation = highestEducation;
            break;
            case "undergraduate" :
            this.highestEducation = highestEducation;
            break;
            case "graduate" :
            this.highestEducation = highestEducation;
            break;
            default :
            highestEducation = null;
        }

        switch (sex) {
            case "male" :
            this.sex = sex;
            break;
            case "female" :
            this.sex = sex;
            break;
            default :
            sex = null;
        }

        highestEducation = sHighestEducation;
    }
    
    
}
