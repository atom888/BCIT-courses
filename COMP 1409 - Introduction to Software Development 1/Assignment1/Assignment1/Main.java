
/**
 * Main class relating to Boats.
 *
 * @author Adam Dipinto
 * @version 2.0 May 20th 2017
 */
public class Main
{
    
    /**
       * @return a print out statement for six different boats.
       */
    public static void main (String [] args) {
        Boat bayliner = new Boat(2015, "160", 100.0, "Bayliner", false);
        Boat baja = new Boat(1972, "Outlaw 23", 320.5, "Baja", true);
        Boat lowe = new Boat(1973, "FM1710", 92.2, "Lower", false);
        Boat starCraft = new Boat(1999, "Crossover 231", 157.6, "StarCraft", false);
        Boat yamaha = new Boat(2010, "242 E-Series", 198.4, "Yamaha", false);
        Boat seaDo = new Boat(1985, "Speedster 200", 258.7, "Sea-Do", true);
       
        bayliner.getBoatDetails();
        baja.getBoatDetails();
        lowe.getBoatDetails();
        starCraft.getBoatDetails();
        yamaha.getBoatDetails();
        seaDo.getBoatDetails();
    }
}
