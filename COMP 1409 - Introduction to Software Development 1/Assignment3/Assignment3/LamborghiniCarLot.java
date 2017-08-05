
/**
 * Write a description of class LamborghiniCarLot here.
 *
 * @author Adam Dipinto
 * @version V1 - July 15 2017
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

public class LamborghiniCarLot
{
    private String lotName;
    private ArrayList<Lamborghini> inventory;
    
    private final int NO_VALUE = 0;
    private final int CURRENT_YEAR = 2017;
    private final int MAX_ARRAY = 100;
    private final int MAX_HP = 666;
    private String TAYLOR = "Taylor's Used Lambos";
    private String JASON = "Jason's USed Lambos";

    /**
     * Default Constructor for class LamborghiniCarLot
     */
    public LamborghiniCarLot()
    {
        inventory = new ArrayList<Lamborghini>();
    }
    
    /**
     * Constructor for class LamborghiniCarLot
     * @param lotName  name of the lot
     */
    public LamborghiniCarLot(String lotName)
    {
        if (lotName != null) {
            if (lotName.equals(TAYLOR)) {
                lotName = JASON;
            }
            else {
                lotName = lotName;
            }
        }
        
        inventory = new ArrayList<Lamborghini>();
        inventory.add(new Lamborghini(1965, "350GT", 365.3, true));
        inventory.add(new Lamborghini(1966, "400GT 2+2", 366.3, false));
        inventory.add(new Lamborghini(1967, "MIURA", 367.3, true));
        inventory.add(new Lamborghini(1968, "espada", 368.3, false));
        inventory.add(new Lamborghini(1969, "islero", 369.3, true));
        inventory.add(new Lamborghini(1970, "jarama", 370.3, false));
        inventory.add(new Lamborghini(1971, "urraco", 371.3, false));
        inventory.add(new Lamborghini(1971, "urraco", 371.3, false));
        inventory.add(new Lamborghini(1973, "countache", 373.3, false));
        inventory.add(new Lamborghini(1974, "silhouette", 374.3, false));
        inventory.add(new Lamborghini(1975, "jalpa", 375.3, true));
        inventory.add(new Lamborghini(1976, "silhouette", 476.3, false));
        inventory.add(new Lamborghini(1977, "silhouette", 377.3, true));
        inventory.add(new Lamborghini(1978, "countache", 478.3, false));
        inventory.add(new Lamborghini(1978, "countache", 578.3, false));
        inventory.add(new Lamborghini(1978, "countache", 378.3, true));
        inventory.add(new Lamborghini(1979, "silhouette", 479.3, false));
        inventory.add(new Lamborghini(1980, "countache", 580.3, false));
        inventory.add(new Lamborghini(1981, "jalpa", 381.3, true));
        inventory.add(new Lamborghini(1981, "jalpa", 481.3, true));
        inventory.add(new Lamborghini(1982, "countache", 582.3, true));
        inventory.add(new Lamborghini(1983, "countache", 383.3, false));
        inventory.add(new Lamborghini(1984, "countache", 484.3, false));
        inventory.add(new Lamborghini(1985, "countache", 585.3, false));
        inventory.add(new Lamborghini(1986, "lm002", 386.3, true));
        inventory.add(new Lamborghini(1987, "jalpa", 487.3, false));
        inventory.add(new Lamborghini(1988, "countache", 588.3, false));
        inventory.add(new Lamborghini(1989, "countache", 389.3, true));
        inventory.add(new Lamborghini(1990, "diablo", 490.3, false));
        inventory.add(new Lamborghini(1991, "lm002", 591.3, false));
        inventory.add(new Lamborghini(1991, "lm002", 391.3, true));
        inventory.add(new Lamborghini(1991, "lm002", 491.3, false));
        inventory.add(new Lamborghini(1991, "lm002", 591.3, true));
        inventory.add(new Lamborghini(1992, "lm002", 392.3, false));
        inventory.add(new Lamborghini(1993, "lm002", 493.3, false));
        inventory.add(new Lamborghini(1994, "diablo", 594.3, false));
        inventory.add(new Lamborghini(1994, "diablo", 394.3, true));
        inventory.add(new Lamborghini(1995, "diablo", 495.3, false));
        inventory.add(new Lamborghini(1996, "diablo", 596.3, false));
        inventory.add(new Lamborghini(1997, "diablo", 397.3, false));
        inventory.add(new Lamborghini(1998, "diablo", 498.3, false));
        inventory.add(new Lamborghini(1999, "diablo", 599.3, false));
        inventory.add(new Lamborghini(1999, "diablo", 599.3, false));
        inventory.add(new Lamborghini(2000, "diablo", 400.3, false));
        inventory.add(new Lamborghini(2000, "diablo", 500.3, false));
        inventory.add(new Lamborghini(2001, "murcielago", 501.3, false));
        inventory.add(new Lamborghini(2002, "murcielago", 502.3, false));
        inventory.add(new Lamborghini(2003, "gallardo", 303.3, true));
        inventory.add(new Lamborghini(2004, "murcielago", 404.3, true));
        inventory.add(new Lamborghini(2005, "murcielago", 505.3, true));
        inventory.add(new Lamborghini(2006, "gallardo", 506.3, true));
        inventory.add(new Lamborghini(2007, "gallardo", 507.3, true));
        inventory.add(new Lamborghini(2008, "reventon", 308.3, false));
        inventory.add(new Lamborghini(2008, "reventon", 508.3, true));
        inventory.add(new Lamborghini(2009, "gallardo", 409.3, true));
        inventory.add(new Lamborghini(2010, "murcielago", 310.3, false));
        inventory.add(new Lamborghini(2011, "aventador", 411.3, false));
        inventory.add(new Lamborghini(2012, "sesto elemento", 512.3, true));
               
    }
    /**
     * [setInventory ]
     * @param name name of the inventory
     */
    public void setInventory(ArrayList<Lamborghini> name) {
        if (name != null) {
            inventory = new ArrayList<Lamborghini>();
        }
    }
    /**
     * [getInventory ]
     * @return full inventory
     */
    public ArrayList<Lamborghini> getInventory() {
        ArrayList fullInventory = new ArrayList<Lamborghini>();
        Iterator<Lamborghini> it = inventory.iterator();
        
        while(it.hasNext()) {
            Lamborghini l = it.next();
            if (l != null) {
                fullInventory.add(l);
            }
        }
        return fullInventory;
    }
    /**
     * [setLotName ]
     * @param newName - name of the lot
     */
    public void setLotName(String newName) {
        if (newName != null) {
            if (newName.equals(TAYLOR)) {
                lotName = JASON;
            }
            else {
                lotName = newName;
            }
        }
    }
    /**
     * [getLotName ]
     * @return lot name
     */
    public String getLotName() {
        return lotName;
    }
    /**
     * [addLamborghini ]
     * @param newLamborghini if not null adds Lamborghini in inventory
     */
    public void addLamborghini(Lamborghini newLamborghini) {
        if (newLamborghini != null) {
            inventory.add(newLamborghini);
        } else {
            inventory.add(new Lamborghini());
        }
        
    }
    /**
     * [howManyBetweenTheseYears description]
     * @param  startYear  above 0yr   
     * @param  endYear    less than current year   
     * @return     all cars found between the suggested years provided
     */
    public int howManyBetweenTheseYears(int startYear, int endYear) {
        int counter = NO_VALUE;
       
        if (startYear > NO_VALUE && endYear <= CURRENT_YEAR) {
            for (Lamborghini item: inventory) {
                if (item != null) {
                    if (item.getModelYear() >= startYear && item.getModelYear() <= endYear) {
                        counter++;
                    }
                }
            }
        }
        return counter;
    }
    /**
     * [howManyAreRearWheelDrive description]
     * @return the number of cars with rear wheel drive
     */
    public int howManyAreRearWheelDrive() {
        int counter = NO_VALUE;
        Iterator<Lamborghini> it = inventory.iterator();
        
        while(it.hasNext()) {
            Lamborghini l = it.next();
            if (l != null) {
                if (l.getIsRearWheelDrive()) {
                    counter++;
                }
            }
        }
        return counter;
    }
    /**
     * [getCarsFromThisYear description]
     * @param  year          model Year
     * @return     all cars found with model year
     */
    public ArrayList<Lamborghini> getCarsFromThisYear(int year) {
        ArrayList carsInYear = new ArrayList<Lamborghini>();
        Iterator<Lamborghini> it = inventory.iterator();
        
        if (year > NO_VALUE) {
            while(it.hasNext()) {
                Lamborghini l = it.next();
                if (l != null) {
                    if (l.getModelYear() == year) {
                        carsInYear.add(l);
                    }
                }
            }
        }
        return carsInYear;
    }
    /**
     * [getCarsWithHorsepowerRange description]
     * @param  lowHP         lowest value of HP (0)
     * @param  highHP        Highest value of HP (666)
     * @return        All cars found within the range of low and high HP provided
     */
    public Lamborghini[] getCarsWithHorsepowerRange(double lowHP, double highHP) {
        Lamborghini carsFound[] = new Lamborghini[MAX_ARRAY];
        int counter = NO_VALUE;
        
        if (lowHP > NO_VALUE && highHP <= MAX_HP) {
            for (Lamborghini item: inventory) {
                if (item != null) {
                    if (item.getHorsepower() >= lowHP && item.getHorsepower() <= highHP) {
                        carsFound[counter] = item;
                        counter++;
                    }
                }
            }
        }
  
        Lamborghini carsFoundSet[] = Arrays.copyOf(carsFound, counter);
        
        return carsFoundSet; 
    }
    /**
     * [hasCarModel description]
     * @param  modelName     suggested modelName
     * @return        true if a car with the modelName exists
     */
    public boolean hasCarModel(String modelName) {
        boolean result = false;
        
        if (modelName == null) {
            return result;
        } else {
            String normalizedModelName = modelName.toLowerCase();
            for (int i = 0; i < inventory.size(); i++) {
                if (inventory.get(i) != null) {
                    if (inventory.get(i).getModelName() == normalizedModelName) {
                        result = true;
                    }
                }
            }
        }
        return result;
    }
    /**
     * [getAverageHorsepowerOfYear description]
     * @param  modelYear     suggested modelYear between 0 and current year
     * @return     the averahe horsepower for all cars within suggestedModelYear
     */
    public double getAverageHorsepowerOfYear(int modelYear) {
        int counter = NO_VALUE;
        double sumOfHorsepower = NO_VALUE;
        double averageHorsepower = NO_VALUE;
        
        if (modelYear == NO_VALUE) {
            return NO_VALUE;
        } else if (modelYear > NO_VALUE && modelYear <= CURRENT_YEAR) {
            for (Lamborghini item: inventory) {
                if (item != null) {
                    if (item.getModelYear() == modelYear) {
                        sumOfHorsepower += item.getHorsepower();
                        counter++;
                    }
                }
            }
        }
        
        averageHorsepower = sumOfHorsepower / counter;
        
        return averageHorsepower; 
    }
}
