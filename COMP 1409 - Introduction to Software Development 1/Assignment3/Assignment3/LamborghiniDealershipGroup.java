
/**
 * Write a description of class LamborghiniDealershipGroup here.
 *
 * @author Adam Dipinto
 * @version V2 July 21 2017
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

public class LamborghiniDealershipGroup
{
    private String dealershipGroupName;
    private ArrayList<LamborghiniCarLot> carLots;
    private ArrayList<Lamborghini> inventory;
    private final int NO_VALUE = 0;
    private final int MAX_ARRAY = 100;
    private final int MAX_HP = 666;
    private final int CURRENT_YEAR = 2017;
    
    /**
     * Constructor for objects of class LamborghiniDealershipGroup
     */
    public LamborghiniDealershipGroup()
    {
        carLots = new ArrayList<LamborghiniCarLot>();
    }

    /**
     * [LamborghiniDealershipGroup description]
     * @param  dealershipGroupName name of dealership
     */
     
    public void LamborghiniDealershipGroup(String dealershipGroupName)
    {
        if (dealershipGroupName != null) {
        
            LamborghiniCarLot carlot1 = new LamborghiniCarLot();
    
            carlot1.setLotName("Jason's vintage lambos.");
            
            carlot1.addLamborghini(new Lamborghini(1965, "350GT", 365.3, true));
            carlot1.addLamborghini(new Lamborghini(1966, "400GT 2+2", 366.3, false));
            carlot1.addLamborghini(new Lamborghini(1967, "MIURA", 367.3, true));
            carlot1.addLamborghini(new Lamborghini(1968, "espada", 368.3, false));
            carlot1.addLamborghini(new Lamborghini(1969, "islero", 369.3, true));
            carlot1.addLamborghini(new Lamborghini(1970, "jarama", 370.3, false));
            carlot1.addLamborghini(new Lamborghini(1971, "urraco", 371.3, false));
            carlot1.addLamborghini(new Lamborghini(1971, "urraco", 371.3, false));
            carlot1.addLamborghini(new Lamborghini(1973, "countache", 373.3, false));
            carlot1.addLamborghini(new Lamborghini(1974, "silhouette", 374.3, false));
            carlot1.addLamborghini(new Lamborghini(1975, "jalpa", 375.3, true));
            carlot1.addLamborghini(new Lamborghini(1976, "silhouette", 476.3, false));
            carlot1.addLamborghini(new Lamborghini(1977, "silhouette", 377.3, true));
            carlot1.addLamborghini(new Lamborghini(1978, "countache", 478.3, false));
            carlot1.addLamborghini(new Lamborghini(1978, "countache", 578.3, false));
            carlot1.addLamborghini(new Lamborghini(1978, "countache", 378.3, true));
            carlot1.addLamborghini(new Lamborghini(1979, "silhouette", 479.3, false));
            
            LamborghiniCarLot carlot2 = new LamborghiniCarLot();
            
            carlot2.setLotName("Taylor's brand new lambos.");
    
            carlot2.addLamborghini(new Lamborghini(2006, "gallardo", 506.3, true));
            carlot2.addLamborghini(new Lamborghini(2007, "gallardo", 507.3, true));
            carlot2.addLamborghini(new Lamborghini(2008, "reventon", 308.3, false));
            carlot2.addLamborghini(new Lamborghini(2008, "reventon", 508.3, true));
            carlot2.addLamborghini(new Lamborghini(2009, "gallardo", 409.3, true));
            carlot2.addLamborghini(new Lamborghini(2010, "murcielago", 310.3, false));
            carlot2.addLamborghini(new Lamborghini(2011, "aventador", 411.3, false));
            carlot2.addLamborghini(new Lamborghini(2012, "sesto elemento", 512.3, true));
            
            carLots.add(carlot1);
            carLots.add(carlot2);
        }

    }
    /**
     * [addCarLot description]
     * @param  carLot name of carlot
     */
    public void addCarLot(LamborghiniCarLot carLot) {
       if (carLot != null) {
            carLots.add(new LamborghiniCarLot ());        
        }
    }
    /**
     * [getTotalInventoryCount description]
     * @return number of cars in carlot
     */
    public int getTotalInventoryCount() {
       int inventoryCounter = NO_VALUE;
       int lotCounter = NO_VALUE;
      
       for (LamborghiniCarLot item: carLots) {
            if (item != null) {

                for(int i = 0; i < item.getInventory().size(); i++) {
                    inventoryCounter++;
                }
                lotCounter++;
            }
       }
        return inventoryCounter;
    }
    /**
     * [hasModelName description]
     * @param   modelName     name of the model
     * @return        true if the model name matches a car in the carlot
     */
    public boolean hasModelName(String modelName) {
        boolean result = false;
        
        
        if (modelName != null) {
            String normalizedModelName = modelName.toLowerCase();
            for (LamborghiniCarLot item: carLots) {
                if (item != null) {
                    for (int i = 0; i < item.getInventory().size(); i++) {
                        if (item.getInventory().get(i).getModelName().equals(normalizedModelName)) {
                            result = true;
                        }
                    }
                }
            }
        } else {
            return result;
        }
        
        return result;
    }
    /**
     * [getAllCarLotsWithAverageHorsepowerInRangeForYear description]
     * @param  modelYear     year of model - between 0 and current year
     * @param  lowHP         min horsepower (0)
     * @param  highHP        max horsepower (666)
     * @return        carlot with a car or multiple cars matching requirements 
     */
    public LamborghiniCarLot[] getAllCarLotsWithAverageHorsepowerInRangeForYear(int modelYear, double lowHP, double highHP) {
       LamborghiniCarLot carsFound[] = new LamborghiniCarLot[MAX_ARRAY];
       int counter = NO_VALUE;
        
        if (lowHP > NO_VALUE && highHP <= MAX_HP && modelYear > NO_VALUE && modelYear <= CURRENT_YEAR) {
            for (LamborghiniCarLot item: carLots) {
                if (item != null) {
                    for (int i = 0; i < item.getInventory().size(); i++) {
                        if (item.getInventory().get(i).getHorsepower() >= lowHP && item.getInventory().get(i).getHorsepower() <= highHP && item.getInventory().get(i).getModelYear() == modelYear) {
                            System.out.println(item.getInventory().get(i).getModelName());
                            carsFound[counter] = item;
                            counter++;
                        }
                    }
                }
            }
        }
  
        LamborghiniCarLot carsFoundSet[] = Arrays.copyOf(carsFound, counter);
        
        return carsFoundSet; 
    }
}
