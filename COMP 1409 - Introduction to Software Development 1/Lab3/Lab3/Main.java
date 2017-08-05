
/**
 * Main class relating to Planets.
 *
 * @author Adam Dipinto
 * @version 1.0 May 6th 2017
 */
public class Main
{
    
    /**
       * @return a print out statement of all eight planets information and if they are similar to Earth.
       */
    public static void main (String [] args) {
        Planet mercury = new Planet("Mercury", true, 0.4, 0.055);
        Planet venus = new Planet("Venus", true, 0.7, 0.815);
        Planet earth = new Planet("Earth", true, 1, 1);
        Planet mars = new Planet("Mars", true, 1.5, 0.107);
        Planet jupiter = new Planet("Jupiter", false, 5.2, 2.5);
        Planet saturn = new Planet("Saturn", false, 9.5, 95);
        Planet uranus = new Planet("Uranus", false, 19.2, 14);
        Planet neptune = new Planet("Neptune", false, 30.1, 17);
        
       
       
        System.out.println(mercury.getPlanetaryData());
        System.out.println(mercury.getName() + mercury.isSimilarToEarthOutput());
        
        System.out.println(venus.getPlanetaryData());
        System.out.println(venus.getName() + venus.isSimilarToEarthOutput());
        
        System.out.println(earth.getPlanetaryData());
        System.out.println(earth.getName() + earth.isSimilarToEarthOutput());
        
        System.out.println(mars.getPlanetaryData());
        System.out.println(mars.getName() + mars.isSimilarToEarthOutput());
        
        System.out.println(jupiter.getPlanetaryData());
        System.out.println(jupiter.getName() + jupiter.isSimilarToEarthOutput());
        
        System.out.println(saturn.getPlanetaryData());
        System.out.println(saturn.getName() + saturn.isSimilarToEarthOutput());
        
        System.out.println(uranus.getPlanetaryData());
        System.out.println(uranus.getName() + uranus.isSimilarToEarthOutput());
        
        System.out.println(neptune.getPlanetaryData());
        System.out.println(neptune.getName() + neptune.isSimilarToEarthOutput());
    
         
    }
}
