
/**
 * A class called Planets describing the details about planetary data
 *
 * @author Adam Dipinto
 * @version V1 - May 6th 2017
 */
public class Planet
{
    private String name;
    private boolean innerPlanet;
    private double astronomicalUnitsFromSun;
    private double earthMass;

    /**
     * Constructor for objects of class Planet
     * @pram cName - collects name of planet
     * @pram cInnerPlaner - true or false if planet is an inner planet
     * @pram cAstronomicalUnitsFromSun - the distance of the planet from the sun
     * @pram cEarthMass - the planet's mass in relation to Earth's mass
     */
    public Planet(String cName, boolean cInnerPlanet, double cAstronomicalUnitsFromSun, double cEarthMass)
    {
       if (cName != null) {
           name = cName;
        }
       if (cAstronomicalUnitsFromSun > 0.0) {
           astronomicalUnitsFromSun = cAstronomicalUnitsFromSun;
        } 
       if (cEarthMass > 0) {
           earthMass = cEarthMass;
        } 
    }

    /**
     * getPlanetaryData
     *
     * 
     * @return a sentence confirming if the planet is similar to Earth
     */
    public String getPlanetaryData() {   
        String planetPlacement = "";
        if (earthMass < 1) {
            planetPlacement = " inner planet ";
        }
        if (earthMass > 1) {
            planetPlacement = " outer planet ";
        } 
            return name + " is an" + planetPlacement +", weighs " + earthMass + " Earth masses, and is " + astronomicalUnitsFromSun + " AU from the Sun.";
    }
    /**
     * isSimilarToEarth
     * @return either true or false depending on if the planet is less than 1AU from the sun or weighs less than 15 Earth masses
    */
    public Boolean isSimilarToEarth() {
        boolean similarPlanet = false;
        if (astronomicalUnitsFromSun <= 1 || earthMass <= 15)  {
            similarPlanet =  true;
        } 
        return similarPlanet;
    }
    /**
     *  isSimilarToEarthOutput
       * @return returns a sentence of if the planet is similar or not to Earth based on the isSimiliarToEarth value
       */
    public String isSimilarToEarthOutput(){
        if (!isSimilarToEarth()) {
            return " is not similar to Earth.";
        } else {
            return " is similar to Earth.";
        }
    
    }
    /**
       * Getters 
       * @pram getName - getName returns name
       */
    public String getName() {
        return name;
    }
    /**
     * @pram getInnerPlanet -  returns innerPlanet
       */
    public boolean getInnerPlanet() {
        return innerPlanet;
    }
    /**
      * @pram getAstronomicalUnitsFromSun -  returns astronomicalUnitsFromSun
       */
    public double getAstronomicalUnitsFromSun() {
        return astronomicalUnitsFromSun;
    }
    /**
      * @pram  getEarthMass - returns earthMass
      */
    public double getEarthMass() {
        return earthMass;
    }
  
    /**
       * Setter 
       * @pram setName -  sets name
       */
    public void setName (String sName) {
        name = sName;
    }
    /**
       *@pram setInnerPlanet - sets innerPlanet
        */
    public void setInnerPlanet(boolean sInnerPlanet) {
        innerPlanet = sInnerPlanet;
    }
    /**
       * @pram setAstronomicalUnitsFromSun - sets astronomicalUnitsFromSun
       */
    public void setAstronomicalUnitsFromSun( double sAtronomicalUnitsFromSun) {
        astronomicalUnitsFromSun = sAtronomicalUnitsFromSun;
    }
    /**
       *@pram setEarthMass - sets earthMass
        */
    public void setEarthMass(double sEarthMass) {
        earthMass = sEarthMass;
    }
    
}
